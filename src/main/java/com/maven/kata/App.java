package com.maven.kata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassA.print();
        ClassB.print();

        String jsonObject = "{\"brand\":\"ford\", \"doors\":5}";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String, Object> jsonMap = objectMapper.readValue(jsonObject,
                    new TypeReference<Map<String,String>>(){});
            jsonMap.keySet().forEach(key -> System.out.println( key + " ->" + jsonMap.get(key)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
