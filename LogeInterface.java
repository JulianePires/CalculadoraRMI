import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LogeInterface extends Remote {
    public double loge(double x) throws RemoteException;
}