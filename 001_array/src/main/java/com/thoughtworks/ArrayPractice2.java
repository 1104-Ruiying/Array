package com.thoughtworks;
/**
 * 把给定数组中的最大值保存到数组中的第1个元素且原第一个数换到最大值的位置
 */
public class ArrayPractice2 {
    public static void main(String[] args) {
        exchange();
    }
    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        int max = array[0];
        int temp, n=0;
        System.out.println("原数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max =array[i];
                n=i;
            }
        }
        temp =array[0];
        array[0]= max;
        array[n] =temp;
        System.out.println(" ");
        System.out.println("换位后：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        return array;
    }
}