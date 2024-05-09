package TCP.MultiThreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 6000);
        System.out.println("CLIENT CONNECTED TO SERVER");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        Scanner so = new Scanner(System.in);

        while (true) {
            System.out.println("Enter String to check : ");
            String a = so.next();
            out.writeUTF(a);

            if (a.equalsIgnoreCase("bye")) {
                break;
            } else {
                String ans = in.readUTF();
                System.out.println("Ans : " + ans);
            }

        }

        out.close();
        in.close();
        s.close();

    }

}