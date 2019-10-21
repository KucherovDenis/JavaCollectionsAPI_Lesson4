package com.sbt.collections_api.BeforeGenerics;

import java.util.ArrayList;

public class CollectionBeforeGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        apples.add(new Orange());
        for (int i = 0; i < 4; i++) {
            ((Apple) apples.get(i)).getId();
        }
    }
}
