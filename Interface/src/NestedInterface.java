import com.org.example.InterfaceConflict1;
import com.org.example.NestedInterface1;

public class NestedInterface  implements NestedInterface1.NestedInterface2.NestedInterface3, NestedInterface1.NestedInterface2, NestedInterface1.NestedInterface4 {
    @Override
    public void print3() {
        System.out.println("This is NestedInterface 3");
    }

    @Override
    public void print2() {
        System.out.println("This is NestedInterface 2");
    }

    @Override
    public void print4() {
        System.out.println("This is NestedInterface 4");
    }
}
