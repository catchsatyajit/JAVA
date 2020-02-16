package com.satya.java.io;

import java.io.File;

import com.satya.java.config.ConfigProperty;

public class SearchFileFromDirectory {

	public static void main(String[] args) {
		try {
			File dir = new File(ConfigProperty.getInstance().getProperty("searchFileDirectory"));
			String searchFile = ConfigProperty.getInstance().getProperty("searchFileName");
			CommonUtils.fileSearch(dir, searchFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean accept(File dir, String searchFile) {
		return true;
	}

}
