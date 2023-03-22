
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDeCafe maquina = new MaquinaDeCafe();
		
		TipoCafes cafe1 = new TipoCafes("Amaretto", 1);
		TipoCafes cafe2 = new TipoCafes("Capuchino", 1);
		TipoCafes cafe3 = new TipoCafes("Caramelo", 1);
		TipoCafes cafe4 = new TipoCafes("Americano", 2);
		TipoCafes cafe5 = new TipoCafes("Campesino", 2);
		TipoCafes cafe6 = new TipoCafes("Espresso", 2);
		TipoCafes cafe7 = new TipoCafes("Cafe nuevo", 3);
		
		maquina.addTypesCoffe(cafe1);
		maquina.addTypesCoffe(cafe2);
		maquina.addTypesCoffe(cafe3);
		maquina.addTypesCoffe(cafe4);
		maquina.addTypesCoffe(cafe5);
		maquina.addTypesCoffe(cafe6);
		//maquina.addTypesCoffe(cafe7);
		
		maquina.showCoffes();
		
		
		
		
	}

}
