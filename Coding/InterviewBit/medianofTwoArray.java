package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class medianofTwoArray {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size()<b.size())
            return findMedianSortedArrays(b, a);
        int n1 = a.size();
        int n2 = b.size();
            
        int l = 0; int r = n1;
        System.out.println(r);
        
        while(l <= r){
            int cut1 = (l + r) >> 1;
            int cut2 = (n1 + n2 + 1)/2 - cut1;
            
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : a.get(cut1 - 1);
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : b.get(cut2 - 1);
            
            int r1 = cut1 >= n1 ? Integer.MAX_VALUE : a.get(cut1);
            int r2 = cut2 >= n2 ? Integer.MAX_VALUE : b.get(cut2);
            
            if(l1 <= r2 && l2 <= r1){
                if((n1 + n2) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                else
                    return Math.max(l1, l2);
            }
            else if(l1 > r2)
                r = cut1 - 1;
            else
                l = cut1 + 1;
        }
        return 0.0;        
	}

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in1 = br.readLine().trim().split(", ");
        String[] in2 = br.readLine().trim().split(", ");
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i = 0; i < in1.length; i++){
            a.add(Integer.parseInt(in1[i]));
        }
        for(int i = 0; i < in2.length; i++){
            b.add(Integer.parseInt(in2[i]));
        }

        medianofTwoArray s = new medianofTwoArray();

        double res = s.findMedianSortedArrays(a,b);

        System.out.println(res);

        br.close();
    }
}
