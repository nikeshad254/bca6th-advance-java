import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String getHello() throws RemoteException;
    int addNum(int num1, int num2) throws RemoteException;
}
