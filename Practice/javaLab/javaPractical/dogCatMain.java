package javaLab.javaPractical;

public class dogCatMain {
    public static void main(String[] args) {
        dog dog01= new dog("Dog_1", 3);
        dog01.speak();

        dog dog02= new dog("Dog_2", 5);
        dog02.speak();

        dog dog03= new dog("Dog_3", 1);
        dog03.speak();

        System.out.println("\nAfter Super Keyword this Cat class can also use the features of Dog Class >> \n");

        cat cat001 = new cat("Cat_1", 2);
        cat001.speak();

        cat cat002 = new cat("Cat_2", 1);
        cat002.speak();

        cat cat003 = new cat("Cat_3", 2);
        cat003.speak();

        System.out.println("\nAfter Super Keyword this Cat class can also use the features of Dog Class and also modify it >> \n");

        cat cat004 = new cat("Cat_4", 1, "Cat_Food");
        cat004.speak();
    }
}
