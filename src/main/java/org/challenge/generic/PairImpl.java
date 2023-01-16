    package org.challenge.generic;

public class PairImpl<K, V> implements Pair<K, V>{

    private K key;
    private V value;

    public PairImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Box<Integer>> pair = new PairImpl<>("key", new Box<>(10));
        Pair<String, String> pair2 = new PairImpl<>("key","value");
        System.out.println(pair.getKey() + " " + pair.getValue());
        Pair rawPair = pair;
        System.out.println("Compare: " + Util.<String, Box<Integer>>compare(pair, rawPair));
//        System.out.println("Compare: " + Util.compare(pair, pair2)); // error
//        Pair<Integer, Integer> nonRawPair = rawPair;
    }
}
