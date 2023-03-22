package otro_intento;

public class AudioBook extends Product{

	private double dblDuration;

	public AudioBook(String strTitle, String strDesc, int intPrice, double dblDuration) {
		super(strTitle, strDesc, intPrice);
		this.dblDuration = dblDuration;
	}

	public double getDblDuration() {
		return dblDuration;
	}

	public void setDblDuration(double dblDuration) {
		this.dblDuration = dblDuration;
	}
	
	
}
