package com.kata.codewar;

public class Abbreviator {

	public String abbreviate(String word) {
		StringBuilder stringBuilder = new StringBuilder();
		String[] word_splited = word.split("[^\\w]"); 
		if (word.length() <= 3) {
			return word;
		}
		int cpt = 0 ; 
		for (String each_word : word_splited) {
			if (each_word.length() > 3) {
				stringBuilder.append("" + each_word.charAt(0) + (each_word.length() - 2)
						+ each_word.charAt(each_word.length() - 1));
			} else {
				stringBuilder.append(each_word);
			}
			int indexOfEach_word = word.indexOf(each_word, cpt) ; 
			Character character = null ;
			if (word.length() > indexOfEach_word + each_word.length()) {
				character= word.charAt(indexOfEach_word + each_word.length());
				cpt+=1;
			}
			cpt+=each_word.length(); 
			if(character!=null && !Character.isAlphabetic(character) && (cpt!=word.length()|| !Character.isWhitespace(character))){
				stringBuilder.append(character);
			}
		}
		return stringBuilder.toString();
	}

}
