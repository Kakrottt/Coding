package practice;
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		  // your code goes here
          int x = sc.nextInt();
          int n = x*2;
          int res = n;
          int[] arr = new int[n];

          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }

          int[] tempArr1 = new int[x];
          int[] tempArr2 = new int[x];

          for (int i = 0; i < x; i++) {
              tempArr1[i] = arr[i];
              i++;
          }

          for (int i = 1; i < x; i++) {
              tempArr2[i] =  arr[i];
              i++;
          }

          Arrays.sort(tempArr1);
          Arrays.sort(tempArr2);
          //   int count = 0;

          for (int i = 1; i < x; i++) {
              if(tempArr1[i]==tempArr1[i-1])
                res--;
          }

          for (int i = 1; i < x; i++) {
            if(tempArr2[i]==tempArr2[i-1])
              res--;
        }

        System.out.println(res);
          
        }
        sc.close();
    }
}
