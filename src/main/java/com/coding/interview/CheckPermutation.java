package com.coding.interview;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class CheckPermutation {
    private final Logger LOGGER = LogManager.getLogger(CheckPermutation.class);

    public boolean isPermutation(String originalValue, String checkedValue) {
        if(LOGGER.isDebugEnabled()) {
            LOGGER.debug("check that {} is a permutation of {}", originalValue, checkedValue);
        }
        System.out.println(LOGGER.toString());
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
