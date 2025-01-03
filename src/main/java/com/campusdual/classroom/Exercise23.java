package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> map = new HashMap<>();
        Person persona = new Person("John", "Smith");
        Teacher profesora = new Teacher("María", "Montessori", "Educación");
        PoliceOfficer policia = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor doctor = new Doctor("Gregory", "House", "Nefrología e infectología");

        map.put("person", persona);
        map.put("teacher", profesora);
        map.put("police", policia);
        map.put("doctor", doctor);

        return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", ");
            entry.getValue().getDetails();
        }
    }

    public static void main(String[] args) {
        Map<String, Person> personMap = createHashMap();
        Person nuevoPolicia = new PoliceOfficer("Charles", "Boyle", "B-99");
        addMapValue(personMap, "PoliceOfficer", nuevoPolicia);

    }
}
