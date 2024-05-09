package UDP;

import java.net.InetAddress;
import java.net.spi.InetAddressResolver;

import java.net.*;


public class Client {
    public static void main(String[] args) throws Exception {

        DatagramSocket client = new DatagramSocket();

        String msg = "hello ";
        byte[]snBuffer = msg.getBytes();

        InetAddress serverAdd = InetAddress.getLocalHost();

        DatagramPacket snPacket = new DatagramPacket(snBuffer,snBuffer.length,serverAdd,9000);
        client.send(snPacket);
        byte[]rxBuffer = new byte[1024];

        DatagramPacket rxPacket = new DatagramPacket(rxBuffer,rxBuffer.length);
        client.receive(rxPacket);

        String response = new String(rxPacket.getData());
        System.out.println("Ans : "+response);

        client.close();

 }


    
}
