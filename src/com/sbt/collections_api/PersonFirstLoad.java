package com.sbt.collections_api;

import java.util.*;

public class PersonFirstLoad {

    public static Collection<Person> init(Collection<Person> persons) {
        persons.add(new Person(1L, "Байда Илья Вадимович", "79185551234", Segment.MASS));
        persons.add(new Person(2L, "Истамов Аскар Зохитович", "79185551219", Segment.MASS));
        persons.add(new Person(3L, "Кириловский Сергей Владимирович", "79185551232", Segment.MASS));
        persons.add(new Person(5L, "Коджаев Шамиль Амил оглы", "79185551231", Segment.MASS));
        persons.add(new Person(4L, "Нешин Антон Сергеевич", "79185551230", Segment.MASS));
        persons.add(new Person(6L, "Орловский Николай Михайлович", "79185551221", Segment.VIP));
        persons.add(new Person(7L, "Павлов Иван Геннадьевич", "79185551228", Segment.MASS));
        persons.add(new Person(8L, "Романюта Александр Сергеевич", "79185551227", Segment.MASS));
        persons.add(new Person(9L, "Комягин Денис Михайлович", "79185551226", Segment.MASS));
        persons.add(new Person(9L, "Комягин Денис Михайлович", "79185551226", Segment.MASS));
        persons.add(new Person(10L, "Чернявский Александр Игоревич", "79185551225", Segment.VIP));
        persons.add(new Person(11L, "Шмалько Светлана Григорьевна", "79185551224", Segment.MASS));
        persons.add(new Person(12L, "Малеванный Михаил Сергеевич", "79185551223", Segment.MASS));
        persons.add(new Person(13L, "Малахова Елена Александровна", "79185551222", Segment.MASS));
        persons.add(new Person(14L, "Плешаков Владимир Владимирович", "79185551229", Segment.MASS));
        persons.add(new Person(15L, "Жовнир Екатерина Юрьевна", "79185551220", Segment.MASS));
        persons.add(new Person(16L, "Смолянинова Дарья Дмитриевна", "79185551233", Segment.VIP));

        return persons;
    }

    public static Map<String, Person> init(Map<String, Person> persons) {
        persons.put("1", new Person(1L, "Байда Илья Вадимович", "79185551234", Segment.MASS));
        persons.put("2", new Person(2L, "Истамов Аскар Зохитович", "79185551233", Segment.MASS));
        persons.put("3", new Person(3L, "Кириловский Сергей Владимирович", "79185551232", Segment.MASS));
        persons.put("5", new Person(5L, "Коджаев Шамиль Амил оглы", "79185551231", Segment.MASS));
        persons.put("4", new Person(4L, "Нешин Антон Сергеевич", "79185551230", Segment.MASS));
        persons.put("6", new Person(6L, "Орловский Николай Михайлович", "79185551229", Segment.VIP));
        persons.put("7", new Person(7L, "Павлов Иван Геннадьевич", "79185551228", Segment.MASS));
        persons.put("8", new Person(8L, "Романюта Александр Сергеевич", "79185551227", Segment.MASS));
        persons.put("9", new Person(9L, "Комягин Денис Михайлович", "79185551226", Segment.MASS));
        persons.put("10", new Person(10L, "Чернявский Александр Игоревич", "79185551225", Segment.VIP));
        persons.put("11", new Person(11L, "Шмалько Светлана Григорьевна", "79185551224", Segment.MASS));
        persons.put("12", new Person(12L, "Малеванный Михаил Сергеевич", "79185551223", Segment.MASS));
        persons.put("13", new Person(13L, "Малахова Елена Александровна", "79185551222", Segment.MASS));
        persons.put("14", new Person(14L, "Плешаков Владимир Владимирович", "79185551221", Segment.MASS));
        persons.put("15", new Person(15L, "Жовнир Екатерина Юрьевна", "79185551220", Segment.MASS));
        persons.put("16", new Person(16L, "Смолянинова Дарья Дмитриевна", "79185551219", Segment.VIP));

        return persons;
    }

    public static void print(Collection<Person> persons) {

        Iterator<Person> it = persons.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public static void print(Map<String, Person> persons) {

        Iterator it = persons.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
