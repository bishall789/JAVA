package URL;

import java.net.URL;

public class Exam {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("deprecation")
        URL url = new URL("https://ncit.com/student/se?name=ceraun&roll=5#fb");

        System.out.println("Default port : "+url.getDefaultPort());
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Host : "+url.getHost());
        System.out.println("Port : "+url.getPort());

        System.out.println("Authority : "+url.getAuthority());
        System.out.println("Path : "+url.getPath());
        System.out.println("Query : "+url.getQuery());
        System.out.println("File : "+url.getFile());

        System.out.println("Ref : "+url.getRef());


        

    }
    
}
