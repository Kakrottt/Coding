package Striver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class permutation {
    static void soln(List<Integer> arr) throws FileNotFoundException{
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(arr);
        // int n = arr.size();
        // boolean[] flag = new boolean[n];
        // printPermutationNaive(n, arr, flag, new ArrayList<>(), ans);
        
        printPermutation2(0, arr, ans);

        PrintWriter out = new PrintWriter("output.txt");
        out.print(ans);
        out.close();
        // System.out.println(ans);
    }

    static void printPermutation2(int idx, List<Integer> arr, List<List<Integer>> ans){
        if(idx == arr.size()){
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i = idx; i < arr.size(); i++){
            swap(i, idx, arr);
            printPermutation2(idx+1, arr, ans);
            swap(i, idx, arr);
        }
    }

    static void swap(int i, int idx, List<Integer> arr){
        int t = arr.get(i);
        arr.set(i, arr.get(idx));
        arr.set(idx, t);
    }

    static void printPermutationNaive(int n, List<Integer> arr, boolean[] flag, ArrayList<Integer> ds, List<List<Integer>> ans) throws FileNotFoundException{
            if(ds.size() == n)
                ans.add(new ArrayList<>(ds));

        for(int i = 0; i < n; i++){
            if(flag[i] || i > 0 && arr.get(i) == arr.get(i-1) && !flag[i-1])
                continue;
                
            flag[i] = true;
            ds.add(arr.get(i));
            printPermutationNaive(n, arr, flag, ds, ans);
            flag[i] = false;
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) throws IOException{
        File file = new File("input.txt");
        BufferedReader  br= new BufferedReader(new FileReader(file));

        String[] inputLine = br.readLine().trim().split(" ");
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < inputLine.length; i++){
            arr.add(Integer.parseInt(inputLine[i]));
        }

        soln(arr);

        br.close();
    }
}
