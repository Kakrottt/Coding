package Prog.Inherri;

public class Main {
    public static void main(String[] args) {
        dog tim = new dog("tim", 13);
        // tim.speak();
        dog tim1 = new dog("tim1", 14);
        dog tim2 = new dog("tim2", 23);
        dog tim4 = new dog("tim4", 14);
        dog tim3 = new dog("tim3", 15);
        dog tim5 = new dog("tim5", 2);
        // tim1.speak();
        // tim2.speak();
        // tim4.speak();
        // tim5.speak();

        // System.out.println(tim.getAge());
        // System.out.println(tim1.getAge());
        // System.out.println(tim5.getAge());

        tim.setAge(5);
        tim.speak();
    }
}
