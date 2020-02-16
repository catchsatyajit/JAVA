package com.satya.java.security;

import java.security.AlgorithmParameters;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Decrypter {
	Cipher dcipher;

	byte[] salt = new String("12345678").getBytes();
	int iterationCount = 1024;
	int keyStrength = 128;
	SecretKey key;
	byte[] iv;

	Decrypter(String passPhrase) throws Exception {
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount, keyStrength);
		SecretKey tmp = factory.generateSecret(spec);
		key = new SecretKeySpec(tmp.getEncoded(), "AES");
		dcipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	}

	public String encrypt(String data) throws Exception {
		dcipher.init(Cipher.ENCRYPT_MODE, key);
		AlgorithmParameters params = dcipher.getParameters();
		iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		byte[] utf8EncryptedData = dcipher.doFinal(data.getBytes());
		String base64EncryptedData = new sun.misc.BASE64Encoder().encodeBuffer(utf8EncryptedData);
		return base64EncryptedData;
	}

	public String decrypt(String base64EncryptedData) throws Exception {
		dcipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
		byte[] decryptedData = new sun.misc.BASE64Decoder().decodeBuffer(base64EncryptedData);
		byte[] utf8 = dcipher.doFinal(decryptedData);
		return new String(utf8, "UTF8");
	}

	public static void main(String[] arg) throws Exception {
		Decrypter decrypter = new Decrypter("ABCDEFGHIJKL");
		String encrypted = decrypter.encrypt("Styajit Roy");
		System.out.println("Encrypted value ::"+encrypted);
		String decrypted = decrypter.decrypt(encrypted);
		System.out.println("Decrypted value ::"+decrypted);
	}
}
