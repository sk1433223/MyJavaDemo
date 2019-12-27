package cn.ybzy.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList底层结构是数组，查询快，增删慢 ; 线程不安全，效率高
 *
 */
public class JavaArrayList {

    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add("Tom");
        arrayList.add(1,"Cat");
        //在指定地方添加元素，2是索引，0是要插入的值
        arrayList.add(2, 0);

        //在指定地方替换元素，2是索引，1是要替换原目标的值
        arrayList.set(2, 1);


        //获得指定对象的索引
        int i = arrayList.indexOf(1);
        System.out.println("索引为："+i);

        //遍历：普通for循环
        for(int j = 0;j < arrayList.size();j++){
            System.out.println(arrayList.get(j));
        }





    }
}
