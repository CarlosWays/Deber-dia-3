import java.util.Scanner;
public class CalculaDesc{
	public static void main (String []args){
		float precio;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el precio: ");
		precio=lee.nextFloat();
		Descuento obj= new Descuento(precio);
		obj.Promocion();
	}
}