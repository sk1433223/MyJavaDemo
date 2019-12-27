package cn.ybzy.demo.design_pattern;


/**
 * 单例设计模式Singleton
 */

/**
 * 饿汉式
 */
public class Singleton {

    //直接创建对象
    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}

/**
 * 懒汉式
 */
class singleton {

    private static  volatile singleton singleton = null;

    private singleton(){

    }

    public static singleton getSingleton(){
        if(singleton == null){
            singleton = new singleton();
        }
        return singleton;
    }
}