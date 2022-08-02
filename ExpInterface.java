import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ExpInterface extends Remote {
    public double exp(double x) throws RemoteException;
}