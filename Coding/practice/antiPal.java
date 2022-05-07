package practice;

import java.util.Arrays;
import java.util.Scanner;

public class antiPal {
    static String reverse(String s, int l, int r){
	    char tempArr[] = s.toCharArray();
        while(l<r){
            char temp = tempArr[l];
            tempArr[l] = tempArr[r];
            tempArr[r] = temp;
            l++;
            r--;

        }
        // char[] t = tempArr;
	    return new String(tempArr);
	}

    static String sortString(String s){
        char tempArr[] = s.toCharArray();
        Arrays.sort(tempArr);

        return new String(tempArr);
        
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		  // your code goes here
		  int n = sc.nextInt();
		  String s = sc.next();
		  
		  if(s.length()%2!=0)
		    System.out.println("No");
		    else{
                System.out.println("Yes");
		        sortString(s);
                reverse(s, (n/2), (n-1));
                System.out.println(s);
		    }
		}
        sc.close();
	}
}
