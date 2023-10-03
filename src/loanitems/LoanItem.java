package loanitems;

public class LoanItem {
    private  String name;
    private  int id;

    public LoanItem(String name, int id)  {
        this.name = name;
        this.id = id++;
    }
}
