package com.api.common.config;

import java.io.Serializable;

public class DBContextLoader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ThreadLocal<DBSchemaType> contextLoader =

			new ThreadLocal<DBSchemaType>();

	public static void setSchemaType(DBSchemaType dbSchema) {
		contextLoader.set(dbSchema);
	}

	public static DBSchemaType getSchemaType() {
		return (DBSchemaType) contextLoader.get();
	}

	public static void ClearSchemaType() {
		contextLoader.remove();
	}
}
