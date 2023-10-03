package AnimalsActing;

import java.util.ArrayList;

public class Shelter {
    public static void main(String[] args) {
        new Shelter().run();
    }

    private void run() {
        Cat cat = new Cat("Nala");
        Dog dog = new Dog("VUFFER");
        Cat cat2 = new Cat("Missert");

        cat.play();
        dog.play();
        cat.scratch();
        dog.beg();
        cat.play();
        System.out.println(cat.getName());
        cat2.play();
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(dog);
        list.add(cat);


        System.out.println("OPGAVE 3");

        for (int i = 0; i < list.size(); i++) {
            System.out.print("name: " + list.get(i).getName());
            if (list.get(i) instanceof Cat) {
                System.out.print(" Type of animal: Cat ");
                System.out.println();
                ((Cat) list.get(i)).play();
                ((Cat) list.get(i)).scratch();}
                if (list.get(i) instanceof Dog) {
                    System.out.print(" Type of animal: Dog ");
                    ((Dog) list.get(i)).play();
                    ((Dog) list.get(i)).beg();
                    System.out.println();
                }

            }
        }
    }










