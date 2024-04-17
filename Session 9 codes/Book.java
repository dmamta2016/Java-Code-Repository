 public class Book {
    String bookId;
    String type;
    String author;
    
    public Book(String bookId, String type, String author) {
        this.bookId = bookId;
        this.type = type;
        this.author = author;
    }
    public void displayDetails(){
       System.out.println("Book Id: "+bookId);
        System.out.println("Book Type: "+type);
        System.out.println("Author: "+author);
    }

 public static void main(String[] args) {
         Book objBook1= new Book(args[1],args[2],args[3]);
        objBook1.displayDetails();
    }
}
