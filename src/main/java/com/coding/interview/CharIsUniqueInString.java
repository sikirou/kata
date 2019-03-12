package com.coding.interview;

import java.util.HashSet;
import java.util.Set;

public class CharIsUniqueInString {
    public boolean isUnique(String input) {
        if (input == null || input.length() == 0)
            return false;
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (characterSet.contains(input.charAt(i)))
                return false;
            characterSet.add(input.charAt(i));
        }
        return true;
    }
}
