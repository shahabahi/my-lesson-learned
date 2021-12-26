package com.api.c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

//java 11
public class PredicateNotRunner {
    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 5, 8, 7);

        Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
        System.out.println("-----------------------");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        System.out.println("-----------------------");
        numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
        System.out.println("-----------------------");
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }
}

class Abc {
    static final int[] gaps(int n) {
        final int[] untrimmedResult = new int[15];
        int i = 0;
        n <<=  Integer.numberOfTrailingZeros(n) + 1;
        while (n != 0) {
            final int gapSize = Integer.numberOfTrailingZeros(n);
            untrimmedResult[i++] = gapSize;
            n <<= gapSize + 1;
        }
        final int[] result = new int[i];
        System.arraycopy(untrimmedResult, 0, result, 0, i);
        return result;
    }

    public static void main(final String[] args) {
        final int n = 32002;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Arrays.toString(gaps(n)));
    }
}
