public class PhysicalBook extends Productos {

    private int pages;
    private int cantidad;
    
    public PhysicalBook(String name, String desciption,int precio, int pages, int cantidad) {
        super(name, desciption, precio);
        this.pages = pages;
        this.cantidad = cantidad;
     
        //TODO Auto-generated constructor stub
    }
       
    public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public double determineDiscount() {
    	double discount = 0;
		
		if(cantidad == 2) {
			discount = 0.08;
		}else if(cantidad >2 && cantidad <=4) {
			discount = 0.1;
		}else if(cantidad >4){
			discount = 0.2;
		}
		return discount;
	}

//	@Override
//	public double priceFinal() {
//		this.precioTotal = (this.precio*cantidad) - this.precio * totalDiscount();  
//		
//		return this.precioTotal;
//	}


    
    
}
