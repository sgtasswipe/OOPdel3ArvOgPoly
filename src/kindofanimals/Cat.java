package kindofanimals;

public class Cat  extends Animal{
    private String race;
    private CatColor catColor;
    private  boolean isPlayful;


    public Cat (String name, int age, char gender, String race, CatColor catColor) {
        super(name, age,gender);
        this.race = race;
        this.catColor= catColor;


    }

    public void setIsPlayful (boolean isPlayful) {
        this.isPlayful = isPlayful;
    }

        public CatColor getCatColor () {
        return  catColor;
        }

}

