package com.sample.corejava.basics.comparator;

import clover.org.apache.commons.lang.StringUtils;

public class SpringReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValidRequestID("M------aresj23--42"));

	}
	

	/**
	 * 
	 * @param inputString
	 * @return
	 */
	
	public static boolean isValidString(String inputString) {

		if (null != inputString && !inputString.trim().isEmpty() && !inputString.trim().equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	
	public static boolean isValidRequestID(String requestId) {
		
		if( isValidString(requestId) && StringUtils.isAlphanumeric(requestId.replaceAll("-", ""))){
			return true;
		}
			return false;
	}

}
