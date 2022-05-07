package practice;
import java.util.Scanner;

public class xored {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		long test=in.nextLong();
		for(int x=1;x<=test;x++)
		{
		    int N=in.nextInt();
		    int X=in.nextInt();
		    int K=(int)(Math.log(X)/Math.log(2)); K=K+1;
		    int counter=1;
		    int ans=0;int t=1;
		    if((K==19)&&((X&(1<<(K-2)))>0))
		    {
		        t=2;
		    }
		    if(N==1)
		    {
		        System.out.print(X);
		    }
		    if(N>1)
		    {
		    while(N>t)
		    {
		        if((counter&(1<<(K-1)))>0)
		        {
		            counter++;
		            continue;
		        }
		        System.out.print(counter+"  ");
		        ans=ans^counter;
		        counter++;
		        N--;
		    }
		    if(t==2)
		    {
		        counter=1<<(K-2);
		        System.out.print(counter+" ");
		        ans=ans^counter;
		    }
		    System.out.print(ans^X);
		}
		System.out.println();
        in.close();
	}
    }
}
