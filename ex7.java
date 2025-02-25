public class ex7 {
    public static void main (String[] args) {
        Library lib = new Library(10);
        lib.addBook(new Book(new Author("Marcel",93),"Theories"));
        lib.addBook(new Book(new Author("Marco",43),"Factual Fiction"));
        lib.addBook(new Book(new Author("Marko",53),"Fictional Fact"));
        lib.addBook(new Book(new Author("Marcelo",93),"Funny Theories"));
        lib.addBook(new Book(new Author("Marcos",43),"Factual Fiction Again"));
        lib.addBook(new Book(new Author("Markos",53),"More Fictional Fact"));
        lib.inventory();
    }
}
class Library {
    private Book[] books;
    private int numberofBooks;

    public Library(int maxNumberOfBooks) {
        books = new Book[maxNumberOfBooks];
        numberofBooks = 0;
    }
    public void addBook(Book b) {
        books[numberofBooks] = b;
        numberofBooks += 1;
    }
    public Book[] getAllBooks() { return books; }
    public void inventory() {
        for (int i = 0; i < numberofBooks; i++) {
            Book book =  books[i];

            System.out.printf("%d. Author: %s (%d) Book: %s%n",
                    (i + 1), book.getAuthorName(),
                    book.getAuthorAge(),
                    book.getName());
        }
    }
}

class Book {
    private Author bookAuthor;
    private String bookName;

    public Book(Author author, String name){
        bookAuthor = author;
        bookName = name;
    }
    public String getName()  { return bookName; }
    public String getAuthorName(){
        return bookAuthor.getName();
    }
    public int getAuthorAge() {
        return bookAuthor.getAge();
    }
}

class Author {
    private String authorName;
    private int authorAge;

    public Author(String authorName, int authorAge){
        this.authorName = authorName;
        this.authorAge = authorAge;
    }
    public Author(){   this("Noname",0);   }

    public String getName(){
        return authorName;
    }
    public int getAge(){
        return authorAge;
    }
}






