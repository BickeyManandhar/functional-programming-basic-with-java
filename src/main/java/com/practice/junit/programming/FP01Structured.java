package com.practice.junit.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,9,13,1,2,3,4,6,7,89));
        System.out.println("============================================");
        printEvenNumbersInListStructured(List.of(12,9,13,1,2,3,4,6,7,89));
        
    }

    private static void printEvenNumbersInListStructured(List<Integer> integers) {
        //traditional structured approach
        for(int integer:integers){
            if(integer %2 ==0) {
                System.out.println(integer);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        //traditional structured approach
        for(int integer:integers){
            System.out.println(integer);
        }

    }
}
