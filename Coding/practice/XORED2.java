package practice;
import java.util.Scanner;

public class XORED2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 500000;
		
		int t = sc.nextInt();
		
		while(t-->0){
		     int n = sc.nextInt();
		     int x = sc.nextInt();
		     
		     if(n==1){
		         System.out.println(x);
		     }
		     
		     int[] arr = new int[n];
		     int temp_xor = 0;
		     
		     for(int i = 1; i<n-1; i++){
		         arr[i] = i;
		         temp_xor ^= i;
		     }
		     
		     int last = x^temp_xor;
		     int set_18 = (1<<18);

             if(last >= (n-1) && last<max)
                arr[n-1] = last;
             else{
                arr[n-1] = last^set_18;
                if((arr[0]^set_18)==arr[n-1])
                    arr[1] ^= set_18;
                else
                    arr[0] ^= set_18;
            }
             for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

		}
		
		sc.close();
    }
}
