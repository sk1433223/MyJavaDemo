package cn.ybzy.demo.annotation;

@MyAnnotation
public class JavaAnnotation {

    public static void main(String[] args) {
        /**
         * JavaAnnotation.class.isAnnotationPresent(MyAnnotation.class)
         * 判断是否有注解
         */
        if(JavaAnnotation.class.isAnnotationPresent(MyAnnotation.class)){
            System.out.println("有注解");
            MyAnnotation myAnnotation = JavaAnnotation.class.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.color());
        }else{
            System.out.println("没注解");
        }
    }

}
