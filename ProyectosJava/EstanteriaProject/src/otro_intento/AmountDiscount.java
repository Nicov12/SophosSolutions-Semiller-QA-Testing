package otro_intento;

import java.util.Scanner;

public class AmountDiscount extends Discount implements IDiscount {

	public AmountDiscount(double dblDiscount) {
		super(dblDiscount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double obtainDiscount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad a llevar: --> ");
		int cantidad = sc.nextInt();
		
		this.setDblDiscount(0);
		
		if(cantidad == 2) {
			this.setDblDiscount(0.08);
		}else if(cantidad >2 && cantidad <=4) {
			this.setDblDiscount(0.1);
		}else if(cantidad >4){
			this.setDblDiscount(0.2);
		}
		
		return this.getDblDiscount();
		
	}

}
