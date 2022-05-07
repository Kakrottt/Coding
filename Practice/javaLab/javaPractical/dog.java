// program to demonstrate use of super keyword with constructors in multilevel inheritance. 

package javaLab.javaPractical;

public class dog {
    public static dog speak;
    protected String name;
    protected int age;

    public dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("I am " + this.name + " and my age is " + this.age);
    }

}
