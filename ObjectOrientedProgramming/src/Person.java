import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age);
    }

    @Override
    public String toString() {
        return "Person [ name=" + name + ", lastname=" + lastname + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        }else {
            Person person = (Person) obj;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
        }
    }
}
