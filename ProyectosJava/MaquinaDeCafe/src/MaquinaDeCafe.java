import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaDeCafe {
	//Mensajes en consola de colores xd
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_CYAN = "\u001B[36m";
	
	
	private  ArrayList<TipoCaliente> tipoCaliente = new ArrayList<>();
	private  ArrayList<TipoFrio> tipoFrio = new ArrayList<>();
	private  ArrayList<String> strAllType = new ArrayList<>();
	private  ArrayList<Adicion> adiciones = new ArrayList<>();
	
	String strAdicionElegida = null;
	String strCafeElegido = null;
	
	private ArrayList<String> coffesDrunks = new ArrayList<>();
	private ArrayList<String> aditionForCoffeDrunks = new ArrayList<>();
	
	
	private String [] lstAdiciones = {"Canela", "Chocolate", "Leche"};
	
	public MaquinaDeCafe() {
		super();
	}

	public void addHotCoffe(TipoCaliente coffe) {
		tipoCaliente.add(coffe);
	}
	
	public void addColdCoffe(TipoFrio coffe) {
		tipoFrio.add(coffe);
	}
	
	public void addAdiciones(Adicion adicion) {
		adiciones.add(adicion);
	}
	
	public int selectCoffe() {
		Scanner sc = new Scanner(System.in);
		System.out.println(ANSI_YELLOW+"		 Elija un tipo de café :')");
		showMachines();
		int opcion = sc.nextInt();
		return opcion;
	}
	
	public void addAllTypesOfCoffe() {
		for (TipoCaliente machine : tipoCaliente) {
			strAllType.add(machine.getStrNombre());
			//System.out.println("CAFE "+(i+1)+": -> "+machine.getStrNombre());
		}
		for (TipoFrio machine : tipoFrio) {
			strAllType.add(machine.getStrNombre());
			//System.out.println("CAFE "+(i+1)+": -> "+machine.getStrNombre());
		}
	}
	
	public void dispensarCafe(int intOption) {
		
		addAllTypesOfCoffe();
		
		strCafeElegido = strAllType.get(intOption-1);
		coffesDrunks.add(strCafeElegido);
		System.out.println(ANSI_CYAN+"\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
		showAdiciones();
		
	}
	
	
	public void showMachines() {
		int i = 1;
		System.out.println("CAFE CALIENTE");
		
		for (TipoCaliente machine : tipoCaliente) {
			System.out.println("CAFE "+(i)+": -> "+machine.getStrNombre());
			i++;
		}
		System.out.println("CAFE FRIO");
		for (TipoFrio machine : tipoFrio) {
			System.out.println("CAFE "+(i)+": -> "+machine.getStrNombre());
			i++;
		}
	
	}
	
	public int showAdiciones() {
		Scanner sc = new Scanner(System.in);
		System.out.println(ANSI_YELLOW+"\n	Elija la adicion");
			System.out.println("	Adiciones disponibles");
			int i=1;
			
			for (Adicion adicion : adiciones) {
				System.out.println("["+i+"]"+ adicion.getStrNombre());
				
				i++;
			}
		int opcion = sc.nextInt();
		strAdicionElegida = adiciones.get(opcion-1).getStrNombre();
		aditionForCoffeDrunks.add(strAdicionElegida);
		
		System.out.println(ANSI_CYAN+"Al cafe "+strCafeElegido+" se está añadiendo "+strAdicionElegida);
		System.out.println();
		
		return opcion;
		
	}
	
	public int ultimateStage() {
		Scanner sc = new Scanner(System.in);
		System.out.println(ANSI_YELLOW+"Elija una opcion");
		System.out.println("[1] Tomarlo acá\n"
				+ "[2] Llevar a casa");
		int opcion = sc.nextInt();
		if(opcion == 1) {
			System.out.println(ANSI_CYAN+"Nico se siente satisfecho al ver al cliente tomarse un "+strCafeElegido+" con "+strAdicionElegida);
		}else {
			System.out.println(ANSI_CYAN+"Nico empaca el super NiCoffe, se lo entrega al cliente y lo ve retirandose feliz\ndespúes de recibir el mejor café que se va a tomar en su vida");
		}
		return opcion;
	}
	
	public void coffeDrunks() {
		System.out.println("Has tomado estos productos:");
		int i=1;
		for (String coffes : coffesDrunks) {
			System.out.println("Cafe "+i+ANSI_CYAN+":\n "+coffes+" con "+aditionForCoffeDrunks.get(i-1));
			//System.out.println("Adicion "+i+":\n "+aditionForCoffeDrunks.get(i-1));
			i++;
		}
	}
}
