package com.satya.java.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MD5 {

	public static void main(String[] args) {
		String passwordToHash = "password";
		try {
			byte[] salt = getSalt();
			System.out.println("salt ::"+salt.toString());
			String securePassword = getSecurePassword(passwordToHash, salt);
			System.out.println(securePassword);
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private static String getSecurePassword(String passwordToHash, byte[] salt) {
		String generatedPassword = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			// Add password bytes to digest
			md.update(salt);
			// Get the hash's bytes
			byte[] bytes = md.digest(passwordToHash.getBytes());
			// This bytes[] has bytes in decimal format;
			// Convert it to hexadecimal format
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			// Get complete hashed password in hex format
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}

	public static byte[] getSalt() throws NoSuchAlgorithmException {
		// Always use a SecureRandom generator
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		// Create array for salt
		byte[] salt = new byte[16];
		// Get a random salt
		secureRandom.nextBytes(salt);
		// return salt
		return salt;
	}
}
