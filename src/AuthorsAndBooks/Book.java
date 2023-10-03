package AuthorsAndBooks;

public  class Book extends Author {
private String title;
private int numberOfPages;


Book (String title, String name, int numberOfPages) {
    super(title, name);
    this.title = title;
    this.numberOfPages = numberOfPages;

}


public String getTitle () {
    return title;
}
public int getNumberOfPages() {
    return numberOfPages;
}
}
