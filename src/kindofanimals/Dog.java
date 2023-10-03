package kindofanimals;

public class Dog extends Animal {
    private  String race;
    private String favToy;

    public Dog (String name, int age, char gender, String race) {
        super(name, age, gender);
        this.race = race;


    }




    public void setFavToy(String favToy) {
        this.favToy = favToy;
    }
}
