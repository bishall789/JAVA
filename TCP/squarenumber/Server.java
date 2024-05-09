package TCP.squarenumber;

    
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("SERVER RUNNING ON 5000");

        Socket s = ss.accept();
        System.out.println("CLIENT CONNECTED");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int num = in.readInt();
        int result = num * num;
        out.writeInt(result);

        out.close();
        in.close();
        s.close();
        ss.close();
 }

}


    
    


