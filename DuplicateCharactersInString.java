package com.string.nt;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String s1 = "PriyaPiyu";
		findDuplicateChar(s1);
	}

	static void findDuplicateChar(String s1) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = s1.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}

		}
		// Getting a Set containing all keys of hm
		
		Set<Character> charsInString = hm.keySet();

		System.out.println("Duplicate Characters In " + s1);

		// Iterating through Set 'charsInString'
		for (char cc : charsInString) {
			if (hm.get(cc) > 1) {
				// If any char has a count of more than 1, printing it's count

				System.out.println(cc + " : " + hm.get(cc));
			}
		}

	}
}

output==
Duplicate Characters In PriyaPiyu
P : 2
i : 2
y : 2

