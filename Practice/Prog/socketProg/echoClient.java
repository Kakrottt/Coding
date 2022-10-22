package Prog.socketProg;
import java.net.Socket;
import java.io.*;

public class echoClient {
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.println("Client Started!");
            try (Socket soc = new Socket("localhost", 3128)) {
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a String : ");
                String str = userInput.readLine();
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println(str);

                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println(in.readLine());
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
