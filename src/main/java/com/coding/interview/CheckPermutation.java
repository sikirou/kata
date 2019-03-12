package com.coding.interview;

import java.util.List;
import java.util.stream.Collectors;

public class CheckPermutation {

    public boolean isPermutation(String originalValue, String checkedValue) {
        if (originalValue == null || checkedValue == null
                || originalValue.length() != checkedValue.length()) {
            return false;
        }
        List<Character> characterList = checkedValue.chars().mapToObj((car) -> Character.valueOf((char) car)).collect(Collectors.toList());
        for (char car : originalValue.toCharArray()) {
            characterList.remove(Character.valueOf(car));
        }
        return characterList.isEmpty();
    }
}
