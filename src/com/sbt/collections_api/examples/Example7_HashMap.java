package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.HashMap;
import java.util.Map;

public class Example7_HashMap {
    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();
        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте состав и порядок элементов
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
    }
}
