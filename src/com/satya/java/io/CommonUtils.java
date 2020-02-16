package com.satya.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class CommonUtils {
	public static void copyFiles(File sourceFolder, File destinationFolder) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			File[] listOfFiles = sourceFolder.listFiles();
			if (!destinationFolder.isDirectory()) {
				destinationFolder.mkdir();
				System.out.println("Directory has been created....");
			}
			for (File f : listOfFiles) {
				File targetFile = new File(destinationFolder + File.separator + f.getName());
				System.out.println("File writing done ::" + destinationFolder + File.separator + f.getName());
				in = new FileInputStream(f);
				out = new FileOutputStream(targetFile);
				byte[] buffer = new byte[1024];
				int length;
				// copy the file content in bytes
				while ((length = in.read(buffer)) > 0) {
					out.write(buffer, 0, length);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				System.out.println("Programme end....");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void fileSearch(File dir, String fileName) {
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith(fileName);
			}
		};
		String[] children = dir.list(filter);
		if (children == null) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}

	public static void zip(Path sourceFolderPath, Path zipPath) {
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));) {
			Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(file).toString()));
					Files.copy(file, zos);
					zos.closeEntry();
					return FileVisitResult.CONTINUE;
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

	public static void unzip(String zipFilePath, String destDir) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ZipInputStream zis = null;
		// buffer for read and write data to file
		byte[] buffer = new byte[1024];
		File dir = new File(destDir);
		// create output directory if it doesn't exist
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try {
			fis = new FileInputStream(zipFilePath);
			zis = new ZipInputStream(fis);
			ZipEntry ze = zis.getNextEntry();
			while (ze != null) {
				String fileName = ze.getName();
				File newFile = new File(destDir + File.separator + fileName);
				System.out.println("Unzipping to " + newFile.getAbsolutePath());
				// create directories for sub directories in zip
				new File(newFile.getParent()).mkdirs();
				fos = new FileOutputStream(newFile);
				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				// close this ZipEntry
				zis.closeEntry();
				ze = zis.getNextEntry();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close last ZipEntry
			try {
				if (fos != null) {
					fos.close();
				}
				if (zis != null) {
					zis.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
