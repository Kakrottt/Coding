package javaLab.javaPractical;

public class cat extends dog{

    private String food;
    
    public cat(String name, int age, String food){
        super(name, age);
        this.food = food;

    }

    public cat(String name, int age){
        super(name, age);
        this.food = "Food";

    }

    public void speak(){
        System.out.println("I am " + this.name + " and my age is " + this.age + " and i eat this " + this.food);
    }
}
