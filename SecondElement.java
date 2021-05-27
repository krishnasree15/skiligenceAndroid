package com.company;

public class SecondElement {
    public static void main(String[] args) {


        int[] arr = {5, 4, 3, 2, 1, 5};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

        System.out.println(slargest);

    }
}
