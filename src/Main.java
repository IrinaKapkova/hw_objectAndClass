public class Main {

    public static void main(String[] args) {
     Author antonChehov = new Author ("Anton","Chehov");
     Author sergeyEsenin = new Author("Sergey", "Esenin");
     Author antonChehov2 = new Author ("Anton","Chehov");
        Book book1 = new Book ("Bride", antonChehov, 1982);
        Book book2 = new Book ("Poetry", sergeyEsenin, 1999);
        Book book3 = new Book ("Bride", antonChehov, 1982);

        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());

        book2.setYearOfPublication(1993);
        System.out.println("book2.getYearOfPublication = " + book2.getYearOfPublication());
        System.out.println("Авторы:");
        System.out.println(antonChehov);
        System.out.println(sergeyEsenin);
        System.out.println(antonChehov2);

        System.out.println("Книги: ");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Сравнить копии авторов " + antonChehov.equals(antonChehov2));
        System.out.println("Сравнить копии книг " + book1.equals(book3));
    }
}