package cn.ybzy.demo.java8.inter;

/***
 * JDK1.8
 * 接口里有什么
 * 1.公共的静态方法常量
 * 2.抽象方法
 * 新特征
 *     接口的方法可以不为抽象方法
 *     1)static修饰的方法
 *     实现类仍然要通过接口名.方法调用
 *     2)default修饰方法可以通过对象进行调用
 *     支持重写
 * 注意:类和接口是多实现
 *     如果实现了多个接口,其中默认同名的方法,则必须重写,否则编译错误
 *     静态方法一致则没有问题
 */
public interface InterDemo {

    default void showDefault(){
        System.out.println("default");
    };

    public void show1();


    public static void show2(){
        System.out.println("你好");
    };
}
