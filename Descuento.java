    
public class Descuento{
	private float precio;
	public Descuento(float precio){
		this.precio=precio;
		
	}
	public void setPrecio(float precio){
		precio=precio;
	}
	public float getPrecio(){
		return precio;
	}
	public void Promocion(){
		float rebaja;
		if(precio>=100){
			rebaja=precio-((precio*15)/100);
			System.out.println("El valor con rebaja es:");
			System.out.println(rebaja);
		}else{System.out.println("No aplica descuento.");
		}
	}
}