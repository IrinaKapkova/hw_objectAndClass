public class Main {

    public static void main(String[] args) {
     Author antonChehov = new Author ("Anton","Chehov");
     Author sergeyEsenin = new Author("Sergey", "Esenin");
        Book book1 = new Book ("Bride", antonChehov, 1982);
        Book book2 = new Book ("Poetry", sergeyEsenin, 1999);
        System.out.println( "book.author = " + book1.getAuthor());
        System.out.println("book.yearOfPublication = " + book1.getYearOfPublication());

        book1.setYearOfPublication(1993);
        System.out.println("book1.getYearOfPublication = " + book1.getYearOfPublication());
        System.out.println(antonChehov);
        System.out.println(sergeyEsenin);
    }
}