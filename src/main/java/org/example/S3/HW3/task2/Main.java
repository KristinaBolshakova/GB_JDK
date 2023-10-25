package org.example.S3.HW3.task2;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 9, 5, 6, 7, 1, 3};
        Integer[] arr2 = {5, 9, 5, 6, 7, 1, 3};

        System.out.println(Task2.compareArrays(arr1, arr2));

        String[] arr3 = {"Kris", "Andrew", "Dmitriy"};
        String[] arr4 = {"Kris", "Andrew", "Dmitriy"};;

        System.out.println(Task2.compareArrays(arr3, arr4));
    }


}
