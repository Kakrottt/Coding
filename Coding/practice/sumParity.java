package practice;
import java.util.Scanner;

public class sumParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    
		    if(n==1){
		        if((a&1)==1){
                    System.out.println("Odd");
                }
                else
                    System.out.println("Even");
		    }
                else if((a&1)==1){
                    if((n&1)==1)
                        System.out.println("Odd");
                        else
                            System.out.println("Even");
                }
                        else
                            System.out.println("Impossible");
		}
        sc.close();
    }
}
