package Striver.Recursion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class printSubsequence {
    static List<List<Integer>> printSub(int idx, ArrayList<Integer> list, ArrayList<Integer> ds, int n, List<List<Integer>> res){
        if(idx == n){
            if(ds.size()==3){
                System.out.println(ds);
                res.add(new ArrayList<>(ds));
            }
            return res;
        }

        ds.add(list.get(idx));
        printSub(idx+1, list, ds, n, res);
        ds.remove(ds.size()-1);

        printSub(idx+1, list, ds, n, res);
        return res;
    }
    
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(Integer.parseInt(in[i]));
        }

        List<List<Integer>> res = new ArrayList<>();

        printSub(0, arr, new ArrayList<>(), n, res);
        System.out.println(res);
        br.close();
        
        // System.out.println(arr);
        
    }
}
