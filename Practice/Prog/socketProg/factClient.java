package Prog.socketProg;

import java.io.BufferedReader;
import java.net.Socket;
import java.io.*;

public class factClient {
    public static void main(String[] args) {
        // boolean flag = false;
        // do{
            try{
                System.out.println();
                System.out.println("Client Started!");
                System.out.println();
    
                Socket soc = new Socket("localhost", 3131);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a Number : ");
                // String str = userInput.readLine();
                int number = Integer.parseInt(userInput.readLine());
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println(number);
                System.out.println();
    
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println(in.readLine());
                System.out.println();
            }
    
            catch(Exception e){
                e.printStackTrace();
            }
        //     System.out.print("Do you want to connet to server : ");
        //     Scanner sc = new Scanner(System.in);
        //     char n = sc.next().charAt(0);

        //     if(n=='Y' || n=='y'){
        //         flag = true;
        //     }

        // } while(flag == true);
    }
}
