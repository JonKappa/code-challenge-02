package com.codedifferently;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        Map<String, Integer> countLetters = new HashMap<>();

        String[] inputArray = input.toLowerCase().split("");
        for (String l : inputArray) {
            if (countLetters.containsKey(l)) {
                Integer count = countLetters.get(l);
                count++;

                countLetters.put(l, count);
            }
            else {
                countLetters.put(l, 1);
            }
        }


        return countLetters.get(letter);
    }


}
