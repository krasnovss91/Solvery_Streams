package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1249, 1259, 1283, 3001, 3011};
        PrimeNumbersGroup primeNumbersGroup = new PrimeNumbersGroup();
        primeNumbersGroup.setNumbers(numbers);

        List<PrimeNumbersGroup> primes = new ArrayList<>();
        primes.add(primeNumbersGroup);


        System.out.println(primes.stream().min(Comparator.comparing(PrimeNumbersGroup::getNumber)).get().getNumber());

        System.out.println(primes.stream().mapToInt(it -> it.getNumber()).min());
        System.out.println(primes.stream().flatMapToInt(it -> Arrays.stream(it.getNumbers())).min().getAsInt());
        //пересчитать сумму элементов каждого элемента и вывести наименьшую
        //представить каждый элемент как массив (например, toArray)
        // write your code here
        /*
        Необходимо из списка primes найти число, для которого сумма цифр будет минимальна, например, для
List<PrimeNumbersGroup> primes = ...;
1249 1259 1283 3001 3011

это будет 3001 (3 + 0 + 0 + 1 = 4)

Использовать stream API
         */
    }
}
