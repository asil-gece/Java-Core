import com.org.inner.LocalClassI;

public class LocalClass {
    public void innerClass1() {
        class InnerClass implements LocalClassI {
            final int y = 5;

            public InnerClass() {
                System.out.println("This is inner Local class constructor");
            }

            public void myMethod() {
                System.out.println(y);
            }

            @Override
            public void run() {

            }
        }
        InnerClass innerClass_obj1 = new InnerClass();
        innerClass_obj1.myMethod();
    }
}
