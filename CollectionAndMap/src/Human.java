public class Human extends LivingCreatures{
   //Declaring private name and last name and age
    private String name,Lastname;
    private int age;

    //Calling the constructor
    public Human(String name, String lastname, int age) {
        super("Human");
        this.name = name;
        Lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" "+Lastname+" "+age;
    }
}
