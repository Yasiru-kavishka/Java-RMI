import java.rmi.*;
import java.rmi.registry.*;

public class RmiServer{

	public static void main(String args[]){
		try{
			MaxSelector stub=new MaxSelectorImpl();
			Naming.rebind("rmi://localhost:5050/max",stub);
	
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
