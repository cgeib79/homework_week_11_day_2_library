import java.util.ArrayList;

public class Library {
    ArrayList<Books> book;

    public Library() {
        this.book = new ArrayList<>();
    }


    public int getBookCount() {
        return this.book.size();
    }

    public void addBooks(Books books) {
        this.book.add(books);
    }
}
