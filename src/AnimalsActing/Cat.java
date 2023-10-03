package AnimalsActing;

public class Cat extends Animal {

    Cat (String name) {  // constructor
        super(name);

    }
    public void scratch() {
        System.out.println("Scratching");
    }
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }


}
