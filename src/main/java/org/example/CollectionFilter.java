package org.example;

import java.lang.reflect.Array;

public class CollectionFilter {
    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] inputArray, Filter filter) {
        if (inputArray == null || filter == null) {
            throw new IllegalArgumentException("Входной массив и фильтр не могут быть равны null.");
        }
        T[] resultArray = (T[]) Array.newInstance(inputArray.getClass().getComponentType(), inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = (T) filter.apply(inputArray[i]);
        }
        return resultArray;
    }
}