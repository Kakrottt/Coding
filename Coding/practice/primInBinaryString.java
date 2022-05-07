package practice;
import java.util.Scanner;

public class primInBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){

		    String str = sc.nextLine();
		    
		    if(str.contains("10")|| str.contains("11"))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
        sc.close();
    }
}
