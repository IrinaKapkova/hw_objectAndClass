import java.util.Objects;
public class Book {

    private final String bookName;
    private  final Author author;
    private int yearOfPublication;


    public Book (String bookName, Author author, int yearOfPublication){
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;

    }

    public String getBookName(){return  bookName;}
    public Author getAuthor(){return author;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    public void setYearOfPublication (int yearOfPublication) {this.yearOfPublication = yearOfPublication;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || this.getClass() !=o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals (bookName, book.bookName) && Objects.equals(author, book.author) && yearOfPublication == book.yearOfPublication;}

    @Override
    public  int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
