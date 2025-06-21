public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    public Book linearSearch(String title) {
        return LinearSearch.searchByTitle(books, title);
    }

    public Book binarySearch(String title) {
        return BinarySearch.searchByTitle(books, title);
    }
}
