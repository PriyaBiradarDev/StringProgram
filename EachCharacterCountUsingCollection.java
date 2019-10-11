package com.string.nt;

import java.util.HashMap;

public class EachCharacterCountUsingCollection {
	public static void main(String[] args) {
		InputcountChar("Priya is Java Developer");

	}

	private static void InputcountChar(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray

		for (char c : strArray) {
			if (hm.containsKey(c)) {
				// If char 'c' is present in hm, incrementing it's count by 1

				hm.put(c, hm.get(c) + 1);

			} else {
				// If char 'c' is not present in hm,
				// putting 'c' into hm with 1 as it's value

				hm.put(c, 1);
			}
		}

		// Printing inputString and hm

		System.out.println(inputString + " : " + hm);
	}

}