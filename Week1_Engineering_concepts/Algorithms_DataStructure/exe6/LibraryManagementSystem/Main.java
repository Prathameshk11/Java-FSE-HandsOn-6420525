public class Main {
    public static void main(String[] args) {
        Book[] bookList = {
            new Book(1, "Data Structures", "Mark Allen Weiss"),
            new Book(2, "The Pragmatic Programmer", "Andy Hunt"),
            new Book(3, "Clean Code", "Robert C. Martin"),
            new Book(4, "Effective Java", "Joshua Bloch")
        };

        Library library = new Library(bookList);

        System.out.println(" All Books in Library:");
        library.showAllBooks();

        System.out.println("\n Linear Search for 'Clean Code':");
        Book found1 = library.linearSearch("Clean Code");
        if (found1 != null) found1.display();
        else System.out.println("Book not found.");

        System.out.println("\n Binary Search for 'Effective Java':");
        Book found2 = library.binarySearch("Effective Java");
        if (found2 != null) found2.display();
        else System.out.println("Book not found.");
    }
}
