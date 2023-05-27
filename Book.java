
import java.awt.Button;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Book {
    
    public String Title_Book;
    public String Book_status;
    public String Author_Book;
    public Button Action;
   
   
    public Book(String Author_Book, String Title_Book, String Book_status) {
        this.Author_Book = Author_Book;
        this.Book_status = Book_status;
        this.Title_Book =  Title_Book;
        this.Action = new Button("Delete");
        
    }
    
}
