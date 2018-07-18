package com.algorithm.sorting;

public class SelectionSort {

    /**
     * 特点：效率低，实现简单
     * 原理：给定数组：int[] arr={里面n个数据}；第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；第2趟，
     *       在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，
     *       将它与r[i]交换，直到全部排序完成。
     */

    /**
     * 选择排序
     * @return
     */
    public static int[] selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){  //外层循环控制排序趟数
            for(int j = i+1; j < array.length; j++){  //内层循环控制第i趟排序次数
                if(array[i] > array[j]){   //将外层循环第i个数依次与内层循环第j（j > i）个数比较，将最小的数放到i的位置
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 9, 2, 3, 10, 1, 4, 6, 13, 18, 11};
        int[] a = SelectionSort.selectionSort(array);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
