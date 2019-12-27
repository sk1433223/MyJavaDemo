package cn.ybzy.demo.demo;

import com.sun.javafx.scene.CameraHelper;

/**
 * 一个数的和数
 */
public class Demo {
    Integer number = null;

    public static void main(String[] args) {

        char[] chars ={'1','2'};
        System.out.println(chars[0]);
    }

    public static void getSum(Integer sum){
        for (int i=0;i<=sum/2;i++){
            int sum1 = sum-i;
            sum = sum1 + i;//4=x+y;
            System.out.println(sum+"="+sum1+"+"+i);

            if(sum1>1){


            }
        }



    }


}
