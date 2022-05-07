package Prog.socketProg;

import java.net.ServerSocket;
import java.net.Socket;

public  class mainServer {
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.println("Waiting for the Client...");
            System.out.println();
            ServerSocket ss = new ServerSocket(8080);
            Socket soc = ss.accept();
            System.out.println("Connection Established!");
            System.out.println();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
