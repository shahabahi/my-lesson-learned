package com.api.stream;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(5, (subtotal, element) -> subtotal + element);
        System.out.println(result);
    }
}
