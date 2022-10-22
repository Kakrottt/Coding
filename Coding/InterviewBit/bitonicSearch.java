package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class bitonicSearch {
    public int solve(ArrayList<Integer> A, int B) {
        int l = 0;
        int r = A.size() - 1;
        int bi = (l+r)/2;
        
        while(l<=r){
            int mid = (l+r)>>1;
            if(A.get(mid) > A.get(mid-1) && A.get(mid) > A.get(mid+1))
                bi = mid;
            if(A.get(mid) > A.get(mid-1))
                l = mid + 1;
                else
                    r = mid - 1;
        }
        
        System.out.println(bi);
        l = 0;
        r = A.size() - 1;
        int res = -1;
        res = soln1(l, bi, A, B);
        if(res >= 0)
            return res;
        res = soln2(bi+1, r, A, B);
        if(res >= 0)
            return res;
        else
            return -1;
    }
    
    int soln1(int l, int r, ArrayList<Integer> A, int B){
        System.out.println(l + " " + r);
        while(l <= r){
            int mid = l + (r-l)/2;
            if(A.get(mid) == B)
                return mid;
            if(A.get(mid) < B)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    int soln2(int l, int r, ArrayList<Integer> A, int B){
        System.out.println(l + " " + r);
        while(l <= r){
            int mid = l + (r-l)/2;
            if(A.get(mid) == B)
                return mid;
            if(A.get(mid) > B)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i < in.length; i++){
            A.add(Integer.parseInt(in[i]));
        }
        int B = Integer.parseInt(br.readLine().trim());

        bitonicSearch s = new bitonicSearch();

        int res = s.solve(A, B);

        System.out.println(res);

        br.close();

    }
}
