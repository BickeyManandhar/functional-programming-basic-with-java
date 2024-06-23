package com.practice.junit.practice;

import java.util.List;

public class FPPractice01 {
    //print only odd numbers from the list
    //print all courses individually
    //print courses containing the word "Spring"
    //print courses whose name has atleast 4 letters
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,321,5324,21313,21312,122,332,765,909);
        List<String> courses = List.of("Spring Boot", "API", "Microservices", "AWS","Spring", "Kubernetes", "Docker","Java");

        numbers.stream()
                .filter(num -> num%2!=0)
                .forEach(System.out::println);

        courses.stream()
                .forEach(System.out::println);

        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()
                .filter(course->course.length()>=4)
                .forEach(System.out::println);

    }
}
