package com.thoughtworks;
/**
 * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
 */
public class ArrayPractice3 {

    public static void main(String[] args) {
        int[] arrayA = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        filterZero(arrayA);
    }

    public static int[] filterZero(int[] arrayA) {
        int num1=0;
        for (int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] !=0){
                num1++;
            }
        }
        int [] arrayB= new int [num1];//新的数组长度赋给新的数组，默认值都为0
        int num2 = 0;//给一个指针
        for (int j = 0; j < arrayA.length; j++) {
            if(arrayA[j] !=0){
                arrayB[num2]= arrayA[j];
                System.out.print(arrayB[num2] + " ");
                num2++;
            }
        }
        return arrayB;
    }
}