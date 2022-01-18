package com.teachmeskills.homework_13.Task3;

import java.util.stream.IntStream;

public class Class1 {
    public static MyFunction1<String> MyFunction1 = newString -> new StringBuilder(newString).reverse().toString();

    public static MyFunction1<Integer> MyFunction2 = n -> {
        if (n <= 1) {
            return 1;
        } else {
            return IntStream.rangeClosed(2, n).reduce((x, y) -> x * y).getAsInt();
        }
    };
}
