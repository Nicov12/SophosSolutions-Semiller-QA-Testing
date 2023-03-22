package otro_intento;

public class SelfDiscount extends Discount implements IDiscount {

	public SelfDiscount(double dblDiscount) {
		super(dblDiscount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double obtainDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
