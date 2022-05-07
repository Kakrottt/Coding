package Prog.socketProg;

import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class factServer {
        public static void main(String[] args) {
            try{
                System.out.println();
                System.out.println("Waiting for Connection...");
                ServerSocket ss = new ServerSocket(3131);
                Socket soc = ss.accept();
                System.out.println();
                System.out.println("Connection Established!! ");

                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                // String str = in.readLine();
                int number = Integer.parseInt(in.readLine());
                
                System.out.println();
                System.out.println("Client Request the Factorial of : " + number);
                int x = calcfact(number);    
                
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println("Server Says : The factorial of " + number + " is : " + x);
                System.out.println();

            }

            catch(Exception e){
                e.printStackTrace();
            }
        }
    
        static int calcfact(int number){
            int fact = 1;
            for(int i=1; i<=number; i++){
                fact *= i;
            }
            return fact;
        }
}

