package cn.ybzy.demo.String;

public class JavaStringBuffer {

    public static void main(String[] args)
    {

        Long start1 = System.currentTimeMillis();//获取开始时间

        for (int i=0;i<100000;i++)//重复10万次进行String变量加操作
        {
            String str = "a"+"b";
        }
        Long end1 = System.currentTimeMillis();//获取结束时间
        System.out.println("String花费时间："+(end1-start1));//打印出花费的时间

        Long start2 = System.currentTimeMillis();
        for (int i=0;i<100000;i++)//重复10万次进行StringBuilder变量加操作
        {
            StringBuilder str2 = new StringBuilder("a");
            str2.append("b");
        }
        Long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder花费时间："+(end2-start2));

        Long start3 = System.currentTimeMillis();
        for (int i=0;i<100000;i++)//重复10万次进行StringBuffer变量加操作
        {
            StringBuffer str2 = new StringBuffer("a");
            str2.append("b");
        }
        Long end3 = System.currentTimeMillis();
        System.out.println("StringBuffer花费时间："+(end3-start3));
    }
}
