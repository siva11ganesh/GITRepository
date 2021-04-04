package com.api.common.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DBRoutingConfig extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DBContextLoader.getSchemaType().getValue();
	}

	public void initDataSources(DataSource d1) {
		Map<Object, Object> dsMap = new HashMap<Object, Object>();
		dsMap.put(DBSchemaType.SCHEMA_NAME.getValue(), d1);
		this.setTargetDataSources(dsMap);
		this.setDefaultTargetDataSource(d1);
	}
}
