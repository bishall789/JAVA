package TCP.Palindrome;

import java.net.*;
import java.io.*;

public class Serverr {

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(6000);
        System.out.println("SERVER RUNNING ON 6000");

        Socket s = ss.accept();
        System.out.println("CLIENT CONNECTED");

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
        s.close();
        ss.close();


        }

        public static String isPalindrome(String st)
        {
            String rev = "";

            for(int i=st.length()-1; i>=0; i--)
            {
                rev = rev+st.charAt(i);
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



        
    }


