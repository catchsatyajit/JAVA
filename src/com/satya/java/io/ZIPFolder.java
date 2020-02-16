package com.satya.java.io;

import java.io.File;
import java.nio.file.Paths;

import com.satya.java.config.ConfigProperty;

public class ZIPFolder {

	public static void main(String[] args) {

		try {
			String folderToZip = ConfigProperty.getInstance().getProperty("fileTODOZipDirectory");
			File zipDirectory = new File(ConfigProperty.getInstance().getProperty("zipFileDirectory"));
			if (!zipDirectory.isDirectory()) {
				zipDirectory.mkdir();
				System.out.println("Directory created");
			}
			String zipName = zipDirectory + File.separator + "a.zip";
			CommonUtils.zip(Paths.get(folderToZip), Paths.get(zipName));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Programme END........");
		}

	}

}
