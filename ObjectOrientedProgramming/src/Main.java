import com.org.annotations.AnnotationClass;
import com.org.annotations.AnnotationExample;
import com.org.otherpeople.OtherPeople;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Inheritance
        //Polymorphism
        //Abstraction
        //Encapsulation

       /* Cars mercedes = new Cars();
        String brand1 = mercedes.brand;
        System.out.println(brand1);
        System.out.println(mercedes.maxSpeed);
        mercedes.colorMercedes = "Red";
        String mercedesColor = mercedes.colorMercedes;
        System.out.println(mercedesColor);
        mercedes.mercedesSpeeding();

        Human human1 = new Human();
        human1.name = "John";
        human1.height = 180;
        human1.weight = 80;

        Human human2 = new Human();
        human2.name = "Max";
        human2.height = 171;
        human2.weight = 65;


        System.out.println(human1.name);
        System.out.println(human2.name);

        System.out.println(human1.height);
        System.out.println(human2.height);

        Human.kind = "Human";
        String kindOfHuman = Human.kind;
        System.out.println(kindOfHuman);

        Objects obj1 = new Objects();
        Objects obj2 = new Objects(10);
        Objects obj3 = new Objects(35);

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj3.a);

        Books book1 = new Books();

        book1.actionBook = "Adventure Publishing House";
        System.out.println(book1.actionBook);

        book1.author("Nerd Byte Publishing House");

        System.out.println(book1.actionBook);


        int a = 5;

        System.out.println(a);

        change(5);
        System.out.println(a);

        House safe = new House();
        House key = new House();
        key.keyOfTheDoor();

        OtherPeople commonUsageArea = new OtherPeople();

        Newspaper newspaper1 = new Newspaper();
        newspaper1.newspaper = "Nerd Byte";
        System.out.println(newspaper1.newspaper);
        newspaper1.change("Sun");
        System.out.println(newspaper1.newspaper);

        Confidential secretFile = new Confidential();
        secretFile.setConfidentialFile("Aliens came to the world");
        String alien = secretFile.getConfidentialFile();
        System.out.println(alien);

        StaticBlock statickBlock1 = new StaticBlock();
        String staticBlockVariable = statickBlock1.variable1;
        System.out.println(staticBlockVariable);

        OtherPeople otherPeople = new OtherPeople();

        Person person1 = new Person("John", "Black",30);
        System.out.println(person1.hashCode());
        Person person2 = new Person("Max", "Thunder",28);
        Person person3 = new Person("John", "Black", 28);
        System.out.println(person2.hashCode());
        System.out.println(person1.toString());

        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(otherPeople));

        System.out.println(person1.equals(person3));

        PersonRecord personRecord1 = new PersonRecord("George", "Brown", 32);
        System.out.println(personRecord1.getClass().isRecord());
        System.out.println(personRecord1.name());
        System.out.println(personRecord1.lastname());
        System.out.println(personRecord1.age());
        PersonRecord personRecord2 = new PersonRecord("Tommy", "Brown", 28);
        System.out.println(personRecord1.equals(personRecord2));
        System.out.println(personRecord1.hashCode());
        System.out.println(personRecord1.toString());
        PersonRecord personRecord3 = new PersonRecord("Max","Thunder");
        System.out.println(personRecord3.name());
        System.out.println(personRecord3.lastname());
        personRecord3.print();
        PersonRecord.printStatic();
        String staticName= PersonRecord.middleName = "Charles";
        System.out.println(staticName);

        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG);
        System.out.println(Animals.PIG);

        System.out.println(Animals.CAT.sound);
        System.out.println(Animals.DOG.sound);
        System.out.println(Animals.PIG.sound);

        Animals.CAT.sound = "girrr..";
        Animals.DOG.sound = "hirrrr";
        Animals.PIG.sound = "wee-wee";

        System.out.println(Animals.CAT.sound);
        System.out.println(Animals.DOG.sound);
        System.out.println(Animals.PIG.sound);
        System.out.println();
        for (Animals animals : Animals.values()){
            System.out.println(animals.sound);
        }

        System.out.println();
        System.out.println(Animals.CAT.ordinal());
        System.out.println(Animals.DOG.ordinal());
        System.out.println(Animals.PIG.ordinal());

        System.out.println();
        System.out.println(Salary.George.displaySalary());
        System.out.println(Salary.Max.displaySalary());
        System.out.println(Salary.John.displaySalary());*/

        AnnotationClass obj = new AnnotationClass();
        try {
            Class<?> class1 = obj.getClass();
            Annotation annotation = class1.getAnnotation(AnnotationExample.class);
            System.out.println(annotation);
            Method m = class1.getDeclaredMethod("method");
            AnnotationExample annotation1 = m.getAnnotation(AnnotationExample.class);
            System.out.println(annotation1);
            Field field1 = AnnotationClass.class.getDeclaredField("middleName");
            AnnotationExample annotaion2 = field1.getAnnotation(AnnotationExample.class);
            System.out.println(annotaion2);
        }catch (Exception e){
            System.out.println("Exception");
        }

        Runtime.getRuntime().gc();
        System.gc();

        new AnnotationClass();
        AnnotationClass annotationClass = new AnnotationClass();
        AnnotationClass annotationClass1 = new AnnotationClass();
        annotationClass=annotationClass1;
        annotationClass = null;
        Runtime.getRuntime().gc();

    }

//static void change(int a){
    //      a = a+5;
//}

}
