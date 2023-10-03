package AuthorsAndBooks;

import java.util.ArrayList;

public class Publishing {
    public static void main(String[] args) {
        new Publishing().run();
    }

    private void run() {
        Author author = new Author("Ole", "ole@gmail.com", 'm');
        Author author1 = new Author("Kirkegaard", "garrd@gmail.com", 'm');
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("Den lille havfrue", author.getName(), 215);
        System.out.println(book1.getTitle());
        System.out.println(author.getName());

       Book book2 = new Book("How to get rich quick", author1.getName(), 40);
       // adding books to array
        listOfBooks.add(book1);
       listOfBooks.add(book2);
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println("Title of book: " + listOfBooks.get(i).getTitle());
            System.out.println( "Authors name: " + listOfBooks.get(i).getName());
            System.out.println("Number of pages in book: " + listOfBooks.get(i).getNumberOfPages());

        }
    }
}
