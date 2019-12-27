package cn.ybzy.demo.java;

import java.io.IOException;

/**
 * Runtime的exec()方法的使用
 */
public class JavaRuntime_exec {

    static Runtime rt = Runtime.getRuntime();

    public static void main(String[] args) {
        notepad();
    }

    /**
     * 打开windows下的笔记本
     */
    public static void notepad(){
        Process pro = null;
        try {
            pro = rt.exec("notepad");
        }catch (Exception e){
            System.out.println("没有notepad程序");
        }

    }
}
