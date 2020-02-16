package com.satya.java.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ConfigProperty {
	Properties configProperty = new Properties();

	private ConfigProperty() {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("file.properties");
		try {
			configProperty.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class LazyHolder {
		private static final ConfigProperty INSTANCE = new ConfigProperty();
	}

	public static ConfigProperty getInstance() {
		return LazyHolder.INSTANCE;
	}

	public String getProperty(String key) {
		return configProperty.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return configProperty.stringPropertyNames();
	}

	public boolean containsKey(String key) {
		return configProperty.containsKey(key);
	}
}
