package String;

/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);

		//boolean visited = true;
		
		int t = sc.nextInt();
		
		while(t-->0){
		  // your code goes here
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  int n = sc.nextInt();
		  int r = sc.nextInt();
		  
		  int nx = n*x;
		  int ny = n*y;
		  
		  if(nx>r)
		    System.out.println(-1);
		    else if(ny<r)
		        System.out.println("0 " + n);
		    else{
		        int res = (r-nx)/(y-x);
		        System.out.println((n-res) + " " +  res);
		    }
		}
		sc.close();
	}
}
