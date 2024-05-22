//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle_obj = new Rectangle();
        Triangle triangle_obj = new Triangle();

        rectangle_obj.elements(5.0,2.0);
        System.out.println(rectangle_obj.getName() + " " + rectangle_obj.fieldCalculation());

        triangle_obj.elements(4.0,2.0);
        System.out.println(triangle_obj.getName() + " " + triangle_obj.fieldCalculation());

        SubClass1 subClass1_obj = new SubClass1();
        SubClass2 subClass2_obj = new SubClass2();
        subClass1_obj.display();
        subClass2_obj.display();

        AbstractClass.printStatic();

        AbstractClass[] abstractClass_obj = new AbstractClass[1];
        abstractClass_obj[0]=subClass1_obj;
        abstractClass_obj[0].myMethod();

    }
}