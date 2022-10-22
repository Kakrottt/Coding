package Striver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class allocateBooks {

    private static int allocateBooksSoln(int n, ArrayList<Integer> A, int student){
        if(student>n)
            return -1;
        int l = maxNum(A);
        int r = sum(A);
        int res = -1;
        // System.out.println(l + " " + r);

        while(l<=r){
            int mid = (l + r)>>1;
            // System.out.println(l + " " + r + " " + mid);
            if(isAllocation(mid, A, student)){
                res = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return res;
    }

    static int maxNum(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) > max)
                max = A.get(i);
        }
        return max;
    }

    static int sum(ArrayList<Integer> A){
        int totalSum = 0;
        for(int i = 0; i < A.size(); i++){
            totalSum += A.get(i);
        }
        return totalSum;
    }

    static boolean isAllocation(int barrier, ArrayList<Integer> A, int student){
        int allocatedStudens = 1;
        int pages = 0;

        for(int i = 0; i < A.size(); i++){
            if(A.get(i) > barrier)
                return false;
            if((pages + A.get(i)) > barrier){
                allocatedStudens += 1;
                pages = A.get(i);
            } else {
                pages += A.get(i);
            }
        }

        return allocatedStudens <= student;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
//        Scanner sc = new Scanner(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int t = Integer.parseInt(br.readLine());

            while(t--> 0){
            	int n = Integer.parseInt(br.readLine().trim());
                int student = Integer.parseInt(br.readLine().trim());  
                ArrayList<Integer> arr = new ArrayList<>(n);
                String[] inputLine = br.readLine().trim().split(" ");
                for(int i = 0; i < n; i++){
                    arr.add(Integer.parseInt(inputLine[i]));
                }

                System.out.println(allocateBooksSoln(n, arr, student));
            }
            //sc.close();
        }
    }
}
