import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Log10Interface extends Remote {
    public double log10(double x) throws RemoteException;
}