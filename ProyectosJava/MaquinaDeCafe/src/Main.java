import java.util.Scanner;

public class Main {
	
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	
	public static void main(String[] args) {
		
		MaquinaDeCafe maquina = new MaquinaDeCafe();
		PreparacionCafe preparacion = new PreparacionCafe();
		
		//Creacion de adiciones
		Adicion ad1 = new Adicion("Canela");
		Adicion ad2 = new Adicion("Chocolate");
		Adicion ad3 = new Adicion("Leche");
	

		maquina.addAdiciones(ad1);
		maquina.addAdiciones(ad2);
		maquina.addAdiciones(ad3);

		
		//maquina.showAdiciones();
		//Creacion de Cafe
		TipoCaliente ch1 = new TipoCaliente("Capuccino");
		TipoCaliente ch2 = new TipoCaliente("Galao");
		TipoCaliente ch3 = new TipoCaliente("Americano");
		TipoCaliente ch4 = new TipoCaliente("Vienés");
		TipoCaliente ch5 = new TipoCaliente("Irlandés");
		//Añado los cafes a la maquina
		TipoFrio cc1 = new TipoFrio("Latte");
		TipoFrio cc2 = new TipoFrio("Mocca");
		TipoFrio cc3 = new TipoFrio("Frappe");
		//TipoFrio cc4 = new TipoFrio("Cafe frío 4");
		//TipoFrio cc5 = new TipoFrio("Cafe frío 5");
		
		maquina.addHotCoffe(ch1);
		maquina.addHotCoffe(ch2);
		maquina.addHotCoffe(ch3);
		maquina.addHotCoffe(ch4);
		maquina.addHotCoffe(ch5);
		maquina.addColdCoffe(cc1);
		maquina.addColdCoffe(cc2);
		maquina.addColdCoffe(cc3);
		//maquina.addColdCoffe(cc4);
		//maquina.addColdCoffe(cc5);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(ANSI_GREEN+"Bienvenido a la máquina de café NiCoffe\n¿Qué desea hacer?\n"
				+ "[1] Preparar un café\n"
				+ "[0] Apagar la máquina\n"
				+ "--> ");
		int opcion = sc.nextInt();
		

		while (opcion != 0) {
			//maquina.selectCoffe();
			maquina.dispensarCafe(maquina.selectCoffe());
			maquina.ultimateStage();
			
			System.out.print(ANSI_YELLOW+" ¡Buen provecho!\nAhora... ¿Qué desea hacer?\n"
					+ "[1] Preparar otro café\n"
					+ "[0] Apagar la máquina\n"
					+ "--> ");
			opcion = sc.nextInt();
			if(opcion == 0) {
				maquina.coffeDrunks();
				System.out.println(ANSI_YELLOW+":C Adios, nos vemos en la proxima");
			}
			
			
		}
	}

}
