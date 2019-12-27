package cn.ybzy.demo.collection;

/**
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * 线程安全的有Vector,hashTable
 * 关键字synchronized
 */
public class collection {

    public static void main(String[] args) {

        Collection collection = new ArrayList();

        //增加元素
        collection.add("Tom");
        collection.add("Cat");
        collection.add("Tom");

        //删除元素
        //collection.remove("Tom");
        //删除所有元素
        //collection.removeAll(collection);

        //检测是否存在某个元素
        boolean tom = collection.contains("Tom");

        //判断是否为空
        boolean empty = collection.isEmpty();

        System.out.println("tom:"+tom+"----empty:"+empty);

        iterator(collection);

        Collections collections = null;
    }

    /**
     * 迭代
     */
    public static void iterator(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

}
