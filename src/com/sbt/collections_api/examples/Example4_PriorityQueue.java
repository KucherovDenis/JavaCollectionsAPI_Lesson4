package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;
import com.sbt.collections_api.Segment;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Consumer;

public class Example4_PriorityQueue {
    public static void main(String[] args) {
        Queue<Person> persons = new PriorityQueue<>();
        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("-3.--------------------------------");
        // сформируйте новый объект PriorityQueue, с использованием внешнего Comparator,
        // который будет отдавать приоритет при извлечении клиентам из сегмента Segment.VIP
        // инициализируйте вызовом PersonFirstLoad.init(persons)
        // последовательно извлеките все элементы из PriorityQueue и проанализируйте порядок извлечения
        persons = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getSegment() == o2.getSegment()) return 0;
                else return o1.getSegment() == Segment.VIP ? -1 : 1;
            }
        });
        PersonFirstLoad.init(persons);
        while (!persons.isEmpty())
            System.out.println(persons.poll());

        System.out.println("-4.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // попробуйте извлечь 20 элементов
        // проанализируйте результат
        PersonFirstLoad.init(persons);
        for(int i =0; i < 20; i++) {
            System.out.println(persons.poll());
        }
    }
}
