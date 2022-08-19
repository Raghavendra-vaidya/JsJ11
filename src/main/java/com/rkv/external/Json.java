package com.rkv.external;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Json {

    public void parseJsonFileAsString(String filePath){
        Path file = Paths.get(filePath);
        try {
            Reader reader =  Files.newBufferedReader(file);
            JsonElement jsonElement = JsonParser.parseReader(reader);
            System.out.println(jsonElement.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
