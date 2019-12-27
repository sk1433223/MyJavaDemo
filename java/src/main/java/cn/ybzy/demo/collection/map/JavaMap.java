package cn.ybzy.demo.collection.map;

/**
 * Map
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map
 * 1.AbstractMap                    2.sortedMap
 * 1.1HashMap 1.1.1LinkedHashMap    2.1treeMap
 * 1.2WeakHashMap
 * 1.3HashTable
 * 1.4IdentityHashMap
 * 1.5TreeMap
 *
 */
public class JavaMap {

    static final  Map<String,String> map = new HashMap<>();

    public static void main(String[] args) {
        getMap();
    }

    /**
     * 遍历Map集合
     * map
     */
    public static void getMap(){
        map.put("m1","刘一");
        map.put("m2","陈二");
        map.put("m3","张三");
        map.put("m4","李四");

        /**
         * 1.使用entrySet()遍历
         */

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:"+key+"\tvalue:"+value);
        }

        /**
         * 2.通过Map.Keyset遍历key和value,普遍使用，二次取值
         */
        for(String key:map.keySet()){
            String value = map.get(key);
            System.out.println("key:"+key+"\tvalue:"+value);
        }

        /**
         *4通过map.entrySet遍历key和value(推荐使用，特别是容量大时)
         */
        for (Map.Entry<String,String> entry:map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"\tvalue:"+value);
        }


    }



}
