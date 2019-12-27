package cn.ybzy.demo.annotation;

/**
 * JDK内部注解
 */
public class JavaJDK {

    public static void main(String[] args) {
        deprecated();
        /**
         * @SuppressWarnings
         * 去除警告
         */
        @SuppressWarnings("unused")
        String str = "";
    }

    /**
     * @Deprecated
     * 表示方法过时（可以使用）
     */
    @Deprecated
    public static void deprecated(){
        System.out.println("deprecated");
    }

    /**
     * @Override
     * 覆盖JDK内部的toString方法
     */
    @Override
    public String toString(){
        return "";
    }
}
