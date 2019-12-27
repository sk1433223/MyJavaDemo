package cn.ybzy.demo.model;


public class Person implements Cloneable {

    private int age;

    private String name;

    /**
     * 无参
     */
    public Person() {
    }

    /**
     * 有参
     * @param age
     * @param name
     */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
