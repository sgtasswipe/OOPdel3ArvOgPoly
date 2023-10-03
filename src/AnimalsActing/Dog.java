package AnimalsActing;

public class Dog  extends  Animal{

    Dog (String name) {
        super(name);
    }
    public void beg() {
        System.out.println("Begging");

    }

    @Override
    public void play() {
        System.out.println("Dog playing");
    }
}

