public class SubClass extends SuperClass{
    @Override
    void print() {
        System.out.println("This is subclass");
    }


    void printEarlyBinding(){
        System.out.println("This is early binding");
    }
}
