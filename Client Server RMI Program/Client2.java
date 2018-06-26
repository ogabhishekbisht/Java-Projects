import java.rmi.Naming;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Client2
  {
public static void main(String args[])
{  

try

{
	Scanner sc = new Scanner(System.in);
	FibInterface fi=(FibInterface)Naming.lookup("//127.0.0.1/Add");
	int acc = 2;
	int access;
	System.out.print("\n\n ********Welcome to the Premium version of Ankur Tutorial*********" );
	System.out.print("\n\n\n*Enjoy the Premium version..");
	System.out.print("\n\n Select:\n1.Course\n2.Test\n3.Exam Question \nEnter your choice = ");
	int choi =  sc.nextInt();
	System.out.print("\n\nCheckng whether you have access for course");
	for(int i = 0; i < 8; i++)
		
		{
			System.out.print(". ");
			TimeUnit.SECONDS.sleep(1);
		}
	if(choi == 1)
{
	access = fi.Course(acc);
		
	if(access == 1)
	{
		System.out.print("\n\nYou have access for the course!!");
		 int c,c1;
		 System.out.println("\n\t\t\t\t\tABOUT COURSE\t\t\t\t\n");
		 
         System.out.println("A distributed system is a software system in which components located on networked computers \ncommunicate and coordinate their actions by passing messages. ");
		 
		 System.out.println("The components interact with each other in order to achieve a common goal.");
		 
		 System.out.println("This course teaches you about CORBA,EJB & RMI\n");
		 
		 
		 System.out.println("\t\t\t\t\tPRE-REQUISITES\t\t\t\t\n");
		  System.out.println("Minimum: Data Structures and Algorithms\nIdeal: Basic networking concepts, Basic OS concepts . \nAdvanced Programming (Good knowledge in C and C++)\n");
		 
		 System.out.println("\t\t\t\t\tSUGGESTED READING:\t\t\t\t\n");
		 System.out.println("Text Books:\n");
		 System.out.println("Distributed Computing: Principles, Algorithms, and Systems- Ajay D. Kshemkalyani and Mukesh Singhal\nDistributed Computing: Fundamentals, Simulations and Advanced Topics-Hagit Attiya and Jennifer Welch\n");
		 System.out.println("Reference Book:\n");
		 System.out.println("Distributed Algorithms-Nancy Lynch\n");
		 
		 
		 
		 
		  System.out.println("\t\t\t\t\tselect the option\t\t\t\t\n");
		  System.out.println("1)RMI\n");
		 
		 System.out.println("2)EJB\n");
		 
		 System.out.println("3)CORBA\n");
		 System.out.println("4)EXIT\n");
		// Scanner sc=new Scanner(System.in);
		 c=sc.nextInt();
		 
		 switch(c)
		   {
		 case 1:
			 
			 System.out.println("\t\t\t\t\tRMI (Remote Method Invocation)\t\t\t\t\n");
			 
			 System.out.println("The RMI (Remote Method Invocation) is an API that provides a mechanism to create distributed application in java.\nThe RMI allows an object to invoke methods on an object running in another JVM.\nThe RMI provides remote communication between the applications using two objects stub and skeleton.\n");
			 
			  System.out.println("Do you want to learn about STUB and SKELETON??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  c1=sc.nextInt();
		      if(c1==1)
			  {
			 System.out.println("\t\t\t\t\tUnderstanding stub and skeleton\t\t\t\t\n");
			 
			 System.out.println("RMI uses stub and skeleton object for communication with the remote object.\nA remote object is an object whose method can be invoked from another JVM. Let's understand the stub and skeleton objects:\n");
			 
			 
			 
			 System.out.println("\t\t\t\t\tStub\t\t\t\t\n");
			 System.out.println("The stub is an object, acts as a gateway for the client side.\n All the outgoing requests are routed through it. \nIt resides at the client side and represents the remote object. \nWhen the caller invokes method on the stub object, it does the following tasks:\n");
			 System.out.println("1.It initiates a connection with remote Virtual Machine (JVM),\n2.It writes and transmits (marshals) the parameters to the remote Virtual Machine (JVM),\n3.It waits for the result\n4.It reads (unmarshals) the return value or exception, and\5.It finally, returns the value to the caller.\n");
			 System.out.println("\t\t\t\t\tskeleton\t\t\t\t\n");
			 System.out.println("The skeleton is an object, acts as a gateway for the server side object. \nAll the incoming requests are routed through it. \nWhen the skeleton receives the incoming request, it does the following tasks:\n");
			 System.out.println("1.It reads the parameter for the remote method\n2.It invokes the method on the actual remote object, and\n3.It writes and transmits (marshals) the result to the caller.\n");
			
			  }
			  else 
				  System.exit(0);
			  System.out.println("Do you want to explore steps to write RMI program??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c11=sc.nextInt();
			  if(c11==1)
			  {
			System.out.println("\t\t\t\t\tSteps to write RMI program\t\t\t\t\n");
			 System.out.println("The is the 6 steps to write the RMI program.\n1.Create the remote interface\n2.Provide the implementation of the remote interface\n3.Compile the implementation class and create the stub and skeleton objects using the rmic tool\n4.Start the registry service by rmiregistry tool\n5.Create and start the remote application\n6.Create and start the client application\n");
			  
			  }
			  else
				  System.exit(0);
			  break;
			case 2:
			 
			 
			 
			 System.out.println("\t\t\t\t\tWhat is EJB\t\t\t\t\n");
			 System.out.println("EJB is an acronym for enterprise java bean. \nIt is a specification provided by Sun Microsystems to develop secured, robust and scalable distributed applications.\n");
			 System.out.println("To run EJB application, you need an application server (EJB Container) such as Jboss, Glassfish, Weblogic, Websphere etc. \nIt performs:\n1.life cycle management,\n2.security,\n3.transaction management, and0\n4.object pooling.\n");
			 System.out.println("EJB application is deployed on the server, so it is called server side component also.\nEJB is like COM (Component Object Model) provided by Microsoft. But, it is different from Java Bean, RMI and Web Services.\n");
			 System.out.println("Do you want to know when to use EJB??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c2=sc.nextInt();
			  if(c2==1)
			  {
			 System.out.println("\t\t\t\t\tWhen use Enterprise Java Bean?\t\t\t\t\n");
			 System.out.println("\n1 Application needs Remote Access. In other words, it is distributed.\n2 Application needs to be scalable. EJB applications supports load balancing, clustering and fail-over.\n3Application needs encapsulated business logic. EJB application is separated from presentation and persistent layer.\n");
			  }
			  else
				  System.exit(0);
			  System.out.println("Do you want to learn about type of EJB??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c21=sc.nextInt();
			  if(c21==1)
			  {
			System.out.println("\t\t\t\t\tTypes of Enterprise Java Bean\t\t\t\t\n");
			 System.out.println("There are 3 types of enterprise bean in java.\n");
			 System.out.println("\t\t\t\t\tSession Bean\t\t\t\t\n");
			 System.out.println("Session bean contains business logic that can be invoked by local, remote or webservice client.\n");
			 System.out.println("\t\t\t\t\tMessage Driven Bean\t\t\t\t\n");
			 System.out.println("Like Session Bean, it contains the business logic but it is invoked by passing message.\n");
			 System.out.println("\t\t\t\t\tEntity Bean\t\t\t\t\n");
			 System.out.println("It encapsulates the state that can be persisted in the database. It is deprecated. Now, it is replaced with JPA (Java Persistent API).\n");
			
			  }			
			  else
				  System.exit(0);
			  
			  System.out.println("Do you want to explore disadvantages of EJB??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c22=sc.nextInt();
			  if(c22==1)
			  {
			  System.out.println("\t\t\t\t\tDisadvantages of EJB\t\t\t\t\n");
			 System.out.println("1.Requires application server\n2.Requires only java client. For other language client, you need to go for webservice.\n3.Complex to understand and develop ejb applications.\n");
			  }
			  else
				  System.exit(0);
			 break;
			 case 3:
			 
			 System.out.println("\t\t\t\t\tWhat is CORBA\t\t\t\t\n");
			 System.out.println("The Common Object Request Broker Architecture (CORBA) is a standard defined by the Object Management Group (OMG) designed to facilitate the communication of systems that are deployed on diverse platforms.\n CORBA enables collaboration between systems on different operating systems, programming languages, and computing hardware. \nCORBA uses an object-oriented model although the systems that use the CORBA do not have to be object-oriented. \nCORBA is an example of the distributed object paradigm.\n");
			System.out.println("Do you want to learn about the features??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c3=sc.nextInt();
               if(c3==1)
			   {
			System.out.println("\t\tFeatures\t\t\t\t\n");
			 System.out.println("\t\t\t\t\t1.Objects By Reference\t\t\t\t\n");
			 System.out.println("This reference is either acquired through a stringified Uniform Resource Locator (URL), NameService lookup (similar to Domain Name System (DNS)), or passed-in as a method parameter during a call.\n");
			  System.out.println("\t\t2.Data By Value\t\t\t\t\n");
			 System.out.println("The CORBA Interface Definition Language provides the language- and OS-neutral inter-object communication definition. CORBA Objects are passed by reference, while data (integers, doubles, structs, enums, etc.) are passed by value. The combination of Objects-by-reference and data-by-value provides the means to enforce strong data typing while compiling clients and servers, yet preserve the flexibility inherent in the CORBA problem-space.\n");
			 System.out.println("\t\tObjects By Value (OBV)\t\t\t\t\n");
			 System.out.println("Apart from remote objects, the CORBA and RMI-IIOP define the concept of the OBV and Valuetypes. The code inside the methods of Valuetype objects is executed locally by default. If the OBV has been received from the remote side, the needed code must be either a priori known for both sides or dynamically downloaded from the sender. To make this possible, the record, defining OBV, contains the Code Base that is a space-separated list of URLs whence this code should be downloaded. The OBV can also have the remote methods.\n");
			   }
			   else
				   System.exit(0);
			   
			   System.out.println("Do you want to explore the benefits and problems??\n");
			  System.out.println("press 1 for yes and 0 for no\n");
			  int c31=sc.nextInt();
			  if(c31==1)
			  {
			System.out.println("\t\t\t\t\tBenefits\t\t\t\t\n");
			 System.out.println("1.Language independence\n2.OS-independence\n3.Freedom from technologies\n4.Data-typing\n5.High tunability\n");
			 System.out.println("\t\t\t\t\tProblems\t\t\t\t\n");
			 
			 
			 System.out.println("While CORBA delivered much in the way code was written and software constructed, it has been the subject of criticism.[6]Much of the criticism of CORBA stems from poor implementations of the standard and not deficiencies of the standard itself. Some of the failures of the standard itself were due to the process by which the CORBA specification was created and the compromises inherent in the politics and business of writing a common standard sourced by many competing implementors.\n");
			 System.out.println("1.Initial implementation incompatibilities\n2.Location transparency\n3.Design and process deficiencies\n4.Problems with implementations\n");
			  }
			  else
				  System.exit(0);
			 break;
			 
			 case 4:
			 System.exit(0);
			 break;
		default: System.out.println("wrong input,try again");
		}
		
	}
}


	if (choi == 2)
	{
		access = fi.Test(acc);
		if (access == 1)
		{  
			System.out.println("Time to Test!");
			System.out.print("\n\nWait for a while, till it loads essentials...\n\nLOADING ");
		for(int i = 0; i < 6; i++)
		
		{
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
		}
			System.out.println("Enter your choice:");
			System.out.println("1.Test1-RMI ");
			System.out.println("2.Test2-EJB");
			System.out.println("3.Test3-CORBA");
			int a,b,c,d,e,f,count=0;
			   //Scanner sc=new Scanner(System.in);  
			a=sc.nextInt();  
			
	
			switch(a)
			{
				case 1:
			{
				System.out.println("1. Which of these package is used for remote method invocation?	\n 1) java.applet \n 2) java.rmi \n 3) java.lang.rmi \n 4) java.lang.reflect");
				b=sc.nextInt();  
				if(b==2)
					count++;
				System.out.println("2. Which of these methods are member of Remote class?\n 1) checkIP()\n 2) addLocation()\n 3) AddServer()\n 4) None of the mentioned");
				c=sc.nextInt();  
				if(c==4)
					count++;
				System.out.println("3. Which of these Exceptions is thrown by remote method?\n 1) RemoteException\n 2) InputOutputException\n 3) RemoteAccessException\n 4) RemoteInputOutputException");
				d=sc.nextInt();  
				if(d==1)
					count++;
				System.out.println("4.In RMI Architecture which layer Intercepts method calls made by the client/redirects these calls to a remote RMI service? \n 1. Stub & Skeleton Layer\n2. Application Layer\n3. Remote Reference Layer\n4. Transport Layer");
				e=sc.nextInt();  
				if(e==1)
					count++;
				System.out.println("5.In RMI, the objects are passed by _____. \n 1. Value\n b. Reference\n 2. Value and Reference\n 3. None of the above");
				f=sc.nextInt();
				if(f==1)
					count++;
				System.out.println("your total score in Test1-RMI is: "+count+"/5");
	}
	break;
	case 2:
	{
		System.out.println("1.EJB QL is a Query Language provided for navigation across a network of enterprise beans and dependent objects defined by means of container managed persistence. \n 1. True\n 2. False");
		b=sc.nextInt();  
			if(b==1)
				count++;
		System.out.println("2.A message driven bean is like statefull session bean that encapsulates the business logic and doesn't maintain state. \n 1. True\n 2. False");
		c=sc.nextInt();  
			if(c==2)
				count++;
		System.out.println("3.Abbreviate the term JMS?\n 1. Java Message Service\n2. Java Monitor Service\n3. Java Message Session\n 4. Java Monitor Session");
		d=sc.nextInt();  
			if(d==1)
				count++;
		System.out.println("4.JMS is mainly used to send and receive message from one application to another. \n 1. True\n 2. False");
		e=sc.nextInt();  
			if(e==1)
				count++;
		System.out.println("5.Which session bean maintain their state between client invocations but are not required to maintain their state across server crashes or shutdowns? \n 1. Stateful Session Bean\n 2. Stateless Session Bean\n 3. Singleton Session Bean\n 4. None of the above");
		f=sc.nextInt();  
			if(f==3)
				count++;
		System.out.println("your total score in Test2-EJB is: "+count+"/5");
	}
	break;
	case 3:
	{
		System.out.println("1.Object reference in CORBA is acquired through?\n 1. Uniform Resource Locator (URL)\n2. NameService lookup (similar to Domain Name System (DNS))\n3. Passed-in as a method parameter during a call.\n4. All of the above");
		b=sc.nextInt();
		if(b==4)
				count++;
		System.out.println("2.CORBA Objects are passed by reference, while data (integers, doubles, structs, enums, etc.) are passed by value.\n 1. True\n2. False");
		c=sc.nextInt();
		if(c==1)
				count++;
		System.out.println("3._____ is an abstract protocol by which Object request brokers (ORBs) communicate.\navigation.\n1. GIOP \n2. IOR\n3. DIOP \n4. None of the above");
		d=sc.nextInt();
		if(d==1)
			count++;
		System.out.println("4.What IDL class contains methods to invoke remote object?\n1. Helper class \n2. Holder class \n3. Implementation class \n4. Operation class");
		e=sc.nextInt();
		if(e==3)
			count++;
		System.out.println("4.What IDL class contains methods to typecast objects from common objects to server objects\n1. Helper class \n2. Holder class \n3. Implementation class \n4. Operation class");
		f=sc.nextInt();
		if(f==2)
			count++;
		System.out.println("your total score in Test3-CORBA is: "+count+"/5");
	}
	break;
	case 4:
		System.exit(0);
	break;
	default:
        System.out.println("invalid input");
	break;
			}
		}
		else
		{
			System.out.print("\n\nYou do not have access for it. Please upgrade your subscription! Thank you");
			System.exit(0);
		}
	}
	
	if (choi == 3)
	{
		access = fi.Question(acc);
		if (access == 1)
		{
//Scanner sc = new Scanner(System.in);
System.out.print("\nSelect the  topic: \n1.Rmi\n2.Ejb\n3.Corba\nEnter your choice = ");
int choii = sc.nextInt();
int choiii;
if(choii == 1)
{
	while(true)
	{
		System.out.print("\n\n\n\n1.What is RMI ?\n2.What is the basic principle of RMI architecture ?\n3.What is the role of Remote Interface in RMI ?\n4.What is the role of the java.rmi.Naming Class ?\n5.What is meant by binding in RMI ?\n6.Exit\n\nSelect for answer = ");
		choiii = sc.nextInt();
		if( choiii == 1)
		{
			System.out.print("\nThe Java Remote Method Invocation (Java RMI) is a Java API that performs the object-oriented equivalent of remote procedure calls (RPC), with support for direct transfer of serialized Java classes and distributed garbage collection. Remote Method Invocation (RMI) can also be seen as the process of activating a method on a remotely running object. RMI offers location transparency because a user feels that a method is executed on a locally running object. Check some RMI Tips here.");
		}
		else if( choiii == 2)
		{
			System.out.print("\nThe RMI architecture is based on a very important principle which states that the definition of the behavior and the implementation of that behavior, are separate concepts. RMI allows the code that defines the behavior and the code that implements the behavior to remain separate and to run on separate JVMs.");
		}
		else if( choiii == 3)
		{
			System.out.print("\nThe Remote interface serves to identify interfaces whose methods may be invoked from a non-local virtual machine. Any object that is a remote object must directly or indirectly implement this interface. A class that implements a remote interface should declare the remote interfaces being implemented, define the constructor for each remote object and provide an implementation for each remote method in all remote interfaces.");
		}
		else if( choiii == 4)
		{
			System.out.print("\nThe java.rmi.Naming class provides methods for storing and obtaining references to remote objects in the remote object registry. Each method of the Naming class takes as one of its arguments a name that is a String in URL format.");
		}
		else if( choiii == 5)
		{
			System.out.print("\nBinding is the process of associating or registering a name for a remote object, which can be used at a later time, in order to look up that remote object. A remote object can be associated with a name using the bind or rebind methods of the Naming class.");
		}
		else if( choiii == 6)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("\nWrong Choice!! Try again!!");
		}
	}
}



if(choii == 2)
{
	while(true)
	{
		System.out.print("\n\n\n1.What is EJB?\n2.What are the benefits of EJB?\n3.What is a Session Bean in EJB?\n4.What is Stateful Session Bean in EJB?\n5.What is Stateless Session Bean in EJB?\n6.Exit\n\nSelect for answer = ");
		choiii = sc.nextInt();
		if( choiii == 1)
		{
			System.out.print("\nEJB stands for Enterprise Java Beans. EJB is an essential part of a J2EE platform. J2EE platform have component based architecture to provide multi-tiered, distributed and highly transactional features to enterprise level applications.EJB provides an architecture to develop and deploy component based enterprise applications considering robustness, high scalability and high performance. An EJB application can be deployed on any of the application server compliant with J2EE 1.3 standard specification.");
		}
		else if( choiii == 2)
		{
			System.out.print("\nFollowing are the key benefits of EJB.Simplified development of large scale enterprise level application.Application Server/ EJB container provides most of the system level services like transaction handling, logging, load balancing, persistence mechanism, exception handling and so on. Developer has to focus only on business logic of the application.EJB container manages life cycle of ejb instances thus developer needs not to worry about when to create/delete ejb objects.");
		}
		else if( choiii == 3)
		{
			System.out.print("\nSession bean stores data of a particular user for a single session. It can be stateful or stateless. It is less resource intensive as compared to entity beans. Session bean gets destroyed as soon as user session terminates.");
		}
		else if( choiii == 4)
		{
			System.out.print("\nA stateful session bean is a type of enterprise bean which preserve the conversational state with client. A stateful session bean as per its name keeps associated client state in its instance variables. EJB Container creates a separate stateful session bean to process client's each request. As soon as request scope is over, statelful session bean is destroyed.");
		}
		else if( choiii == 5)
		{
			System.out.print("\nA stateless session bean is a type of enterprise bean which is normally used to do independent operations. A stateless session bean as per its name does not have any associated client state, but it may preserve its instance state. EJB Container normally creates a pool of few stateless bean's objects and use these objects to process client's request. Because of pool, instance variable values are not guaranteed to be same across lookups/method calls.");
		}
		else if( choiii == 6)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("\nWrong Choice!! Try again!!");
		}
	}
}

if(choii == 3)
{
	while(true)
	{
		System.out.print("\n1.What is CORBA?\n2.What does CORBA provide?\n3.What does Java offer CORBA Programmers?\n4.Name some of the CORBA development tools?\n5.What are the ORBlets?\n6Exit\n\nSelect for answer = ");
		choiii = sc.nextInt();
		if( choiii == 1)
		{
			System.out.print("\nCommon Object Request Broker Architecture (CORBA) is an object model used in distributed computing.");
		}
		else if( choiii == 2)
		{
			System.out.print("\nCORBA provides an infrastructure, which enables invocations of operations on objects located anywhere on a network, as if they were local to the application using them.");
		}
		else if( choiii == 3)
		{
			System.out.print("\nPortability across platforms\nInternet programming\nObject oriented language\nSecurity");
		}
		else if( choiii == 4)
		{
			System.out.print("\nSun’s JOE: Java Object Environment (available with JDK1.2),IONA’s ObixWeb,Visigenics VisiBroker (being supported by Netscape and Oracle),IBM’s BOSS (Business Object Server Solution),Hp’s ORB Plus.");
		}
		else if( choiii == 5)
		{
			System.out.print("\nCORBA - enabled applets can be loaded, on client-side, into any commercial Java enabled browser and can then be executed. These downloadable ORBs are also called ORBlets.");
		}
		else if( choiii == 6)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("\nWrong Choice!! Try again!!");
		}
	}
}

		}		
			
			
		
		else
		{
			System.out.print("\n\nYou do not have access for it. Please upgrade your subscription! Thank you");
			System.exit(0);
		}
	}
	else
	{
		System.out.print("\n\n\nWrong Choice....");
		System.exit(0);
	}
	
}	
	catch(Exception e)
           {
System.out.println("client exception:"+e);
           }
     }
  }