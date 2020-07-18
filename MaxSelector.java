import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MaxSelector extends Remote{

    public int selectMax(int x,int y)throws RemoteException;
}
