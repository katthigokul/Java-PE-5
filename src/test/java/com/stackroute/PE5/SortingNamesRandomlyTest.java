package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortingNamesRandomlyTest {
    SortingNamesRandomly sortingNamesRandomly;

    @Before
    public void setup() {
        sortingNamesRandomly = new SortingNamesRandomly();

    }

    @After
    public void teardown()
    {
        sortingNamesRandomly=null;
    }

    @Test
    public void givenNamesShouldReturnSortingSet() {
        SortingNamesRandomly sortSet = new SortingNamesRandomly();
        Set<String> unorderedSetOfNames = new HashSet<>();
        unorderedSetOfNames.add("Harry");
        unorderedSetOfNames.add("Olive");
        unorderedSetOfNames.add("Alice");
        unorderedSetOfNames.add("Bluto");
        unorderedSetOfNames.add("Eugene");
        assertEquals(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"), sortSet.getSetToSortedList(unorderedSetOfNames));

    }
}