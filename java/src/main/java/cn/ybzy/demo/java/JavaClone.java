package cn.ybzy.demo.java;

import cn.ybzy.demo.model.Person;

/**
 * Clone的用法
 */
public class JavaClone{

    public static void main(String[] args) throws  Exception {
        cloneDemo();
    }
    public static void cloneDemo() throws Exception {

        Person p1 = new Person(12,"zhang");
        Person p2 = p1.clone();
        System.out.println(p1==p2);
    }
}
