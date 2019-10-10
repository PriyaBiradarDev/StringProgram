package com.string.nt;

public class EachCharacterCount {

	public static void main(String[] args) {
		String s1 = "priyaBiradar";

		Test.getEachCharacterCount(s1);
	}

}

class Test {
	// hear we have declared size of ascii
	private static final int MAX_CHAR = 256;

	static void getEachCharacterCount(String s1) {

		int count[] = new int[MAX_CHAR];
		
		//we have find out the character count 
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}

		char[] ch = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ch[i] = s1.charAt(i);
			int index = 0;
			for (int j = 0; j <= i; j++) {

				if (s1.charAt(i) == ch[j])
					index++;
			}
			if (index == 1) {
				System.out.println("Number of Occurrence of " + s1.charAt(i) + " is:" + count[s1.charAt(i)]);
			}

		}

	}

}