package InterviewBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class morethanbyK {
    public static int majorityElement(final List<Integer> A) {
        int n = A.size();
        int res = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
        }

        for(int x:map.keySet()){
            if(map.get(x) > n/2)
                res = x;
        }
        
        return res;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("input.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
        //int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Integer> A = new ArrayList<>();
        String[] inputLine = br.readLine().trim().split(", ");
        // try (PrintStream out = new PrintStream(new FileOutputStream("output.txt"))) {
        //    out.println(inputLine.length) ; 
        // }
            for(int i = 0; i < inputLine.length; i++){
                A.add(Integer.parseInt(inputLine[i]));
            }
            

            System.out.println(majorityElement(A));
        }
    }
}
