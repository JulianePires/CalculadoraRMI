import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SenInterface extends Remote {
    public double sen(double x) throws RemoteException;
}
