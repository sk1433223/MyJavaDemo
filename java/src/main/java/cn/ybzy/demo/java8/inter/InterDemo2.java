package cn.ybzy.demo.java8.inter;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public interface InterDemo2 {

    default void show(){
        System.out.println("show");
    }

    default void show2(){
        System.out.println("show2");
    }
}
