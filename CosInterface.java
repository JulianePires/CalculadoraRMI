import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CosInterface extends Remote {
    public double cos(double x) throws RemoteException;
}
