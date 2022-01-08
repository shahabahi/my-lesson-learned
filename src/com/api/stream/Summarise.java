package com.api.stream;

import com.api.camparablecomparator.Laptop;

import java.util.*;
import java.util.stream.Collectors;

public class Summarise {
    public static void main(String[] args) {
        Item item1 = new Item(1, 10);
        Item item2 = new Item(2, 15);
        Item item3 = new Item(3, 25);
        Item item4 = new Item(4, 40);

        List<Item> items = Arrays.asList(item1, item2, item3, item4);
        Integer sum = items.stream()
                .map(x -> x.getPrice())
                .reduce(0, Integer::sum);
        System.out.println(sum);

        Integer sum1 = items.stream()
                .map(x -> x.getPrice())
                .reduce(0, ArithmeticUtils::add);
        System.out.println(sum1);

       Integer max= items.stream()
                .max(Comparator.comparing(Item::getPrice)).get().getPrice();
        System.out.println("max:" +max);

        Comparator<Item> com = (o1, o2) -> {
            if (o1.getPrice() < o2.getPrice())
                return 1;
            else
                return -1;
        };
        Collections.sort(items,com);
        System.out.println(items);


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum2 = integers.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum2);

        Integer sum3 = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum3);
    }
    public static class ArithmeticUtils {

        public static int add(int a, int b) {
            return a + b;
        }
    }
}
