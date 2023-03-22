import java.util.ArrayList;
import java.util.Scanner;

public class PreparacionCafe extends MaquinaDeCafe{
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	private  ArrayList<TipoCaliente> tipoCaliente = new ArrayList<>();
	private  ArrayList<TipoFrio> tipoFrio = new ArrayList<>();
	private  ArrayList<Adicion> adiciones = new ArrayList<>();
	MaquinaDeCafe maquina;
	
	public PreparacionCafe() {
		
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
	
	public void showMachines() {
		int i=0;
		System.out.println("CAFE CALIENTE");
		
		
		
		for (TipoCaliente machine : tipoCaliente) {
			System.out.println("CAFE "+(i+1)+": -> "+machine.getStrNombre());
			i++;
		}
		System.out.println("CAFE FRIO");
		for (TipoFrio machine : tipoFrio) {
			System.out.println("CAFE "+(i+1)+": -> "+machine.getStrNombre());
			i++;
		}
		
	}
	
public void dispensarCafe(int intOption) {
		
		switch (intOption) {
		case 1:
			
			strCafeElegido = tipoCaliente.get(0).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			showAdiciones();
			break;
		case 2:
			
			strCafeElegido = tipoCaliente.get(1).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			showAdiciones();
			break;
		case 3:
			
			strCafeElegido = tipoCaliente.get(2).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			
			showAdiciones();
			break;
		case 4:
			
			strCafeElegido = tipoFrio.get(0).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			showAdiciones();
			break;
		case 5:
			
			strCafeElegido = tipoFrio.get(1).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			showAdiciones();
			break;
		case 6:
			strCafeElegido = tipoFrio.get(2).getStrNombre();
			coffesDrunks.add(strCafeElegido);
			System.out.println("\nNiCoffe te está preparando un -> "+strCafeElegido+"...");
			showAdiciones();
			break;

		default:
			break;
		}
	}
	
	
	
	
}
