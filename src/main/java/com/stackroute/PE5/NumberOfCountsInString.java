package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCountsInString {
    Map<String, Integer> countOfWords() {
        int countOfOne = countOfWords("one");
        int countOfTwo = countOfWords("two");
        int countOfThree = countOfWords("three");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("one", countOfOne);
        stringIntegerMap.put("two", countOfTwo);
        stringIntegerMap.put("three", countOfThree);
        return stringIntegerMap;
    }
    private int countOfWords(String word) {
        String sentence = "one one -one___two,,three,one @three*one?two";
        return (sentence.length() - sentence.replaceAll(word, "").length()) / word.length();
    }
}
