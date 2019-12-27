package cn.ybzy.demo.url;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 获取多个网络URL地址页面信息
 */
public class HaiNiuURLThread {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(new TestRunnable("https://www.douban.com/group/topic/126875290/","E:/IDEAJava/URLThreadPool1.html"));
        es.submit(new TestRunnable("https://tieba.baidu.com/f?kw=115%E7%99%BE%E5%90%88%E7%A4%BE","E:/IDEAJava/URLThreadPool2.html"));
        es.submit(new TestRunnable("https://mp.weixin.qq.com/s?__biz=MzIwMTY0NDU3Nw==&mid=2651936134&idx=1&sn=5213a59104f6d2a90bc18d878cafe417&chksm=8d0f3ac8ba78b3deb2ea3473906a37dd205b6e64bfbebe86cc00108242bfa4c49a7d1e509eca&mpshare=1&scene=1&srcid=0707k8Bdz85tDHyVotxEQ9of#rd","E:/IDEAJava/URLThreadPool3.html"));
    }
}
class TestRunnable implements Runnable{
    String url;
    String path;

    public TestRunnable(){
    }

    public TestRunnable(String url, String path) {
        this.url = url;
        this.path = path;
    }

    @Override
    public void run(){
        URL url = null;
        try {
            url = new URL(this.url);
        }catch (MalformedURLException e1){
            e1.printStackTrace();
        }
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            if(conn.getResponseCode()==200){
                InputStream inputStream = conn.getInputStream();
                br = new BufferedReader(new InputStreamReader(inputStream));
                FileOutputStream fos = new FileOutputStream(path);
                bw = new BufferedWriter(new OutputStreamWriter(fos));
                String line = br.readLine();
                while (line!=null){
                    bw.write(line);
                    bw.newLine();
                    line = br.readLine();
                }
                bw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(bw!=null){
                try {
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("完成:"+this.url);
    }
}