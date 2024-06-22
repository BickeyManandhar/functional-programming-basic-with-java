package com.practice.junit.programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,9,13,1,2,3,4,6,7,89));
        
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
                .forEach(FP01Functional::print);    //for each element we want it to use the print method, we are doing METHOD REFERENCE here

    }
}
