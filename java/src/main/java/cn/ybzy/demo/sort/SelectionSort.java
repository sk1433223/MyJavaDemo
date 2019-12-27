package cn.ybzy.demo.sort;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int [] array ={1,9,5,8,6,7};
        System.out.println(selectionSort(array).toString());

            }

    /**
     * 选择排序
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];//换位置
            array[i] = temp;
        }
        return array;
    }
}
