package cn.ybzy.demo.url;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @URL 实现一个简单的获取网络邮箱的程序(一个简单的爬虫)
 *
 */
public class emailURL {

    public static void main(String[] args) throws IOException {
        //1.网络URL地址
        URL url = new URL("https://www.douban.com/group/topic/126875290/");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        InputStream inputStream = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
        FileOutputStream fos = new FileOutputStream("E:/IDEAJava/demo1.html");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        String line = br.readLine();
        //正则表达式
        Pattern compile = Pattern.compile("[\\d]{5,12}@qq.com");
        while (line!=null){
            Matcher matcher = compile.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
            line = br.readLine();
        }
        System.out.println("程序结束！");
    }
}
