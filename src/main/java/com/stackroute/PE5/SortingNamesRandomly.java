package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class SortingNamesRandomly implements Comparator<String> {

    List<String> getSetToSortedList(Set<String> setOfNames) {
        List<String> unOrderedList = new ArrayList<>(setOfNames);
        unOrderedList.sort(new  SortingNamesRandomly());
        return unOrderedList;
    }

    @Override
    public int compare(String firstString, String secondString) {
        if (firstString.compareTo(secondString) < 0) {
            return -1;
        } else if (firstString.compareTo(secondString) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
