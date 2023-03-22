import java.util.ArrayList;

public class Estanteria {

    private static ArrayList <Productos> bookList = new ArrayList<>();



    public static void addBook(Productos book)
    {
        bookList.add(book);
    }
    public static void sortBookList()
    {
        for (Productos book : bookList) {
            System.out.println( book.getName()+" " +book.getDesciption());
        }
    }

    public static void getBooksTotalPages()
    {
        int totalPages=0;
        for (Productos book : bookList) {

            if(book instanceof PhysicalBook)
            {
                PhysicalBook phyBook =(PhysicalBook)book;
                totalPages += phyBook.getPages();
            }
            
        }

        System.out.println( "The book has"+" " + totalPages);
    }

    

    
    
}
