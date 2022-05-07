package Prog.socketProg;

import java.net.Socket;

public class mainClient {
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.println("Client Started!");
            Socket soc = new Socket("localhost", 8080);
            System.out.println();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
