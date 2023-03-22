package otro_intento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhyBook pb = new PhyBook("hola", "como estas", 1000, 60);
		pb.discount.setDblDiscount(2.2);
		System.out.println("-> "+pb.discount.getDblDiscount());

	}

}
