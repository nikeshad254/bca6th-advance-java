import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            RemoteInterface stub = (RemoteInterface) Naming.lookup("rmi://localhost/helloRemote");
            System.out.println(stub.getHello());
            System.out.println("Sum of 10,20: "+ stub.addNum(10,20));

        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
