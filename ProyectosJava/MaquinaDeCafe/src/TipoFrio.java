import java.util.ArrayList;
import java.util.Scanner;

public class TipoFrio{
	
	private String strNombre;
	private ArrayList<Adicion> adiciones = new ArrayList<>();

	public TipoFrio(String strNombre) {
		super();
		this.strNombre = strNombre;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

}
