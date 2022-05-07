package studentRecord;

import studentTotal.*;

public class Main {
    public static void main(String[] args) {
        recordst st1 = new recordst("Student1", 001, 78, 85, 73, 64);
        recordst st2 = new recordst("Student2", 002, 87, 69, 83, 44);
        recordst st3 = new recordst("Student3", 003, 65, 66, 62, 94);
        recordst st4 = new recordst("Student4", 004, 66, 75, 72, 74);
        recordst st5 = new recordst("Student5", 005, 98, 60, 61, 71);

        totalM ast = new totalM();
        
        System.out.println("\n____________________________________________________________________________");

        System.out.print("\n | RNo.\t | Name\t\t | Eng \t | Hindi | Maths | Comp  | Total | Average |");
        System.out.println("\n____________________________________________________________________________");
        st1.display();
        System.out.print(" " + st1.sum() + "\t |" + String.format("%, .2f", ast.aver(st1.sum()))  + "   |");
        st2.display();
        System.out.print(" " + st2.sum() + "\t |" + String.format("%, .2f", ast.aver(st2.sum()))  + "   |");
        st3.display();
        System.out.print(" " + st3.sum() + "\t |" + String.format("%, .2f", ast.aver(st3.sum()))  + "   |");
        st4.display();
        System.out.print(" " + st4.sum() + "\t |" + String.format("%, .2f", ast.aver(st4.sum()))  + "   |");
        st5.display();
        System.out.print(" " + st5.sum() + "\t |" + String.format("%, .2f", ast.aver(st5.sum()))  + "   |");

        System.out.println("\n____________________________________________________________________________\n");

        
    }
}
