package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModifyAndReturnTest {

    MapModifyAndReturn mapModifyAndReturn;

    @Before
    public void setup(){
        mapModifyAndReturn =new MapModifyAndReturn();

    }
    @After
    public void teardown()
    {
        mapModifyAndReturn=null;
    }
    @Test
    public void testForModifyingMap() {
        MapModifyAndReturn mapModifyAndReturn = new MapModifyAndReturn();
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        Map<String, String> modifiedMap = new HashMap<>();
        modifiedMap.put("val1", "");
        modifiedMap.put("val2", "java");
        assertEquals(modifiedMap, mapModifyAndReturn.modifyMap(map));
    }

}