package org.example;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCars {
    public static void main(String[] args) {
        JsonIO jsonIO = new JsonIO();
        List<Owner> ownerList = new ArrayList<>();
        ownerList.add(new Owner(1, "Omar", LocalDate.parse("2000-01-01")));
        ownerList.add(new Owner(2, "Amar", LocalDate.parse("2010-01-01")));
        List<Car> carList = Arrays.asList(
                new Car("AB123", "Toyota", "C60", LocalDate.parse("2020-12-25"), ownerList.get(0)),
                new Car("DF456", "SAB", "330", LocalDate.parse("2017-01-13"), ownerList.get(0)));

        File file = new File("car.json");

        jsonIO.convertJavaObjectToJSON(carList, file);
        jsonIO.convertJSONToJavaObject(file).stream().forEach(System.out::println);
    }

}
