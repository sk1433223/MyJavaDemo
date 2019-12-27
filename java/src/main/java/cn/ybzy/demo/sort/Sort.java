package cn.ybzy.demo.sort;

public class Sort {

    static int [] array = {1,5,8,4,3,9};

    public static void main(String[] args) {
        getMaxValue(array);
    }

    /**
     * 获取最大值MAX
     * @param array
     * @return max
     */
    public static int getMaxValue(int [] array){
        int max = 0;
        for (int i = 0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    public static void mySwap(int pa, int pb) {
        int tmp = pa;
        pa = pb;
        pb = tmp;
    }
}
