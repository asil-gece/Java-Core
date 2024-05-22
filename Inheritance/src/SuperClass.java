 public class SuperClass {

    int y;
    int x;
    String name;

    SuperClass(String b, int a) {
        name = b;
        x = a;
    }

    SuperClass(int a, String b) {
        x = a;
        name = b;
    }

    void print() {
        System.out.println("Values: " + name + " and " + x);
    }

}
