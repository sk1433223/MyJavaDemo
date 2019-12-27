package cn.ybzy.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Retention 元注解决定MyAnnotation注解的生命周期
 *
 * @Target 元注解指定MyAnnotation的使用位置
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation {

    /**
     * 语法:类型 属性名();
     */
    String color() default "Blue";

    /**
     * 默认参数
     * default 默认值
     * @return
     */
    int [] vaule() default 1;
}
