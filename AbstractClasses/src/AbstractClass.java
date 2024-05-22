public abstract class AbstractClass {
    abstract void display();

    public AbstractClass() {
        System.out.println("This is the constructor of AbstractClass");
    }


    public void myMethod() {
        System.out.println("This is the method that belong to AbstractClass");
    }

    static void printStatic(){
        System.out.println("This is static method from AbstractClass");
    }
}
