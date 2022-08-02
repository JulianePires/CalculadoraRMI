import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SqrInterface extends Remote {
    public double sqr(double x) throws RemoteException;
}