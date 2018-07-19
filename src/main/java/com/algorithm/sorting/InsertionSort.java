package com.algorithm.sorting;

public class InsertionSort {

    /**
     * 特点：效率低，容易实现。
     * 思想：将数组分为两部分，将后部分元素逐一与前部分元素比较，如果前部分元素比array[i]大，就将前部分元素往后移动。
     *       当没有比array[i]大的元素，即是合理位置，在此位置插入array[i]
     * 原理：假设我们输入的是 “53，27，36，15，69,  42” 我们从第二个数字开始，这个数字是27，我们的任务只要看看27有没有正确的位置，
     *       我们的做法是和这个数字左边的数字来比，因此我们比较27和53，27比53小，所以我们就交换27和53，原来的排列就变成了
     *       “27, 53, 36, 15, 69, 42 ”
     *       接下来，我们看第3个数字有没有在正确的位置。这个数字是36，它的左边数字是53，36比53小，所以我们将36和53交换，排列变成了
     *       “27,36, 53, 15, 69, 42 "我们必须继续看36有没有在正确的位置，36的左边是27，27比36小，36就维持不动了,这时候排序还是
     *       “27, 36, 53, 15, 69, 42 "。
     * @param array
     * @return
     */

    public static int[] insertionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j >0; j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 15, 5, 8, 9, 2, 3, 10, 1, 4, 6, 13, 18, 11};
        int[] ints = InsertionSort.insertionSort(array);
        for(int i : ints){
            System.out.println(i);
        }
    }
}
