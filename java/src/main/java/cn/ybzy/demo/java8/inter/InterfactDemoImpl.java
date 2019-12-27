package cn.ybzy.demo.java8.inter;

public class InterfactDemoImpl implements InterDemo,InterDemo2 {

    public static void main(String[] args) {
        InterfactDemoImpl inter = new InterfactDemoImpl();
        inter.show1();
        InterDemo.show2();
        inter.showDefault();
    }
    @Override
    public void show1() {
        System.out.println("show1");
    }
}
