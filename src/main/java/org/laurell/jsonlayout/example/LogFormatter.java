package org.laurell.jsonlayout.example;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.layout.ExtendedJson;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LogFormatter implements ExtendedJson {
    HashMap<String, Object> mixedIn = new HashMap<>();
    Random r = new Random();

    public LogFormatter() {
        mixedIn.put("myCustomKey", "myCustomValue");
        mixedIn.put("anotherKey", r.nextInt(200));
    }

    public Map<String, Object> getMixedFields(LogEvent logEvent) {
        return mixedIn;
    }
}
