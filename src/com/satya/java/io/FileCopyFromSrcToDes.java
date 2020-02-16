package com.satya.java.io;

import java.io.File;

import com.satya.java.config.ConfigProperty;


public class FileCopyFromSrcToDes {

	public static void main(String[] args) {
		try {
			File destinationFolder = new File(ConfigProperty.getInstance().getProperty("fileCopyDestFolder"));
			File sourceFolder = new File(ConfigProperty.getInstance().getProperty("fileCopySrcFolder"));
			CommonUtils.copyFiles(sourceFolder, destinationFolder);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
