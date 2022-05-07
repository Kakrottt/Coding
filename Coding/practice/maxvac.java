package practice;
import java.util.Scanner;

public class maxvac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] suf = new int[n+1];
            int[] nex1 = new int[n+1];
            int cur = 0;
            int vac = 0;
            int ans = 0;
            int pos1 = n;
            

            String s = sc.next();

            for (int i = (n-1); i >= 0; i--) {
                // System.out.println(s.charAt(i));
                nex1[i] = pos1;
                if((s.charAt(i))=='1'){
                    cur = 0;
                    pos1 = i;
                }
                else{
                    cur++; 
                    if(cur==x){
                        vac++;
                        cur = 0;
                    }
                }
                suf[i]=vac;
            }

            vac = 0; cur = 0; ans = suf[0];

            for(int i = 0; i<n; i++){
                if((s.charAt(i))=='1'){
                    if(nex1[i]>(x+i-cur-1))
                        ans = Math.max(ans, vac + suf[i+x-cur] + 1);
                    cur = 0;
                }
                else{
                    cur++;
                    if(cur==x){
                        vac++;
                        cur = 0;
                    }
                }
            }

            // for (int i = 0; i < n; i++) {
            //     System.out.print(suf[i] + " ");
            // }
            System.out.println(ans);
        }
        sc.close();
    }
}
