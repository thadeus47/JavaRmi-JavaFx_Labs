/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author user
 */
public interface Hello extends Remote{//creating remote interface that extends remote
    void animation()throws RemoteException;//throw the exceptions to prevent network issues during a remote call
    
}
