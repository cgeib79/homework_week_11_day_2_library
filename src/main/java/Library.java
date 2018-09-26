import java.util.ArrayList;

public class Library {
    ArrayList<Books> book;

    public Library() {
        this.book = new ArrayList<>();
    }


    public int getBookCount() {
        return this.book.size();
    }
}
