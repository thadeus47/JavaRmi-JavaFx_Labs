//server code
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;	


public class Server extends HotelFX {//creating a server class that extends the fx class
	public Server(){}
	
	public static void main(String args[]){//this is a main method that expects an array of strings as parameters
		try{// excepton handlng 
			//Instantiating the implementation class
			 HotelFX obj = new HotelFX();
			 // remote object
			 
			 //Exporting the object of implementation class
			 //(Here we are exporting the remote object to the stub)
			 Hello stub = (Hello) UnicastRemoteObject.exportObject(obj,0);
			 
			 //Binding the remote object stub in the registry
			 Registry registry = LocateRegistry.getRegistry();
				
			 registry.bind("Hello", stub);
			 System.err.println("Server alpha Ready");
			 
 		}
		    catch(Exception e){
    System.err.println("Server exception :"+ e.toString());
    e.printStackTrace();
    }
	}
}