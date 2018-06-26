import java.rmi.Naming;
import java.rmi.server.*;
import java.rmi.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class FibServer extends UnicastRemoteObject implements FibInterface
 {
public FibServer() throws RemoteException{}
String S = new String(" Thank you");
public int Course(int i)
{
	int acc1 = 0;
	if(i >= i)
	{
		acc1 = 1;
	}
	return acc1;
}
public int Test(int j)
{  
	int acc2 = 0;
	if(j >=2)
	{
		acc2 = 1;
	}
	return acc2;
 }
 public int Question(int k)
{  
	int acc3 = 0;
	if(k >=2)
	{
		acc3 = 1;
	}
	return acc3;
 }
public static void main(String args[])
    {
try
       {
FibServer FS=new FibServer();
Naming.rebind("Add",FS);
System.out.println("server is connected and waiting for client....");
       }
catch(Exception e)
       {
System.out.println("Server could not connect +e");
       }
     }
 }
