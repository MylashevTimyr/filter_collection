package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Filter doubleFilter = new Filter() {

            @Override
            public Object apply(Object o) {
                if (o instanceof Integer) {
                    return (Integer) o * 2;
                }
                return o;
            }
        };
        Integer[] result = CollectionFilter.filter(numbers, doubleFilter);
        System.out.println(Arrays.toString(result));
    }
}
