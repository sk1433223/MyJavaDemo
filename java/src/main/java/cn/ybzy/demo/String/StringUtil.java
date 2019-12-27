package cn.ybzy.demo.String;

/**
 * Java.lang.Strings.html
 * 1.String是线程安全的
 * 2.String的equals进行了类型判断
 * 3.Strings.html.trim()方法去掉字符串首尾的空白字符。
 */
public class StringUtil {


    public static void main(String[] args) {
        //new StringUtil().toCharArray();

        String subStr = "as";
        String srcStr = "saassdsasq";
        new StringUtil().indexOf(srcStr,subStr);
    }

    /***
     * @string.split()
     * 1.切割字符串
     */
    public void split(){
        String str="Java string split test";
        String[] strArray=str.split(" ");
        for (int i = 0; i < strArray.length; i++)
        System.out.println(strArray[i]);

    }

    /**
     * @string.subString()
     * 2.截取字符串
     */
    public void subString() {
        String Str = "hello wrold";

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4) );//从第4个直到末尾索引

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4, 10) );//从第(4-->10)索引处
    }

    /**
     * @判断字符串是否回文(顺读和倒读都一样的词)
     * 3.1如果需要判断是否是回文，只需要比较正反是否相等即可。String类并没有提供反转方法供我们使用，但StringBuffer和StringBuilder有reverse方法。
     */
    private static boolean isPalindrome(String str) {
        if (str == null){
            return false;
        }
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
    /**
     * 3.2 String的使用
     * 不使用任何其他类来实现的话，我们只需要首尾一一对比就知道是不是回文了。
     */
    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;

        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    /**
     * @字符串大小写转换
     * 4.使用toUpperCase 和 toLowerCase 方法让一个字符串变为 大写或小写。
     */
    public void toCase(){
        String str = "abD";
        System.out.println(str.toUpperCase());//转换为大写
        System.out.println(str.toLowerCase());//转换为小写
    }

    /**
     * @计算出一个短字符串在另一个较长字符串中出现的次数
     * 5.String的split( CharSequence)方法可以以指定的符号分隔原有的字符串而形成新的字符串数组吗！这里可以直接用这个短字符串来当分隔符，
     * 其方法返回的字符串数组的长度不就跟短字符串出现的次数间有关系嘛（count比length小1）
     */
    public int countOfSubstr(String srcStr, String subStr){
        int count=0;
        //只有srcStr(长)里包含subStr(短)时为true
        if(srcStr.contains(subStr)){
            //防止subStr出现在srcStr的首尾位置，分别在源字符串srcStr的首尾加上空格
            String _srcStr=""+srcStr+"";
            String[] strs=_srcStr.split(subStr);
            count=strs.length-1;
        }
        return count;
    }

    /**
     * @判断字符串出现在另一个字符串中的第一次索引位置没有则返回-1
     * 6.
     */
    public void indexOf(String srcStr, String subStr){
        //subStr在字符串srcStr的索引位置
        System.out.println();
        System.out.println(srcStr.indexOf(subStr));//正向搜索,起始位置
        System.out.println(srcStr.lastIndexOf(subStr));//反向搜索,最终位置,最后一次位置
    }

    /**
     * @String比较
     * 注:1.Strings.html.equals()方法进行了类型判断
     * 7.
     */
    public void compare(){
        //1>
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//结果:false
        System.out.println(s1.equals(s2));//结果true

        //2>
        String s3 = "abc";
        StringBuffer s4 = new StringBuffer(s3);
        System.out.println(s3.equals(s4));//结果:false,因为s2不是String类型，String的equals方法进行了类型判断。

        //3>
        String s5 = "abc";
        String s6 = new String("abc");
        //s6.intern();
        System.out.println(s5 ==s6);//结果:false，intern()方法将返回从字符串池中的字符串对象的引用，但因为我们没有分配到S2，S2没有变化，// 如果该第三行代码为s2 =s2.intern()，则输入true
        System.out.println(s5.equals(s6));//结果:true

        String s7 = "s1";
        String s8 = new String("s1");
        s8 = s8.intern();
        System.out.println(s7 == s8);//true
        System.out.println(s7.equals(s8));//true

    }

    /**
     * @调用toCharArray() 方法将字符串转成字符数组
     * 8
     */
    public void toCharArray(){
        String str = "Java interview";

        //string to char array
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        System.out.println(chars);
    }


}
