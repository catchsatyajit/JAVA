package com.satya.java.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.apache.cxf.common.util.Base64Exception;
import org.apache.cxf.common.util.Base64Utility;

public class PBEWithMD5AndDES {
	Cipher ecipher;
	Cipher dcipher;
	// 8-byte Salt
	byte[] salt = { (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32, (byte) 0x56, (byte) 0x35, (byte) 0xE3,
			(byte) 0x03 };
	// Iteration count
	int iterationCount = 19;
	private static final Random RANDOM = new SecureRandom();

	public PBEWithMD5AndDES() {
	}

	public String encrypt(String secretKey, String plainText) throws InvalidKeySpecException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException,
			UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		KeySpec keySpec = new PBEKeySpec(secretKey.toCharArray(), salt, iterationCount);
		SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
		// Prepare the parameter to the ciphers
		AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
		// Enc process
		ecipher = Cipher.getInstance(key.getAlgorithm());
		ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
		String charSet = "UTF-8";
		byte[] in = plainText.getBytes(charSet);
		byte[] out = ecipher.doFinal(in);
		// String encStr = new sun.misc.BASE64Encoder().encode(out);
		String encStr = Base64Utility.encode(out);
		return encStr;
	}

	public String decrypt(String secretKey, String encryptedText) throws NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException,
			UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, IOException {
		// Key generation for enc and desc
		KeySpec keySpec = new PBEKeySpec(secretKey.toCharArray(), salt, iterationCount);
		SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
		// Prepare the parameter to the ciphers
		AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
		// Decryption process; same key will be used for decr
		dcipher = Cipher.getInstance(key.getAlgorithm());
		dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

		// byte[] enc = (new
		// sun.misc.BASE64Decoder()).decodeBuffer(encryptedText);
		byte[] enc = null;
		try {
			enc = Base64Utility.decode(encryptedText);
		} catch (Base64Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] utf8 = dcipher.doFinal(enc);
		String charSet = "UTF-8";
		String plainStr = new String(utf8, charSet);
		return plainStr;
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
		PBEWithMD5AndDES p = new PBEWithMD5AndDES();
		String originalPassword = "12wq!@WQ";
		String PASSWORD = null;
		String SALT = null;
		String GUID = null;
		String decryptPassword = null;
		try {
			SALT = PBEWithMD5AndDES.generateRandomPassword(80);
			GUID = PBEWithMD5AndDES.generateRandomPassword(80);
			PASSWORD = p.encrypt(SALT + GUID, originalPassword);
			decryptPassword = p.decrypt(SALT + GUID, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Original Password  :" + originalPassword);
		System.out.println("Encrypted Password :" + PASSWORD);
		System.out.println("Decrypted Password :" + decryptPassword);
	}
}
