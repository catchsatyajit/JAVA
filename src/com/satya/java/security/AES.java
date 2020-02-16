package com.satya.java.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

public class AES {
	private static SecretKeySpec secretKey;
	private static byte[] key;

	public static void setKey(String myKey) {
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String encrypt(String strToEncrypt, String secret)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = null;
		try {
			setKey(secret);
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decrypt(String strToDecrypt, String secret)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = null;
		try {
			setKey(secret);
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		final String secretKey = "ssshhhhhhhhhhh!!!!";

		String originalString = "howtodoinjava.com";
		String encryptedString;
		try {
			encryptedString = AES.encrypt(originalString, secretKey);
			
			String decryptedString = AES.decrypt(encryptedString, secretKey);

			System.out.println(originalString);
			System.out.println(encryptedString);
			System.out.println(decryptedString);
		} catch (IllegalBlockSizeException | BadPaddingException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
