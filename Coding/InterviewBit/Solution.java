package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int l = 0;
        int r = n-1;
        while(l<r){
            ArrayList<Integer> tem = a.get(l);
            a.set(l, a.get(r));
            a.set(r, tem);
            l++;
            r--;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                swap(i, j, a);
            }
        }

        System.out.println(a);
	}
    
    static void swap(int i, int j, ArrayList<ArrayList<Integer>> a){
        int temp = a.get(i).get(j);
        a.get(i).set(j, a.get(j).get(i));
        a.get(j).set(i, temp);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            int n = Integer.parseInt(br.readLine().trim());
            ArrayList<ArrayList<Integer>> a = new ArrayList<>(n);

            for(int i = 0; i < n; i++){
                ArrayList<Integer> ds = new ArrayList<>(n);
                String[] inputLine = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    ds.add(Integer.parseInt(inputLine[j]));
                }
                a.add(new ArrayList<>(ds));
            }

            rotate(a);
        }
    }
}
