import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
private Client(){}
public static void main(String[]args){

try{
//getting the registry
Registry registry = LocateRegistry.getRegistry(null);

Hello stub = (Hello) registry.lookup("Hello");

stub.animation();

System.out.println("Remote method invoked");
}

catch(Exception e){
System.err.println("Client exception :"+e.toString());
e.printStackTrace();
}
}
}