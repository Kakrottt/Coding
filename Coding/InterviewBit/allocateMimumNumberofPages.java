package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class allocateMimumNumberofPages {

    int alocatePages(List<Integer> arr, int students){
        if(students> arr.size())
            return -1;

        int l = max(arr);
        int r = totalSum(arr);
        int res = -1;

        System.out.println(l + " " + r);

        while(l <= r){
            int mid = (l + r) >> 1;
            if(isAllocate(arr, mid, students)){
                res = mid;
                r = mid - 1;
            }
            else
                l = mid+1;
        }
        return res;
    }

    int max(List<Integer> arr){
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            max = Math.max(max, arr.get(i));
        }
        return max;
    }

    int totalSum(List<Integer> arr){
        int sum = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    boolean isAllocate(List<Integer> arr, int barrier, int students){
        int allocateStudent = 1;
        int pages = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > barrier)
                return false;

            if((arr.get(i) + pages) > barrier){
                allocateStudent += 1;
                pages = arr.get(i);
            }
            else
                pages += arr.get(i);
        }

        return (allocateStudent<=students);
    }


    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0){
            String[] in = br.readLine().trim().split(" ");
            int n = in.length;
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                arr.add(Integer.parseInt(in[i]));
            }

            int x = Integer.parseInt(br.readLine().trim());

            allocateMimumNumberofPages t = new allocateMimumNumberofPages();
            int res = t.alocatePages(arr, x);
            System.out.println(res);
        }
        br.close();
    }
}
