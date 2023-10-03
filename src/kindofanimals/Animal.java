package kindofanimals;

public class Animal {
    private String name;
    private  int age;
    private  char gender;


    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;


    }

    @Override
    public String toString() {
        return "Animal type" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gender: " + gender +
                ',';
    }
}
