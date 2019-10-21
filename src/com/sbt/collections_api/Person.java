package com.sbt.collections_api;

/**
 * Учётная запись клиента
 */
public class Person implements Comparable<Person> {
    /**
     * Идентификатор
     */
    private Long id;

    /**
     * ФИО
     */
    private String name;

    /**
     * Телефонный номер
     */
    private String phoneNumber;

    /**
     * Сегмент обслуживания
     */
    private Segment segment;

    public Person(Long id, String name, String phoneNumber, Segment segment) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.segment = segment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", segment=" + segment +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getName().equals(((Person) obj).getName());
    }

    @Override
    public int compareTo(Person o) {
        return this.getPhoneNumber().compareTo(o.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
}
