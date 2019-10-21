package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example8_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Person> persons = new LinkedHashMap<>();
        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте состав и порядок элементов
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
    }
}
