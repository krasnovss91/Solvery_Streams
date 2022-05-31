package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        int [] numbers = {1249, 1259, 1283, 3001, 3011};
        PrimeNumbersGroup primeNumbersGroup = new PrimeNumbersGroup();
        primeNumbersGroup.setNumbers(numbers);

        List<PrimeNumbersGroup> primes = null;
        primes.add(primeNumbersGroup);

        primes.stream().forEach(s -> System.out.println(s));
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
