package TCP.squarenumber;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",5000);
        System.out.println("Connected with Server");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int num = 4;
        out.writeInt(num);
        int ans = in.readInt();

        System.out.println("Square Number :  "+ans);

        out.close();
        in.close();
        s.close();

        
    }
    
}
