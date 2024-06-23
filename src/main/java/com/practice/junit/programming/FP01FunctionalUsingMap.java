package com.practice.junit.programming;

import java.util.List;

public class FP01FunctionalUsingMap {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,9,13,1,2,3,4,6,7,89));
        System.out.println("============================================");
        printEvenNumbersInListFunctional(List.of(12,9,13,1,2,3,4,6,7,89));
        System.out.println("============================================");
        printSquareOfNumbersInListFunctional(List.of(12,9,13,1,2,3,4,6,7,89));
        
    }

    private static void printSquareOfNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .map(num->num*num) //mapping expression, if we want to do something with the element before we print them out
                .forEach(System.out::println);
    }

    private static boolean isEven(int num){
        return num%2==0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(FP01FunctionalUsingMap::isEven) //using filter and passing function that will filter even number from the list
                .forEach(System.out::println);
    }

    private static void print(int num){
        System.out.println(num);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        //functional approach
        // we have [12,9,13,1,2,3,4,6,7,89]
        //we need to make
        //12
        //19
        //..
        integers.stream()                           //we are first streaming each element in the list
                .forEach(FP01FunctionalUsingMap::print);    //for each element we want it to use the print method, we are doing METHOD REFERENCE here

    }
}
