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

    public String getBookName(){return  this.bookName;}
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
        if (o == null || getClass() !=o.getClass()) return false;
        Book book = (Book) o;
        return  bookName.equals(book.bookName) && author.equals(book.author) && yearOfPublication == book.yearOfPublication;
    }

    @Override
    public  int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return bookName + " " + author.toString() + " " + yearOfPublication;
    }
}
