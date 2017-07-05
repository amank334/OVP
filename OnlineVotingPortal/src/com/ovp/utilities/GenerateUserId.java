package com.ovp.utilities;

import java.util.Random;

public class GenerateUserId {
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 5;

	public static String generateUserId(String email) {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}
		String e[] = email.split("@");
		Random randomGenerator = new Random();
		int num = randomGenerator.nextInt(9);
		System.out.println(e[0]);
		System.out.println(e[0].substring(0,e[0].length()-(e[0].length()<=6 ? 0 :(e[0].length()<=12 ? 4 : 7) )));
		String userId = e[0].substring(0,e[0].length() - (e[0].length()<=7 ? 0 :(e[0].length()<=12 ? 4 : 7)))+Integer.valueOf(num).toString()+ randStr.toString();
		return userId;
	}

	private static int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

}
