import org.junit.Before;

public class TestBorrower {
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Christian");
    }
}
