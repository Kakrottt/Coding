package Incture.Week2;

public class Publication {
    protected String title;
    protected float price;

    public Publication(){
        this.title = "";
        this.price = 0.0f;
    }

    public void set(String title, float price){
        this.title = title;
        this.price = price;
    }

    public void display(){
        System.out.println("Title : " + this.title);
        System.out.println("Price : " + this.price + "$");
    }

    public static void main(String[] args) { 
        try {
            Book b1 = new Book();
            Book b2 = new Book();
            b1.set("Book 1", 12.99f, 335);
            b1.display();
            b2.set("Book 2", 29.99f, 300);
            b2.display();

            Tape t1 = new Tape();
            Tape t2 = new Tape();
            t1.set("Tape 1", 49.99f, 120);
            t1.display();
            t2.set("Tape 2", 19.99f, 180);
            t2.display();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

class Book extends Publication{
    private int pageCount;

    public Book(){
        super();
        pageCount = 0;
    }

    public void set(String title, float price, int pageCount){
        super.title = title;
        super.price = price;
        this.pageCount = pageCount;
    }

    public void display(){
        super.display();
        System.out.println("Page Count : " + pageCount);
        System.out.println("_____________________________");
    }
}

class Tape extends Publication{
    private float runTime;

    public Tape(){
        super();
        runTime = 0.0f;
    }

    public void set(String title, float price, float runTime){
        super.title = title;
        super.price = price;
        this.runTime = runTime;
    }

    public void display(){
        super.display();
        System.out.println("Runtime : " + runTime + " min");
        System.out.println("_____________________________");
    }

}
