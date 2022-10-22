package Striver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class outFile {
    public static void main(String[] args) throws IOException {
        File file = new File("bootstrapIn.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String[] in = br.readLine().trim().split("}");
            try (PrintWriter out = new PrintWriter("output.txt")) {
                for(int i = 0; i < in.length; i++){
                    out.println(in[i]);;
                }
            }
        }
    }
}
