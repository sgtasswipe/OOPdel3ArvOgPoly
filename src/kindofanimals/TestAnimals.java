package kindofanimals;

public class TestAnimals {
    public static void main(String[] args) {
        new TestAnimals().run() ;
    }

    private void run() {
        Cat cat = new Cat("Nala" , 2, 'f', "Housekat", CatColor.BLACK);
        Dog dog = new Dog("Mason" , 7, 'f', "gorger spaniel");
        Cat cat2 = new Cat("Snowball" , 5, 'f', "Wild cat" , CatColor.WHITE);
        System.out.println(cat);
        System.out.println(dog);
        dog.setFavToy("BIG Stick");
        cat.setIsPlayful(true);
        System.out.println(cat2 +  "Cat color" + cat2.getCatColor());
        System.out.println(cat);
        System.out.println(dog);

         // todo write getters for race, color on cat/dog and print out

    }
}
