package com.thoughtworks;

public class ArrayPractice1 {
    public ArrayPractice1() {
    }

    public static void main(String[] args) {
        printArrayReverse();
    }

    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int i = 0;

        for(int max = array.length - 1; i < max; --max) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            ++i;
        }

        for(i = 0; i < array.length; ++i) {
            System.out.print(array[i] +" ");
        }

    }
}