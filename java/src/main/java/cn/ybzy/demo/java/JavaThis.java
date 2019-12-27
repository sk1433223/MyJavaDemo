package cn.ybzy.demo.java;

/**
 * this
 */
public class JavaThis {

    /**
     * this代表它所在属性对象的引用。
     * 哪个对象调用所在函数，this就代表哪个对象。
     * 注:<1>被static修饰的方法不可以使用this关键字
     */

    String name;

    public static void main(String[] args) {
        JavaThis javaThis = new JavaThis();
        javaThis.name="dog";
        javaThis.demoA();
    }

    /**
     * 2.this在同一个类中调用另一个方法(可以省略)
     */
    public void  demoA(){
        this.demoB();
    }



    public void demoB(){
        System.out.println(this.name);
    }

}

