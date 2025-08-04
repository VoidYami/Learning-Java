class Library{
    String [] Books;
    int no_of_Books;

    Library(){
        this.Books = new String[100];
       this.no_of_Books = 0;
    }

    void addBooks(String Book){
        this.Books[no_of_Books] =Book;
        no_of_Books ++;
        System.out.println(Book+"has been added");

    }

    void showAvailableBooks(){
        System.out.println("Available books are");
        for ( String Book : this.Books){
            System.out.println("*"+ Book);
            if(Book == null){
                continue;
            }
        }
    }

    void borrowBooks(String Book){
        for(int i=0; i<Books.length; i++) {
            if(this.Books[i].equals(Book)) {
                System.out.println("the book has been borrowed");
                this.Books[i] = null;
                return;
            }
            
        }
        System.out.println("does not exixt");
    }
    void returnBook(String Book){
        addBooks(Book);
    }

}


public class oop_ex_9 {

    public static void main(String[] args) {
        Library CentralLibrary = new Library();

        CentralLibrary.addBooks("Subtle art of not give a fuck ");
        CentralLibrary.addBooks("thick and grow rich ");
        CentralLibrary.addBooks("Youtube creator ");
        CentralLibrary.addBooks("c++ language ");
        CentralLibrary.addBooks("java");

        CentralLibrary.borrowBooks("java");
        CentralLibrary.showAvailableBooks();
        
    }
}