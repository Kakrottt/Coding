package Incture.Week2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    protected String title;
    protected String author;
    protected int numberOfCopies;
    public Book(String title, String author, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    public void display(){
        System.out.println(title +" : "+ author +" : "+ numberOfCopies);
    }

    public boolean contains(String key){
        if(this.title.equals(key))
            return true;
        else if(this.author.equals(key))
            return true;
        if(this.numberOfCopies < 1)
            return false;
        return false;
    }
}

public class Library {
    static ArrayList<Book> books;

    public void search(String key){
        boolean flag = false;
        for (Book book : books) {
            if(book.contains(key)){
                flag = true;
                System.out.println(book.author+ " " +book.title+" "+book.numberOfCopies);
                System.out.println("Book Found, Issue??");
                
            }
        }
        if(flag == false)
            System.out.println("Not Found");
        
    }

    public void issue(char YN){
        if(YN == 'Y' || YN == 'y'){
            System.out.println("Book Issued :)");
        }
        else
            System.out.println("Thanks Visit Again ^_~");
    }

    public void retun(){
        
    }
    public static void main(String[] args) throws IOException {
        File file = new File("bookList.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(System.in);
        // int t = 32;

        Library l1 = new Library();
        ArrayList<String> list = new ArrayList<>();
        String l = br.readLine();
        while(l != null){
            list.add(l);
            l = br.readLine();
        }

        books = new ArrayList<>();

        for(int i = 0; i < list.size(); i+=2){
            books.add(new Book(list.get(i), list.get(i+1), 5));
        }

        for (int i = 0; i < books.size(); i++) {
            int j = i+1;
            System.out.print(j + ". ");
            books.get(i).display();
        }

        System.out.println("1. Search");
        System.out.println("2. Issue");
        System.out.println("3. Return");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter Book Name to Search : ");
                String key = sc.nextLine();
                // System.out.println(key);
                l1.search(key);
                // break;
            case 2:
                char YN = sc.next().charAt(0);
                l1.issue(YN);
                break;
            case 3:
                l1.retun();
                break;
        
            default:
                break;
        }

        br.close();
        sc.close();
    }
}
