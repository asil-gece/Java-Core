public class StaticBlock {
    static String variable2;

    String variable1 = "This is not a static";

    static {
        System.out.println("This is a static block");
        variable2 = "This is an static variable";
        System.out.println(variable2);
    }
}
