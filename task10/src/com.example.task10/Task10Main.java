package com.example.task10;
public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {15,6,87,656,879,639,798,7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {

        int minElemNumber = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; ++i){
            if (min >= arr[i]){
                min = arr[i];
                minElemNumber = i;
            }
        }
        return minElemNumber;

    }

}