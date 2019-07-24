package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringOccurenceTest {
    StringOccurence stringOccurence;

    @Before
    public void setup() {
        stringOccurence = new StringOccurence();
    }

    @After
    public void teardown() {
        stringOccurence = null;
    }

    @Test
    public void givenStringShouldReturnStringOccurence()
    {

        Map<String,Boolean>stringBooleanMap =new HashMap<>();
        stringBooleanMap.put("a",true);
        stringBooleanMap.put("b",false);
        stringBooleanMap.put("c",true);
        stringBooleanMap.put("d", false);
        assertEquals(stringBooleanMap,stringOccurence.countOfOccurence(new String[]{"a", "b", "c", "d","a", "c"}));
    }
    }
