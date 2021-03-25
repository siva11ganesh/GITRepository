package com.api.common.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

public class DBConfiguration {

	String jndiEnable = "Y";
	@Autowired
	Environment env;

	@Autowired
	@Bean(name = "dataSource")
	public DataSource getDataSource(DataSource dataSource1) {
		DBRoutingConfig dataSrce = new DBRoutingConfig();
		dataSrce.initDataSources(dataSource1);
		return dataSrce;
	}

	@Bean(name = "dataSource1")
	public DataSource myDataSource() throws Exception {
		if (!jndiEnable.equalsIgnoreCase(env.getProperty("jndi.Enable"))) {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName(null);
			dataSource.setUrl(null);
			dataSource.setUsername(null);
			dataSource.setPassword(null);
			return dataSource;
		} else {
			JndiObjectFactoryBean jndiBean = new JndiObjectFactoryBean();
			jndiBean.setJndiName(null);
			try {
				jndiBean.afterPropertiesSet();
			} catch (Exception e) {
				throw new SQLException();
			}
			return (DataSource) jndiBean.getObject();
		}
	}
}
