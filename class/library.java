class libraryBook {
    String title;
    String isbn;

    public libraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public libraryBook(String title) {
        this(title, "PENDING");
    }

    void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }
}

public class library {
    public static void main(String[] args) {

        String[] titles = {"step code", "Untitled", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {
            libraryBook book;

            if (isbns[i].equals("")) {
                book = new libraryBook(titles[i]);
            } else {
                book = new libraryBook(titles[i], isbns[i]);
            }

            book.printStatus();
        }
    }
}