package org.challenge.generic;

public class List<T> implements Comparable<T> {

    private static class A {
        A() {
            System.out.println("Calling A");
        }
    }

    private static class B extends A {
        B() {
            super();
            System.out.println("calling B");
        }
    }

    private Object[] t;
    private Class<?> clazz;
    private int index = 0;

    public List() {
        t = new Object[10];
        clazz = t.getClass();
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void add(T t) {
        this.t[index++] = t;
    }

    public T get(int index) {
        return (T) this.t[index];
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    public static void lowerBoundTest(List<? extends A> b) {

    }

    public static void main(String[] args) {
        List<? extends Number> listOfNumbers = new List<>();
        // listOfNumbers.add(Integer.valueOf(10)); // error: cannot set
        Number number = listOfNumbers.get(0); // can be anything extended from Number
        Class<?> clazz = listOfNumbers.getClazz();

        List<? super A> listOfSuperA = new List<>();
        List<? super B> listOfSuperB = new List<>();
        List<A> listOfA = new List<>();
        List<B> listOfB = new List<>();

//        lowerBoundTest(listOfSuperA);
//        lowerBoundTest(listOfSuperB);
        lowerBoundTest(listOfA);
        lowerBoundTest(listOfB);

//        listOfIntegers.add(new B());
//        listOfIntegers.add(new A());

        // A a = listOfIntegers.get(0); // error. cannot get element from list instantiated with lower bound wild card parameter
        // B b = listOfIntegers.get(0);

//        listOfIntegers.add();
    }
}
