import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumInterface extends Remote {
    public double sum(double x, double y) throws RemoteException;
}