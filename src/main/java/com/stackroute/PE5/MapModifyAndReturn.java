package com.stackroute.PE5;

import java.util.Map;

public class MapModifyAndReturn {
    Map<String, String> modifyMap(Map<String, String> map) {
        String value1 = map.get("val1");
        map.put("val2", value1);
        map.put("val1", "");
        return map;
    }
}
