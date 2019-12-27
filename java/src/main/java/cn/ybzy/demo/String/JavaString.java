package cn.ybzy.demo.String;

/**
 *
 */
public class JavaString {

    static String string = "HelloWord!";

    public static void main(String[] args) {
       /* String s1 = "s1";
        String s2 = new String("s1");
        s2 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));*/

       javaStringBuffer();
    }

    /**
     * String
     */
    public static void javaString() {

        String str = "hello word!";

        //1.获取字符串的长度
        System.out.println(str.length());

        //2.利用数组创建string对象
        char[] cha = {'h','e','l','l','o','w','o','r','d','!'};
        String str2 = new String(cha);
        System.out.println(str2);

        //3.删除字符串最后一个字符
        //截取字符串长度
        String str3 = "HelloWord!";
        str3 = str3.substring(0, str3.length()-1);
        System.out.println(str3);

        //4.获取某一位置的字符 ，charAt()方法的索引从0开始
        String str4 = "HelloWord";
        char s = str4.charAt(5);
        System.out.println(s);

        //5.连接两个字符串
        String str5 = "Hello";
        String str6 = "Word";
        System.out.println(str5.concat(str6));

        //6.去除两边空格
        String str7 = " Hello ";
        System.out.println(str7);
        str7 = str7.trim();
        System.out.println(str7);

        //7.比较两个字符串内容equalsIgnoreCase()方法比较不区分大小写
        String str8 = "Hello";
        String str9 = "hello";
        System.out.println(str8.equals(str9));
        System.out.println(str8.equalsIgnoreCase(str9));

        //8.大小写的转换
        String stt = "hello";
        stt = stt.toUpperCase();
        System.out.println(stt);
        String stt2 = "HELLO";
        stt2 = stt2.toLowerCase();
        System.out.println(stt2);

        //9.替换字符串，replaceAll()方法会使用另一个值替换列表中出现的所有某一指定值。
        String str10 = "Hello";
        str10 = str10.replaceAll("llda", "Lad");
        System.out.println(str10);

        //10.分割字符串
        String str11 = "Hello,Word";
        String Astr[] = str11.split(",");
        for (String string : Astr) {
            System.out.println(string);
        }


    }

    /**
     * StringBuffer
     */
    public static void javaStringBuffer(){

//        StringBuffer sb = new StringBuffer("HelloWork");

        StringBuilder sb = new StringBuilder("HelloWork");
        
        // 增加（在字符串末尾插入字符）
        System.out.println(sb.append(".JavaClone"));  //HelloWork.JavaClone

        // 插入（在索引 2 的位置插入字符）
        System.out.println(sb.insert(2,"*")); //He*lloWork1234567890.JavaClone

        // 修改（索引范围）
        System.out.println(sb.replace(5,9,"China")); //He*llChinak1234567890.JavaClone

        // 删除单个字符
        System.out.println(sb.deleteCharAt(0));//e*llChinak1234567890.JavaClone

        // 删除多个（删除两个索引区间的值）
        System.out.println(sb.delete(0,4));//Chinak1234567890.JavaClone

        // 反向输出字符串
        System.out.println(sb.reverse());//avaj.0987654321kanihC

        // 输出 0-4 索引的值
        System.out.println(sb.substring(0,4));//avaj

        // 输出从 5 索引开始的值，直到结束
        System.out.println(sb.substring(5));//0987654321kanihC

        /**
         * HelloWork.JavaClone
         * He*lloWork.JavaClone
         * He*llChinak.JavaClone
         * e*llChinak.JavaClone
         * Chinak.JavaClone
         * enolCavaJ.kanihC
         * enol
         * avaJ.kanihC
         */
    }
}
