package otro_intento;

public class PhyBook extends Product{
	
	private int intPages;
	AmountDiscount amountDiscount;

	public PhyBook(String strTitle, String strDesc, int intPrice, int intPages) {
		super(strTitle, strDesc, intPrice);
		this.intPages = intPages;
	}

	public int getIntPages() {
		return intPages;
	}

	public void setIntPages(int intPages) {
		this.intPages = intPages;
	}
	
	private void amountDiscount() {
		// TODO Auto-generated method stub
		amountDiscount.obtainDiscount();
	}
	
	
}
