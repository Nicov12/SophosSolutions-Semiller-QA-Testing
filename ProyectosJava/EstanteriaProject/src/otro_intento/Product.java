package otro_intento;

public class Product {

	private String strTitle;
	private String strDesc;
	private int intPrice;
	protected Discount discount;

	public Product(String strTitle, String strDesc, int intPrice) {
		super();
		this.strTitle = strTitle;
		this.strDesc = strDesc;
		this.intPrice = intPrice;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrDesc() {
		return strDesc;
	}

	public void setStrDesc(String strDesc) {
		this.strDesc = strDesc;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

}
