//Creating a generic class
public class GenericClassTest2<I,S> {
    I object1;
    S object2;

  //Calling the constructor of the class
    public GenericClassTest2(I object1, S object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
//Declaring a method to print out the items
    public void printItems(){
        System.out.println(object1 + " " + object2);
    }
}
