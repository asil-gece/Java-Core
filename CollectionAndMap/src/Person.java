public class Person {
   //Declaring private name, lastname and age
    private String name,lastname;
    private int age;

  //Using getter methods
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    //Calling the constructor
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    //Calling toString method


    @Override
    public String toString() {
        return "Name:" + name + ", Lastname:" + lastname + ", Age:" + age;
    }
}
