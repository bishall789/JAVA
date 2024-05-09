package PRACTICE;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args)  throws Exception {
        Imp obj = new Imp();
        Common cmn = (Common)UnicastRemoteObject.exportObject(obj,0);
        Registry reg = LocateRegistry.getRegistry();
        reg.bind("stub",cmn);
        System.out.println("SERVER READY");
        
    }
    
}
