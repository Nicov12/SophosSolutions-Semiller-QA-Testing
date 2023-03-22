
public class TipoCafes{

	private String strName;
	private int intTypeOfCoffe;

	public TipoCafes(String nombre, int intType) {
		super();
		this.strName = nombre;
		this.intTypeOfCoffe = intType;
	}

	public String getNombre() {
		return strName;
	}

	public void setNombre(String nombre) {
		this.strName = nombre;
	}

	public int getTipoDeCafe() {
		return intTypeOfCoffe;
	}

	public void setTipoDeCafe(int tipoDeCafe) {
		this.intTypeOfCoffe = tipoDeCafe;
	}

}
