package cn.ybzy.demo.exception;


import java.io.IOException;

/**
 * 异常
 */
public class JavaException extends java.lang.Throwable{
    public static void main(String[] args) {

        System.out.println(getNumber());

    }

    /***
     * try..catch..finally
     * 注:<1>异常机制原则:如果在catch中遇到了return或者异常等 能够使该函数中指的话,那么有finally就必须先执行finally代码块里面的代码;
     *    <1.1>在catch..finally中执行return则直接跳出方法.不执行其他代码.
     */
    public static int getNumber(){

        try {
            int num = 1/0;
            return 1;
        }catch (Exception e){
            System.out.println("2");
            return 0;
        }finally {
            return 3;
        }
    }






}
