
package dblab;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Creating remote interface for App

public interface Books extends Remote {
	void printMsg() throws RemoteException;
}