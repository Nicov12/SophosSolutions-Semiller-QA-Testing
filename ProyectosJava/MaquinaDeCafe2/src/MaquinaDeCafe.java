import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaDeCafe {
	//Mensajes en consola de colores xd
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	private  ArrayList<TipoCafes> tiposDeCafe = new ArrayList<>();
	private  ArrayList<Adicion> adiciones = new ArrayList<>();
	
	String strAdicionElegida = null;
	String strCafeElegido = null;
	
	private ArrayList<String> coffesDrunks = new ArrayList<>();
	private ArrayList<String> aditionForCoffeDrunks = new ArrayList<>();
	
	
	public MaquinaDeCafe() {
		super();
	}
	
	public void addTypesCoffe(TipoCafes typeCoffe) {
		tiposDeCafe.add(typeCoffe);
	}
	
	public void addAdiciones(Adicion adicion) {
		adiciones.add(adicion);
	}
	
	public void showCoffes() {
		int i = 1;
		System.out.println("		   MENÚ	\n");
		
		for (TipoCafes coffe : tiposDeCafe) {
			if(1 == coffe.getTipoDeCafe()) {
				System.out.println(""+coffe.getNombre() +"	->CAFE CALIENTE");
			}else if(2 == coffe.getTipoDeCafe()){
				
				System.out.println(""+coffe.getNombre() +"	->CAFE FRIO");
			}
		}
		System.out.println("\n");
	}
	
	
	
	
	public int showAdiciones() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n	Elija la adicion");
			System.out.println("	Adiciones disponibles");
			int i=1;
			
			for (Adicion adicion : adiciones) {
				System.out.println("["+i+"]"+ adicion.getStrNombre());
				
				i++;
			}
		int opcion = sc.nextInt();
		strAdicionElegida = adiciones.get(opcion-1).getStrNombre();
		aditionForCoffeDrunks.add(strAdicionElegida);
		
		System.out.println("Al cafe "+strCafeElegido+" se está añadiendo "+strAdicionElegida);
		System.out.println();
		
		return opcion;
		
	}
	
	public void coffeDrunks() {
		System.out.println("Has tomado estos productos:");
		int i=1;
		for (String coffes : coffesDrunks) {
			System.out.println("Cafe "+i+":\n "+coffes+" con "+aditionForCoffeDrunks.get(i-1));
			//System.out.println("Adicion "+i+":\n "+aditionForCoffeDrunks.get(i-1));
			i++;
		}
	}
}
