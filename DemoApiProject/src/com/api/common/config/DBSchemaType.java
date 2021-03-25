package com.api.common.config;

import java.util.Properties;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public enum DBSchemaType {
	SCHEMA_NAME;

	final static Logger logger = (Logger) LoggerFactory.getLogger(DBSchemaType.class);
	private static final String PATH = "/application.properties";
	private static Properties properties;
	private String value;

	private void init() {
		if (properties == null) {
			properties = new Properties();
			try {
				properties.load(DBSchemaType.class.getResourceAsStream(PATH));
			} catch (Exception e) {
				logger.error("Error Occured while loading Database::", e);
				System.exit(1);
			}
		}
		value = (String) properties.get(this.toString());
	}

	public String getValue() {
		if (value == null) {
			init();
		}
		return value;
	}
}
