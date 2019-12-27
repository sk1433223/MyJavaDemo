package cn.ybzy.demo.java;

/**
 * Java.lang.Object
 */


/**
 * Object类是Java中所有类的基类。位于java.lang包中，一共有13个方法
 */
public class JavaObject implements Cloneable {

    public static void main(String[] args) {

        ObjectClone();

    }

    /**
     * 3.Object.Clone()
     *  <1>被声明为protected，protected修饰的属性或方法表示：在同一个包内或者不同包的子类可以访问。
     *  <2>Java中的语法规定：clone()的正确调用是需要实现Cloneable接口，如果没有实现Cloneable接口，并且子类直接调用Object类的clone()方法，则会抛出CloneNotSupportedException异常。
     */
    public static void ObjectClone(){
        JavaObject jOb = new JavaObject();
        try {
            JavaObject job2 = (JavaObject) jOb.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 5.Object.equals()
     * ==与equals在Java中经常被使用
     * equals表示的是对象的内容完全相同，此处的内容多指对象的特征/属性。
     */

    /**
     * 6.Object.hashCode()
     * hashCode()方法返回一个整形数值，表示该对象的哈希码值。
     */

    /**
     * 7.Object.toString
     * toString()方法返回该对象的字符串表示。
     */

    /**
     * 线程
     */
    /**
     * wait():调用此方法,所在的当前线程等待,直到在其他线程上调用此方法的主调（某一对象）的notify()/notifyAll()方法.
     */
    /**
     * notify()/notifyAll()：唤醒在此对象监视器上等待的单个线程/所有线程。
     */

    /**
     * 13.Object.finalize
     * finalize方法主要与Java垃圾回收机制有关。
     * 其具体调用时机在：JVM准备对此对形象所占用的内存空间进行垃圾回收前，将被调用。由此可以看出，此方法并不是由我们主动去调用的（虽然可以主动去调用，此时与其他自定义方法无异）。
     */
}
