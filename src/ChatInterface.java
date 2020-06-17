
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sinan
 */
public interface ChatInterface extends Remote {

    public static final String REMOTE_REFERENCE = "chat";

    public void setName(String name) throws RemoteException;

    public String getName() throws RemoteException;

    public void send(String msg) throws RemoteException;

    public void addClient(ChatInterface client) throws RemoteException;

    public ArrayList<ChatInterface> getClients() throws RemoteException;
}