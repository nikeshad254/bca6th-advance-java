import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface{
    protected RemoteImpl() throws RemoteException {
    }

    @Override
    public String getHello() throws RemoteException {
        return "Hello World";
    }

    @Override
    public int addNum(int num1, int num2) throws RemoteException {
        return num1 + num2;
    }

}
