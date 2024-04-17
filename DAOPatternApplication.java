class Book {
    private String name;
    private int BookID;
    Book(String name, int BookID) {
        this.name = name;
        this.BookID = BookID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
 this.name = name;
    }
     public int getBookID() {
        return BookID;
    }
    public void setBookID(int BookID) {
        this.BookID = BookID;
    }
}
interface BookDao {
   public java.util.List<Book> getAllBooks();
   public Book getBook(int BookID);
   public void updateBook(Book book);
   public void deleteBook(Book book);
}

class BookDaoImpl implements BookDao {
   // list is working as a database
   java.util.List<Book> booksList;
   public BookDaoImpl(){
     booksList = new java.util.ArrayList<Book>();
     Book bookObj1 = new Book("Anna",1);
      Book bookObj2 = new Book("John",2);
      booksList.add(bookObj1);
      booksList.add(bookObj2);		
   }
@Override
   public void deleteBook(Book book) {
 booksList.remove(book.getBookID());
   System.out.println("Book: Book ID " + book.getBookID() +", deleted from database");
   }
   // retrieve list of booksList from the database
   @Override
   public java.util.List<Book> getAllBooks() {
      return booksList;
   }
   @Override
   public Book getBook(int BookID) {
      return booksList.get(BookID);
   }
   @Override
   public void updateBook(Book book) {
      booksList.get(book.getBookID()).setName(book.getName());
      System.out.println("Book: Book ID " + book.getBookID() +", updated in the database");
   }
}

public class DAOPatternApplication {
public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        System.out.println("Book List:");
        //print all booksList
for (Book book : bookDao.getAllBooks()) {
            System.out.println("\nBookID : " + book.getBookID() + ", Name : " + book.getName() + " ");
        }
 //update book
        Book book = bookDao.getAllBooks().get(0);
 book.setName("Harry Long");
        bookDao.updateBook(book);
//get the book
        bookDao.getBook(0);
	 System.out.println("Book: [BookID : " + book.getBookID() + ", Name  :" + book.getName() + " ]");
    }
}