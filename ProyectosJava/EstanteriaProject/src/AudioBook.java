public class AudioBook extends Productos implements IDiscount{

    private double duration;

    public AudioBook(String name, String desciption, int precio, double duration) {
        super(name, desciption, precio);
        this.duration  = duration;
        //TODO Auto-generated constructor stub
    }

    public double getDuration() {
        return duration;
    }

	@Override
	public double determineDiscount() {
		double discount = 0;
		
		if(duration == 100) {
			discount = 0.08;
		}else if(duration >100 && duration <=200) {
			discount = 0.1;
		}else if(duration >200){
			discount = 0.2;
		}
		System.out.println("El descuento del audiobook es: "+discount);
		return discount;
	}

//	@Override
//	public double priceFinal() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

    
    
}
