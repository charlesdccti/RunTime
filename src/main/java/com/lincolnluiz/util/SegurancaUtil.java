package com.lincolnluiz.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SegurancaUtil {
	
	/**
	 * 
	 * @param textoClaro
	 * @return string criptografada
	 */
	public static String criptografar(String textoClaro) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(textoClaro.getBytes());
			
			return stringHexa(md.digest());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	private static String stringHexa(byte[] bytes) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
			int parteBaixa = bytes[i] & 0xf;
			if (parteAlta == 0)
				s.append('0');
			s.append(Integer.toHexString(parteAlta | parteBaixa));
		}
		return s.toString();
	}

}
