import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void getObject(LivingCreatures l) {
        l.print();
    }

    public static void main(String[] args) {

        LivingCreatures livingCreatures_obj1 = new LivingCreatures();
        Human human_obj1 = new Human();
        Animal animal_obj1 = new Animal();
        Plant plant_obj1 = new Plant();

        getObject(livingCreatures_obj1);
        getObject(human_obj1);
        getObject(animal_obj1);
        getObject(plant_obj1);

        LivingCreatures livingCreatures_obj2 = new Human();
        livingCreatures_obj2.print();
        System.out.println();

        SuperClass subsClass_obj = new SubClass();
        subsClass_obj.print();

        SubClass subClass_obj2 = new SubClass();
        subClass_obj2.printEarlyBinding();
        System.out.println();

        ClassA classA_obj = new ClassA();
        ClassB classB_obj = new ClassB();
        ClassC classC_obj = new ClassC();
        ClassD classD_obj = new ClassD();

        System.out.println(classA_obj instanceof ClassB);
        System.out.println(classB_obj instanceof ClassB);
        System.out.println(classC_obj instanceof ClassA);
        System.out.println(classB_obj instanceof ClassC);
        System.out.println(classD_obj instanceof ClassA);
        System.out.println();

        Casting casting_obj_1 = new Casting();
        if (casting_obj_1 instanceof Casting) {
            System.out.println("True");
            Casting casting_obj_2 = (Casting) casting_obj_1;
            casting_obj_2.print();
        } else {
            System.out.println("Not an object");
        }
        System.out.println();

        if (casting_obj_1 instanceof Casting casting_obj_3) {
            casting_obj_3.print();
        } else {
            System.out.println("Not an object");
            System.out.println();

        }
        Object name = "George";
        if (name instanceof String newName && newName.startsWith("Geo")) {
            System.out.println(newName);
        } else {
            System.out.println("This is not an object from the class");
        }

        GetClass getClass_obj1 = new GetClass();
        GetClassSub getClassSub_obj = new GetClassSub();

        System.out.println(getClass_obj1.getClass().equals(getClassSub_obj));
        System.out.println(getClass_obj1.getClass());

        Return return_obj = new Return();
        int result = return_obj.method();
        System.out.println(result);

    }
}