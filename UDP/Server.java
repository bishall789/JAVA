package UDP;

import java.net.*;


public class Server {
    public static void main(String[] args) throws Exception {

        DatagramSocket server = new DatagramSocket(9000);
        System.out.println("SERVER RUNNING");

        byte[]rxBuffer = new byte[1024];

        DatagramPacket rxPacket = new DatagramPacket(rxBuffer,rxBuffer.length);
        server.receive(rxPacket);

        String msg = new String(rxPacket.getData());
        System.out.println("MSG : "+msg);

        String reply = msg.toUpperCase();
        byte[]snBuffer = reply.getBytes();

        InetAddress clientAdd = rxPacket.getAddress();

        int clientPort = rxPacket.getPort();

        DatagramPacket replying = new DatagramPacket(snBuffer,snBuffer.length,clientAdd,clientPort);

        server.send(replying);
        server.close();

 }

   

    

}
