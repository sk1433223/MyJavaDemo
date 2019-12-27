package cn.ybzy.demo.thread;

/**
 *
 */

/**
 * 继承类必须重写 run() 方法，该方法是新线程的入口点。它也必须调用 start() 方法才能执行。
 */
public class JavaThread extends Thread{

    public static void main(String[] args) {

        JavaThread javaThread = new JavaThread("线程一");
        javaThread.start();
        JavaThread javaThread2 = new JavaThread("线程二");
        javaThread2.start();

    }

    private Thread thread;
    private String threadName;

    JavaThread(String name){
        threadName = name;
        System.out.println(threadName);
    }

    /**
     * 如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
     */
    public void run(){
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.错误");
        }
        System.out.println("Thread " +  threadName + " exiting.循环结束");
    }

    /**
     * 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
     */
    public void start(){
        if(thread == null){
            new Thread(this,threadName).start();
        }
    }

}
