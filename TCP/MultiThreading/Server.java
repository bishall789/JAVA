package TCP.MultiThreading;

import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(6000);
        System.out.println("SERVER RUNNING ON 6000");

        while(true)
        {
            Socket s = ss.accept();
            System.out.println("CLIENT CONNECTED");

            ClientHandler t = new ClientHandler(s);
            t.start();
        }


    }

}
