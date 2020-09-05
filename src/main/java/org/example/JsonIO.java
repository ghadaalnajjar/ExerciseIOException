package org.example;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonIO {

    private ObjectMapper objectMapper;

    public JsonIO() {
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.registerModule(new JavaTimeModule());
    }

    public void convertJavaObjectToJSON(List<Car> carList, File file) {
        try {
            objectMapper.writeValue(file, carList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Car> convertJSONToJavaObject(File file) {
        List<Car> cars = new ArrayList<>();
        try {
            cars = objectMapper.readValue(file, new TypeReference<List<Car>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }
    }