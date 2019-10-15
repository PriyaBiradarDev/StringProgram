package com.string.nt;

public class FindDuplicateUsingCharAtMethod {
	public static void main(String[] args) {
		String str = "priyap  riyaz cc zz";
		String s1 = "";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					s1 = s1 + str.charAt(i);
				}

			}

		}
		System.out.println(s1);
	}
}
