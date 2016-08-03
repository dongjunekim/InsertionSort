package com.company;

public class Main {
    public Main() {
        int arr[] = new int[]{3, 5, 2, 4, 1};
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        new Main();
    }


}
