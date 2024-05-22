//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Reptiles reptile1 = new Reptiles();
        //Birds bird1 = new Birds();
        // Cobra cobra1 = new Cobra();
        //Animals animal1 = new Animals();
        // I cannot access: cobra1.cobraName2;
        //Reptiles reptiles2 = new Reptiles();
        /*reptiles2.kind("Lizard", "Alligator");
        Cobra cobra2 = new Cobra();

        cobra1.breath();
        cobra1.cobraName = "Dolly";
        String cobraName = cobra1.cobraName;
        System.out.println(reptiles2.reptileKind());
        System.out.println(cobraName);*/
        // I cannot reach since it is declared as private: cobra2.snakeID
        //reptile1.breath();
        //bird1.breath();
        // ClassB obj_b_1 = new ClassB();
        /*SubClass obj_subClass_1 = new SubClass("Max", 28);
        obj_subClass_1.print();
        obj_subClass_1.method1();
        ClassChild obj_classChild_1 = new ClassChild();
        System.out.println(obj_classChild_1.myMethod());

        FinalSuperClass finalSuperClass_obj_1 = new FinalSuperClass();
        System.out.println(finalSuperClass_obj_1.name);

        NotFinalSubClass notFinalSubClass_obj_1 = new NotFinalSubClass();
        System.out.println(notFinalSubClass_obj_1.name);*/

        LivingCreatures livingCreatures_1 = new LivingCreatures();
        Animal animal_1 = new Animal();
        Mammal mammal_1 = new Mammal();
        Udderless udderless_1 = new Udderless();

        livingCreatures_1.tellSpecies();
        animal_1.tellSpecies();
        mammal_1.tellSpecies();
        udderless_1.tellSpecies();

        LivingCreatures livingCreatures_2 = new LivingCreatures();
        livingCreatures_2.tellSpecies();

        LivingCreatures animal_2 = new Animal();
        animal_2.tellSpecies();

        Animal mammal_2 = new Mammal();
        mammal_2.tellSpecies();

        LivingCreatures animal_3 = (LivingCreatures) new Animal();
        animal_3.tellSpecies();

        Animal udderless_2 = (Animal) new Udderless();
        udderless_2.tellSpecies();

        Animal animal_4 = new Animal();
        LivingCreatures livingCreatures_4 = animal_4;
        livingCreatures_4.tellSpecies();

        Animal animal_5 = (Animal) livingCreatures_4;
        animal_5.tellSpecies();

        Mammal mammal_4 = new Mammal();
        Animal animal_6 = mammal_4;

        Mammal mammal_5 = (Mammal) animal_6;
        mammal_5.tellSpecies();

        Mammal mammal = new Mammal();
        Animal animal = mammal;

        Mammal mammal1 = (Mammal) animal;
        mammal1.tellSpecies();

    }
}