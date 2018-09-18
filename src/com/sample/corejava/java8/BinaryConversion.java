package com.sample.corejava.java8;

import java.nio.charset.Charset;
import java.util.Arrays;

public class BinaryConversion {

	public static void main(String[] args) {
		
		String example = "An21AjNikG5GB7bB!?-PIE~#._!?-I8C";
		byte[] bytess = example.getBytes(Charset.forName("ISO-8859-1"));
	    
		
		String byteString = Arrays.toString(bytess);
		
		System.err.println("To String of ByTes ->"+byteString);
	    
	   // javax.xml.bind.DatatypeConverter.parseHexBinary("e04fd020ea3a6910a2d808002b30309d")
	    
	    
	   // System.err.println(bytes.toString());
		
	    String s = new String(bytess);
	    System.out.println("Text Decryted : " + s);
	}
	
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
}
