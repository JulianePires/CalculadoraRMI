import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DivInterface extends Remote {
    public double div(double x, double y) throws RemoteException;
}
