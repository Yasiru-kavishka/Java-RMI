import java.rmi.Naming;
import java.util.Scanner;

public class RmiClient{

	public static void main(String args[]){
		try{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int x = obj.nextInt();
			System.out.println("Enter second number: ");
			int y = obj.nextInt();
			MaxSelector stub=(MaxSelector)Naming.lookup("rmi://localhost:5050/max");
			System.out.println("Max = " + stub.selectMax(x,y));

		}catch(Exception e){
			System.out.println(e);
		}
	}

}