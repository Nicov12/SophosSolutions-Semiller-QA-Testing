public class App {
    public static void main(String[] args) throws Exception {
    
    	
       Estanteria.addBook(new PhysicalBook("librofisico1", "descripcion1", 200, 1000, 27));
       Estanteria.addBook(new PhysicalBook("librofisico2", "descripcion2", 100, 1000, 20));
       Estanteria.addBook(new AudioBook("libroaudio1", "descripcion3", 300, 185.3));
       Estanteria.addBook(new FigureAction("Goku SS1", "Chroma red", 1000, 250));
       
//       Estanteria.sortBookList();
//       Estanteria.getBooksTotalPages();
       FigureAction fa = new FigureAction("Goku SS1", "Chroma red", 1000, 250);
																	//precio pag  cantidad
       PhysicalBook pb = new PhysicalBook("librofisico1", "descripcion1", 1000, 50, 3);
       
       System.out.println("El precio es: "+pb.getPrecio()*pb.getCantidad());
       System.out.println("El descuento es: "+pb.totalDiscount()+"%");
       System.out.println("El precio final es: "+pb.priceFinal());
       System.out.println("\n");
       System.out.println("El precio es: "+fa.getPrecio());
       System.out.println("El descuento es: "+fa.totalDiscount()+"%");
       System.out.println("El precio final es: "+fa.priceFinal());
       
    }
}
