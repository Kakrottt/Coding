package Hashing;

// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class elementFrequency {
    public static void elementFreq(int[] arr) {
        // HashMap<Integer, Integer> m = new HashMap<>();

        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
        // for(int x : arr){
        //     m.put(x, m.getOrDefault(x, 0)+1);
        // }

        for (int i = 0; i < arr.length; i++) {
            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
            else
                m.put(arr[i], 1);
        }
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

    public static void printfrq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true)
                continue;
            int frq = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    frq++;
            }
            System.out.println(arr[i] + " " + frq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printfrq(arr);
        elementFreq(arr);

        sc.close();
    }
}
