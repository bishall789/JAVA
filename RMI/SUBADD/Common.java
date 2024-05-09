package RMI.SUBADD;

import java.rmi.*;

public interface Common extends Remote {

    public int Add(int x,int y) throws Exception;
    public int Sub(int x,int y) throws Exception;


    
}
