package com.satya.java.security;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
/**
 * Advanced Encryption Standard(AES)
 */
public class AES256 {
	private static int iterationCount = 1024;
	private static int keyStrength = 128;
	private static final Random RANDOM = new SecureRandom();

	public static String encrypt(String strToEncrypt, String secretKey, String SALT) {
		try {

			byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			IvParameterSpec ivspec = new IvParameterSpec(iv);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), SALT.getBytes(), iterationCount, keyStrength);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKEY = new SecretKeySpec(tmp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKEY, ivspec);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decrypt(String strToDecrypt, String secretKey, String SALT) {

		try {
			byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			IvParameterSpec ivspec = new IvParameterSpec(iv);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), SALT.getBytes(), iterationCount, keyStrength);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKEY = new SecretKeySpec(tmp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKEY, ivspec);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String generateRandomPassword(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int c = RANDOM.nextInt(62);
			if (c <= 9) {
				sb.append(String.valueOf(c));
			} else if (c < 36) {
				sb.append((char) ('a' + c - 10));
			} else {
				sb.append((char) ('A' + c - 36));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String secretKey = "un5pdxOw1glKratBgIlL5w";
		String originalString = "howtodoinjava.com";
		String encryptedString = "";
		String decryptedString = "";
		String SALT = generateRandomPassword(80);
		try {
			encryptedString = AES256.encrypt(originalString, secretKey, SALT);
			decryptedString = AES256.decrypt(encryptedString, secretKey, SALT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("originalString   ::" + originalString);
		System.out.println("encryptedString  ::" + encryptedString);
		System.out.println("decryptedString  ::" + decryptedString);

	}

}
