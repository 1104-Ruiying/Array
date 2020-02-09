package com.thoughtworks;

public class ArrayPractice4 {


    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int len = array.length;
        int num=0;
        int [] arrayA = new int[len+1];
        for (int i = 0; i < array.length; i++) {
            if(array[i]< number){
                arrayA[num]=array[i];
                num ++;
                if(num==len){
                    arrayA[num]=number;
                }
            }else{
                arrayA[num] =number;
                num++;
                for(int a=i;a<len;a++){
                    arrayA[num]=array[a];
                    num++;
                }break;
            }
        }

        return arrayA;
    }
}
