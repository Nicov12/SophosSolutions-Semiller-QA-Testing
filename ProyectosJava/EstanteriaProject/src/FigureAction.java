
public class FigureAction extends Productos implements IDiscount{
	
	private double peso;
	
	public FigureAction(String name, String desciption, int precio,double peso) {
		super(name, desciption, precio);
		// TODO Auto-generated constructor stub
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double determineDiscount() {
		double discount = 0;
		
		if(peso == 100) {
			discount = 0.08;
		}else if(peso >100 && peso <=200) {
			discount = 0.1;
		}else if(peso >200){
			discount = 0.2;
		}
		
		return discount;
	}

//	@Override
//	public double priceFinal() {
//		
//		this.precioTotal = this.precio - this.precio * totalDiscount();  
//		return this.precioTotal;
//	}
//		

}
