public class ToString {
    int a;
    int b;

    ToString(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a + b = 15";
    }
}
