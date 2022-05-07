package practice;
import java.util.Scanner;

public class binaryBaseBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		  // your code goes here
		  int n = sc.nextInt();
		  int k = sc.nextInt();
		  String s = sc.next();
		  
		  int l=0, r=(n-1), count=0;
		  
		  while(l<r){
		      if(s.charAt(l)!=s.charAt(r))
		        count++;
	          l++;
	          r--;
		  }
		  
		  if(count>k){
		      System.out.println("No");
		  }
		    else if(s.length()%2!=0)
		      System.out.println("Yes");
		      else if((k-count)%2==0)
		        System.out.println("Yes");
		        else
		            System.out.println("No");
		}

        sc.close();
    }
}
