package org.challenge.generic;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey() == p2.getKey() && p1.getValue() == p2.getValue();
    }

    public static <T>void testInheritance(Box<T> c) {

    }
}
