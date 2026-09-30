import java.util.ArrayList;

class Book {
    private String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}


class My_Library {
    public ArrayList<Book> books;

    public My_Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book has been added to the library....");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned....");
        this.books.add(b);
    }
}

public class CWH_113_ex7sol {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Book b1 = new Book("Algorithms", "Ankit");
        book.add(b1);
        Book b2 = new Book("Operating System", "Divyanshu");
        book.add(b2);
        Book b3 = new Book("Data Structure", "Lovish");
        book.add(b3);
        Book b4 = new Book("Java", "Shubham");
        book.add(b4);

        My_Library my = new My_Library(book);
        System.out.println(my.books);
        my.issueBook(b3, "Aman");
        System.out.println(my.books);
    }
}