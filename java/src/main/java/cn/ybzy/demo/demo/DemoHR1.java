package cn.ybzy.demo.demo;

/**
 * 两个字符串比较大小
 * @String
 * @String
 */
public class DemoHR1 {

    public static void main(String[] args) {

        String str1 = "你好呀!";
        String str2 = "你好!";
        String str3 = "hello";
        String str4 = "hell";
        String str5 = "hell你好";
        String str6 = "hell你好";

        long start2 = System.nanoTime();
        int i2 = compareTo2(str4, str3);
        long end2 = System.nanoTime();
        System.out.println("新方法(英文)比较结果:"+i2);
        System.out.println("消耗时间:"+(end2-start2));

        long start3 = System.nanoTime();
        int i3 = compareTo2(str1, str2);
        long end3 = System.nanoTime();
        System.out.println("新方法(中文)比较结果:"+i3);
        System.out.println("消耗时间:"+(end3-start3));

        long start4 = System.nanoTime();
        int i4 = compareTo2(str5, str6);
        long end4 = System.nanoTime();
        System.out.println("新方法比较结果:"+i4);
        System.out.println("消耗时间:"+(end4-start4));
    }

    /**
     * 字符串作比较
     * @param str1
     * @param str2
     * @return 如果str1字典顺序大于str2字典顺序则返回 1
     *         如果str1字典顺序小于str2字典顺序则返回 -1
     *         如果str1字典顺序等于str2字典顺序则返回 0
     *
     *         注:汉字异同(首先比较索引较前位置的字典顺序,其次比较长度)
     */
    public static int compareTo2(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1,len2);
        char[] v1 = str1.toCharArray();
        char[] v2 = str2.toCharArray();
        int k = 0;
        while (k<min){
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1!=c2){
                if (c1 - c2 > 0){
                    return 1;
                }
                return -1;
            }
            k++;
        }
        if (len1 - len2 > 0){
            return 1;
        }else if(len1 - len2 < 0){
            return -1;
        }
        return 0;
    }
}
