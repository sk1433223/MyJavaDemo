package cn.ybzy.demo.datatype;

/**
 * Java数据类型
 */
public class JavaType {
    final static int INT = 11;
    final static String STRINGINT = "12";


    public static void main(String[] args) {
        stringDemo();
    }

    /**
     * 字符串类型转换基本数据类型
     * int的包装类Integer字符串转数字方法
     * <1>Integer.parseInt(String)
     * <2>Integer.valueOf(String)
     */
    public static void stringDemo(){
        int i = Integer.parseInt(STRINGINT);
        System.out.println(INT+i);
        Integer integer = Integer.valueOf(STRINGINT);
        System.out.println(integer+INT);
    }

    /**
     * 基本数据类型转换字符串
     * <1>使用 +""
     * <2>String.valueOf(int)
     */
}
