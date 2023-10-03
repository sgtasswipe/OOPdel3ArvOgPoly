package AuthorsAndBooks;

import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private char gender;
    private String bookName;


     public Author(String name, String email, char gender) {
         this.name = name;
         this.gender = gender;


     }

    public Author(String title, String name) {
         this.name = name;

    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addBook(String bookName) {

    }

    public  String getName() {
        return name;
    }
}
