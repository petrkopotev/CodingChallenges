package org.challenge.generic;

import java.util.Arrays;
import java.util.List;

public class Box<T> implements Comparable<T>{

    private T t;

    public Box(T t) {
       this.t = t;
    }

    public <U extends Number> Box(T t, U u) {
        this(t);
        System.out.println("Calling Box constructor with: " + u);
    }

    public static void set(Box<?> to, Box<?> from) {
        helperSet(to, from);
//        to.set(from.get());
    }

    private static <T, U> void helperSet(Box<T> to, Box<U> from) {
        to.set((T) from.get());
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static <U extends Comparable<U>> int countGreaterThan(U[] array, U elem) {
        int counter = 0;
        for(U u : array) {
            if (u.compareTo(elem) > 0) {
                counter++;
            }
        }

        return counter;
    }

    public static <U extends Comparable<U>> boolean compareTo(Box<U> b1, Box<U> b2) {
        if (b1.get().compareTo(b2.get()) > 0) {
            return true;
        } else if (b1.get().compareTo(b1.get()) == 0) {
            return false;
        } else {
            throw new RuntimeException("Unexpected error");
        }
    }

    public static double calculate(Box<? extends Number> b) {
        return b.get().doubleValue();
    }

    public static void capture(Box<?> b) {
        captureHelper(b);
    }

    private static <T> void captureHelper(Box<T> b) {
        b.set(b.get());
    }

    public static void main(String[] args) {
        Box<? extends Number> boxInt = new Box<>(Integer.parseInt("10"));
        Box<? extends Number> boxInt2 = new Box<Number>(Integer.valueOf(100));
        Box.set(boxInt, boxInt2);
//        boxInt.set(103);;
        Box<? extends String> boxWildCard = new Box<>(new String("sdfsd"));

        Box.calculate(boxInt);
        // Box.calculate(boxWildCard); // error
        Box<String> boxStr =  new Box<>("Hello");
        Box<String> box = new Box<>("hi hi", 10);
        System.out.print(boxStr.get());
        boxStr.set(" world");
        System.out.println(boxStr.get());
//        Box.compareTo(boxInt, boxInt);
        Util.testInheritance(boxInt);
        Util.testInheritance(boxStr);

        List<? super Integer> list = Arrays.asList(1,2,3);
//        list.add(10.0);
    }

    @Override
    public String toString() {
        return "Box(" + get() + ")";
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
