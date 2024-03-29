package com.stackroute.PE5;

import java.util.Collections;
import java.util.List;

public class ArrayElementUpdate {
    List<String> arrayUpdate(List<String> inputList, String elementToBeReplaced, String replaceWith, String melon, String berry) {
        if (inputList.isEmpty() || inputList == null || !(inputList.contains(elementToBeReplaced)))
            return Collections.emptyList();
        inputList.set(inputList.indexOf(elementToBeReplaced), replaceWith);
        return inputList;
    }
}
