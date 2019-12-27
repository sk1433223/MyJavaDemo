package cn.ybzy.demo.demo;

public class Demo3 {

        public static void main(String[] args) {
            String s1 = "Cat";
            String s2 = "Cat";
            String s3 = new String("Cat");

            System.out.println("s1 == s2 :"+(s1==s2));// true
            System.out.println("s1 == s3 :"+(s1==s3));// false
        }
}
