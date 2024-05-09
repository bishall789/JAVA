package INET;

import java.net.InetAddress;
import java.net.spi.InetAddressResolver;

public class Example {

    public static void main(String[] args) throws Exception{

        InetAddress inet = InetAddress.getByName("www.ncit.com");

        System.out.println("Host Name : "+inet.getHostName());
        System.out.println("IP Adress : "+inet.getHostAddress());


        InetAddress [] inetflix = InetAddress.getAllByName("www.netflix.com");

        for(InetAddress i:inetflix)
        {
            System.out.println("Host name : "+i.getHostName());
            System.out.println("IP address : "+i.getHostAddress());

        }

        InetAddress local = InetAddress.getLocalHost();

        System.out.println("Host name : "+local.getHostName());
        System.out.println("IP adress : "+local.getHostAddress());

        System.out.println("Is it a loopback : "+local.isLoopbackAddress());
        System.out.println("Is it a multicast : "+local.isMulticastAddress());

        System.out.println("Loop back Adress : "+InetAddress.getLoopbackAddress());


        
    }
    
}
