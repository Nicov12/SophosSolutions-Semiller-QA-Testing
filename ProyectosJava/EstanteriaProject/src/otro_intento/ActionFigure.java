package otro_intento;

public class ActionFigure extends Product {

	private double dblWeigth;
	SelfDiscount selfDiscount;

	public ActionFigure(String strTitle, String strDesc, int intPrice, double dblWeigth) {
		super(strTitle, strDesc, intPrice);
		this.dblWeigth = dblWeigth;
	}

	public double getDblWeigth() {
		return dblWeigth;
	}

	public void setDblWeigth(double dblWeigth) {
		this.dblWeigth = dblWeigth;
	}
	
	public void discount() {
		selfDiscount.obtainDiscount();
	}
	
	
}
