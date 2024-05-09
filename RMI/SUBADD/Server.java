package RMI.SUBADD;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Server {
    public static void main(String[] args) throws Exception {

        Imp obj = new Imp();
        Common cmn = (Common)UnicastRemoteObject.exportObject((Remote) obj,0);
        Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        reg.bind("stub",cmn);
        System.out.println("SERVER READY");


    }
}
