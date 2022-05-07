package osAlgoPractice;

import java.util.Scanner;

public class bankeralgorithm {
    
	void initVal(int p, int r)
	{
	    int n = p;
        int m = r;
        int max[][] = new int[n][m];
        int alloct[][] = new int[n][m];
	    int avail[] = new int[m];
        int safeSequence[] = new int[n];

        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the Allocation Matrix...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                alloct[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nEnter the Max Matrix...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nEnter Available Matrix...");
        for (int i = 0; i < m; i++) {
            avail[i] = scan.nextInt();

            calculateNeed(n, m, alloct, max);
            
            isSafe(n, m, avail, alloct);
        }

	}


	void isSafe(int n, int m, int[] avail, int[][] alloct)
	{
        int count=0;
        int safeSequence[] = new int[n];
        int need[][] = new int[n][m];

        boolean visited[] = new boolean[n];
        for (int i = 0;i < n; i++)
        {
            visited[i] = false;
        }

        int work[] = new int[m];	
        for (int i = 0;i < m; i++)
        {
            work[i] = avail[i];
        }

        while (count<n)
        {
            boolean flag = false;
            for (int i = 0;i < n; i++)
            {
                if (visited[i] == false)
                {
                int j;
                for (j = 0;j < m; j++)
                {		
                    if (need[i][j] > work[j])
                    break;
                }
                if (j == m)
                {
                safeSequence[count++]=i;
                visited[i]=true;
                flag=true;
                            
                    for (j = 0;j < m; j++)
                    {
                    work[j] = work[j]+alloct[i][j];
                    }
                }
                }
            }
            if (flag == false)
            {
                break;
            }
        }
        if (count < n)
        {
            System.out.println("UnSafe!");
        }
        else
        {
            System.out.println("Safe Sequence");
                    for (int i = 0;i < n; i++)
            {
                System.out.print("P" + safeSequence[i]);
                if (i != n-1)
                System.out.print(" -> ");
            }
        }
	}
	
	void calculateNeed(int n, int m, int[][] alloct, int [][]max)
	{
        int need[][] = new int[n][m];
        for (int i = 0;i < n; i++)
        {
            for (int j = 0;j < m; j++)
            {
            need[i][j] = max[i][j]-alloct[i][j];
            }
        }		
	}

	public static void main(String[] args)
	{
        int p, r;

        Scanner si = new Scanner(System.in);

        System.out.println("Enter no. of Processes : ");
        p = si.nextInt();

        System.out.println("Enter no. of Resources : ");
        r = si.nextInt();

        bankeralgorithm balgo = new bankeralgorithm();
            
        balgo.initVal(p, r);		
    }

}
