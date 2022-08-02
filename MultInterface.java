import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MultInterface extends Remote {
    public double mult(double x, double y) throws RemoteException;
}
