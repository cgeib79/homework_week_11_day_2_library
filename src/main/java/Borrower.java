import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Books>collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }
}
