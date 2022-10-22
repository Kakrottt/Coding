package Prog.socketProg;

import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

import java.io.*;

public class echoServer {
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.println("Waiting for the Connection...");
            try (ServerSocket ss = new ServerSocket(3128)) {
                Socket soc = ss.accept();
                System.out.println("Connection Established!!");
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String str = in.readLine();
                System.out.println("Client Request : " + str);
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println("Server Say : " + str);
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
