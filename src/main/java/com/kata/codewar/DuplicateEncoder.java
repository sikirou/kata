package com.kata.codewar;

public class DuplicateEncoder {

    public String evaluate(String input) {
        StringBuilder valueToReturn = new StringBuilder();
        String lowerCase = input.toLowerCase();
        char[] inputTab = lowerCase.toCharArray();
        for (int i = 0; i < inputTab.length; i++) {
            char currentChar = inputTab[i];
            boolean isAtleat_two_occurences = false;
            for (int j = 0; j < inputTab.length; j++) {
                if (i != j && currentChar == inputTab[j]) {
                    isAtleat_two_occurences = true;
                }
            }
            if (isAtleat_two_occurences) {
                valueToReturn.append(")");
            } else {
                valueToReturn.append("(");
            }
        }
        return valueToReturn.toString();
    }

}
