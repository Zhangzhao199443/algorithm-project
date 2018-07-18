package com.algorithm.sorting;

public class BubbleSort {

    /**
     * 原理：比较两个相邻的元素，将值大的元素交换至右端。
     * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
     *       然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
     * 冒泡排序的优点：每进行一趟排序，就会少比较一次，因为每进行一趟排序都会找出一个较大值。
     *        如上例：第一趟比较之后，排在最后的一个数一定是最大的一个数，第二趟排序的时候，只需要比较除了最后一个数以外的其他的数，
     *        同样也能找出一个最大的数排在参与第二趟比较的数后面，第三趟比较的时候，只需要比较除了最后两个数以外的其他的数，以此类推……也就是说，没进行一趟比较，
     *        每一趟少比较一次，一定程度上减少了算法的量
     */

    /**
     * 冒泡排序
     * @return
     */
    public static int[] bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){  //外层循环控制排序趟数
            for(int j = 0; j < array.length - i -1; j++){  //内层循环控制第i趟排序次数
                if(array[j] > array[j+1]){
                    int temp = array[j];  //将最大的数放到后面
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 9, 2, 3, 10, 1, 4, 6, 13, 18, 11};
        int[] ints = BubbleSort.bubbleSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(ints[i]);
        }
    }
}
