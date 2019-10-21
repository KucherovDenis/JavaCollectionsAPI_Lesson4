package com.sbt.collections_api.BeforeGenerics;

import java.util.ArrayList;

public class CollectionWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(apples.get(i).getId());

        }
    }
}
