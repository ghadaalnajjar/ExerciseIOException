package org.example;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ListCars {
    public static void main(String[] args) {
        JsonIO jsonIO = new JsonIO();
        List<Car> carList = Arrays.asList(
                new Car("ABC123", "Volvo", "S60", LocalDate.parse("2010-03-25")),
                new Car("DEF456", "BMW", "530", LocalDate.parse("2007-10-13")));

        File file = new File("car.json");

        jsonIO.convertJavaObjectToJSON(carList, file);
        jsonIO.convertJSONToJavaObject(file).stream().forEach(System.out::println);
    }
}
