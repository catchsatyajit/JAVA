package com.satya.java.io;

import com.satya.java.config.ConfigProperty;

public class UnZIPFiles {

	public static void main(String[] args) {
		String zipDirectory = ConfigProperty.getInstance().getProperty("fileTODOUnZIP");
		String destinaltionDirectory = ConfigProperty.getInstance().getProperty("fileUnzipLocation");
		CommonUtils.unzip(zipDirectory, destinaltionDirectory);
	}

}
