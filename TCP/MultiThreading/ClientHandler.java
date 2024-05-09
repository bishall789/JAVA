package TCP.MultiThreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler {

    Socket s;

    public ClientHandler(Socket s)
    {
        this.s=s;
    }
    

    public void run()
    {
        try{
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            while(true)
            {
                String a = in.readUTF();

                if(a.equalsIgnoreCase("bye"))
                {
                    break;
                }
                else
                {
                    String ans = isPalindrome(a);
                    out.writeUTF(ans);
                }
            }

            out.close();
            in.close();
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public String isPalindrome(String st)
    {
        String rev = "";

        for(int i=st.length()-1; i>=0; i-- )
        {
            rev = rev + st.charAt(i);
        }

        if(st.equalsIgnoreCase(rev))
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }


    }


    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
