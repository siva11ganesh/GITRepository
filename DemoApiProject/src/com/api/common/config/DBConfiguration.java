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
			dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
			dataSource.setUrl(env.getProperty("spring.datasource.url"));
			dataSource.setUsername(env.getProperty("username"));
			dataSource.setPassword(env.getProperty("password"));
			return dataSource;
		} else {
			JndiObjectFactoryBean jndiBean = new JndiObjectFactoryBean();
			jndiBean.setJndiName(env.getProperty("dbjndi"));
			try {
				jndiBean.afterPropertiesSet();
			} catch (Exception e) {
				throw new SQLException();
			}
			return (DataSource) jndiBean.getObject();
		}
	}
}
