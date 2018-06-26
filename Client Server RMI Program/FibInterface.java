import java.rmi.*;
public interface FibInterface extends Remote
    {
public int Course(int i) throws RemoteException;
public int Test(int j) throws RemoteException;
public int Question(int k) throws RemoteException;
    }
