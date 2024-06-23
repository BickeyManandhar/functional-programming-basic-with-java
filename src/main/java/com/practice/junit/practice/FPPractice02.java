package com.practice.junit.practice;

import java.util.List;

public class FPPractice02 {
    //print the cubes of odd numbers
    //print the number of characters in each course name
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,2,4,6,5,7,8,9,123,352,134,674,123,235);
        List<String> courses = List.of("Spring Boot", "API", "Microservices", "AWS","Spring", "Kubernetes", "Docker","Java");

        numbers.stream()
                .filter(num->num%2 != 0) //first filtering odd number
                .map(oddNum->oddNum*oddNum*oddNum) //then mapping to make cube of odd number
                .forEach(System.out::println); //then printing them

        System.out.println("=========================================");

        courses.stream()
                .map(course->"Length of "+course+": "+course.length())//we use map when we need to do something on the element from list before printing
                .forEach(System.out::println);
    }
}
