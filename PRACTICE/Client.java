package PRACTICE;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.getRegistry();
        Common stub = (Common)reg.lookup("stub");
        System.out.println(stub.sayHello());
        
    }
    
}
