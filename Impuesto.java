    
public class Impuesto{
	private float costo;
	public Impuesto(float costo){
		this.costo=costo;
		
	}
	public void setCosto(float costo){
		costo=costo;
	}
	public float getCosto(){
		return costo;
	}
	public void Impues(){
		float imp=0;
		imp=costo+((costo*12)/100);
		System.out.println("El valor con impuesto es:");
		System.out.println(imp);
	}
}