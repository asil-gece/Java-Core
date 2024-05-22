public class SubClass extends SuperClass {
    SubClass(String b, int a) {
        super(b,a);
    }

    void method1(){
        super.name = "George";
        super.x = 20;
        super.y = 30;

        System.out.println(y + " " + x + " " + name);
    }
}
