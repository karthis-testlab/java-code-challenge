package com.string.challenges;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {

		String sentence = "my name is Pratima";

		for (String word : sentence.split(" ")) {
			System.out.print(reverseWord(word) + " ");
		}

	}

	private static String reverseWord(String word) {
		char[] charArray = word.toCharArray();
		int left = 0, right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left++] = charArray[right];
			charArray[right--] = temp;
		}
		return new String(charArray);
	}

}