package org.growthTech.test.util;

public class TestReg {
	public static void main(String[] args) {
		final String REG_PATTERN = ".+-.+-.+";
		
		String test1 = "str1-str2-str3";
		String test2 = "中文1-中文2-中文3";
		String test3 = "test";
		String test4 = "test1-test2";
		
		System.out.println(test1.matches(REG_PATTERN));
		System.out.println(test2.matches(REG_PATTERN));
		System.out.println(test3.matches(REG_PATTERN));
		System.out.println(test4.matches(REG_PATTERN));
		
	}

}
