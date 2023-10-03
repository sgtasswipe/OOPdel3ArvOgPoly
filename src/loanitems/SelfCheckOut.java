package loanitems;

import java.util.Scanner;

public class SelfCheckOut {
    Scanner in = new Scanner(System.in);
   private int numberOfItems;
  private   int itemNumber= 1;

    private char choice;
    public static void main(String[] args) {
        new SelfCheckOut().run();
    }

    private void run() {
        System.out.println("Please enter number of loaned items:");
        numberOfItems= in.nextInt();
       in.nextLine(); // scanner bug
        do {
            System.out.println("Item NO. " + itemNumber);
            itemNumber++;
            System.out.println("Type b or v (book or video)");
            choice = in.nextLine().charAt(0);
            System.out.println("Enter title: " );
            in.nextLine();

        } while (numberOfItems>0);

    }
}
