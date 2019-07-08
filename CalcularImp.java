import java.util.Scanner;
public class CalcularImp{
	public static void main (String []args){
		float costo;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el precio: ");
		costo=lee.nextFloat();
		Impuesto obj= new Impuesto(costo);
		obj.Impues();
	}
}