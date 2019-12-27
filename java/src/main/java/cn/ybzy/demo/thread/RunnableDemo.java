package cn.ybzy.demo.thread;

public class RunnableDemo{


    public static void main(String args[]) {
        lambdaThreadDemo();
        threadDemo();
    }

    /**
     *
     */
    public static void threadDemo(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello word!");
            }
        }).start();
    }

    /**
     * lambda
     */
    public static void lambdaThreadDemo(){
        new Thread(()-> System.out.println("lambda:hello word!")).start();
    }

}

