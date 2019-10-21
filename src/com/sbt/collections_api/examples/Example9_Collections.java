package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.*;

public class Example9_Collections {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("-2.-------------------------------");
        // отсортируйте содержимое в естественном порядке вызовом Collections.sort(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        Collections.sort(persons);
        PersonFirstLoad.print(persons);

        System.out.println("-3.-------------------------------");
        // обратите порядок клиентов вызовом Collections.reverse(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        Collections.reverse(persons);
        PersonFirstLoad.print(persons);

        System.out.println("-4.-------------------------------");
        // отсортируйте содержимое по телефонным номерам вызовом Collections.sort(List, Comparator)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
            }
        });
        PersonFirstLoad.print(persons);
        System.out.println("-4.-------------------------------");
        // отсортируйте содержимое по телефонным номерам вызовом Collections.sort(List, Comparator)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -1 * o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
            }
        });
        PersonFirstLoad.print(persons);
        System.out.println("-5.-------------------------------");
        // выведите минимальный по естественному порядку элемент вызовом Collections.min(List)
        // и максимальный по индексу элемент вызовом Collections.max(List, Comparator)
        System.out.println(Collections.min(persons));
        System.out.println(Collections.max(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId().compareTo(o2.getId());
            }
        }));
    }
}
