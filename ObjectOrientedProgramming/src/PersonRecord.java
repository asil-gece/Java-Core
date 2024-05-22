public record PersonRecord(String name, String lastname, int age) {


    //I cannot declare an empty constructor: public PersonRecord(){};
    static String middleName = "Henry";

    public PersonRecord(String name, String lastname) {
        this(name, lastname, 0);
    }

    @Override
    public int age() {
        return age * 2;
    }

    public void print() {
        System.out.println(name + " " + lastname);
    }

    public static void printStatic() {
        System.out.println(middleName);
    }

}
