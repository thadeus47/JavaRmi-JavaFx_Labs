import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{
	void animation() throws RemoteException;
}