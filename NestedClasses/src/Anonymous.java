import com.org.inner.IAnonymous;

public class Anonymous {
    public void anonymous() {
        System.out.println("This method is anonymous");
    }

    public IAnonymous myMethod() {
        return new IAnonymous() {
            @Override
            public void eat() {
                System.out.println("The unknown animal2 is eating");
            }
        };
    }
}
