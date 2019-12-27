package cn.ybzy.demo.sort;

import java.util.List;

/***
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array ={1,9,5,8,6,7};
        System.out.println();
        int[] arrays = bubbleSort(array);
        for(int i = 0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }

    }


    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = i; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
}
