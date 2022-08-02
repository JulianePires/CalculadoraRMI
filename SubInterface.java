import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubInterface extends Remote {
    public double sub(double x, double y) throws RemoteException;
}