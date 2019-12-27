package cn.ybzy.demo.thread;

/**
 * 实现Runnable接口
 */
public class JavaRunnable implements Runnable{

    private Thread thread;
    private String threadName;

    public static void main(String[] args) {
        JavaRunnable rd1 = new JavaRunnable("一线程");
        JavaRunnable rd2 = new JavaRunnable("二线程");
        rd1.start();
        rd2.start();

    }

    JavaRunnable( String name) {
        threadName = name;
        System.out.println("Creating :" +  threadName );
    }

    /**
     * 实现Runnable接口，需要声明run方法
     */
    public void run() {
        try {
            for (int i = 4;i > 0;i--){
                System.out.println("Thread:"+threadName+i);
            }
        }catch (Exception e){
        }
    }

    public void start(){
        System.out.println("start:"+threadName);
        try {
            new Thread(this,threadName).start();

        }catch (NullPointerException e){

        }
    }
}

