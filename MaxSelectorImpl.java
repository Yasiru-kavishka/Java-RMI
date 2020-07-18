import java.rmi.*;
import java.rmi.server.*;

public class MaxSelectorImpl extends UnicastRemoteObject implements MaxSelector{

	MaxSelectorImpl()throws RemoteException{
		super();
	}

	public int selectMax(int x,int y){
		if(x>=y) {
			return x;
		}
		else {
			return y;
		}
	}
}