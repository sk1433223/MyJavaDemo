package cn.ybzy.demo.java8.lambda;

/**
 *      Lambda表达式应用于简化Java中的接口式的匿名内部类,成为函数式概念.
 *      函数是接口是仅有一个抽象方法的接口
 * 语法:
 *      (参数一,参数二...) -> {代码};
 *      1)没有参数可不写,有参数逗号隔开类型可以不写
 *      2)多条语句用大括号括起来分号隔开
 *      3)有语句,返回值在{}中使用return
 *        没有语句,可以直接写返回值去掉return
 *      4)可以加上final关键字(使用时需要加上类型 final String name)
 *
 */
public class LambdaDemo {

    public static void main(String[] args) {

        // 1.使用new关键字
        new SleepClass().sleep();

        // 2.使用匿名内部类
        new MyInterface(){
            @Override
            public int sleep() {
                System.out.println("内部内");
                return 5;
            }
        }.sleep();

        // 3.Lambda表达式
        MyInterface mi = ()-> {System.out.println("lambda");
            return 10;
        };
        mi.sleep();
    }


}

interface MyInterface {
    public abstract int sleep();
}

class SleepClass implements  MyInterface{
    @Override
    public int sleep() {
        System.out.println("sleep");
        return 0;
    }
}
