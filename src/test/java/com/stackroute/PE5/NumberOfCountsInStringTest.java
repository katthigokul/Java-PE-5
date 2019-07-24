package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsInStringTest {

    NumberOfCountsInString numberOfCountsInString;

    @Before
    public void setup() {
        numberOfCountsInString = new NumberOfCountsInString();

    }

    @After
    public void teardown()
    {
        numberOfCountsInString=null;
    }

    @Test
    public void givenStringShouldNumberOfRepeatedStringCounts()
    {

        Map<String,Integer> StringIntegerMap =new HashMap<>();
                StringIntegerMap.put("one",5);
        StringIntegerMap.put("two",2);
        StringIntegerMap.put("three",2);
        assertEquals(StringIntegerMap,numberOfCountsInString.countOfWords());
    }

}