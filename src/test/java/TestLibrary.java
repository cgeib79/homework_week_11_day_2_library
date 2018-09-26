import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {
    private Library library;
    private Books books;

    @Before
    public void before() {
        library = new Library();
        books = new Books();
    }

     @Test
     public void canCountBooks(){
         assertEquals(0, library.getBookCount());
        }

    @Test
    public void canAddBooks(){
        if(library.getBookCount()<20){
            library.addBooks(books);
        }
        assertEquals(1, library.getBookCount());
    }


}
