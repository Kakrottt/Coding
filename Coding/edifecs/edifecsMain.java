package edifecs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class edifecsMain {
    public static void main(String[] args) throws IOException{
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] input1 = br.readLine().trim().split(" ");
        String[] input2 = br.readLine().trim().split(" ");
        List<Integer> arr1 = new  ArrayList<>();
        List<Integer> arr2 = new  ArrayList<>();

        for(int i = 0; i < input1.length; i++){
            arr1.add(Integer.parseInt(input1[i]));
        }

        for(int i = 0; i < input2.length; i++){
            arr2.add(Integer.parseInt(input2[i]));
        }

        swapTopStack.swapTopOfStack(arr1, arr2);

        br.close();
    }
}
