import com.org.inner.IAnonymous;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* House house_obj_1 = new House();
        House.Bedroom bedroom_obj_2 = house_obj_1.new Bedroom();
        //House.Bedroom bedroom_obj = new House().new Bedroom();

        House.Storage storage_obj = new House.Storage();

        bedroom_obj_2.printBedroom();
        storage_obj.printStorage();

        House.Storage.storageItem();

        House house_obj_2 = new House();
        house_obj_2.printHouseOfBathroom();

        House.LivingRoom livingRoom_obj_1 = new House().new LivingRoom();
        livingRoom_obj_1.printLivingRoomOFBathroom();

        House house_obj_3 = new House();

        House.LivingRoom livingRoom_obj_3 = new House().new LivingRoom();

        LocalClass localClass_obj = new LocalClass();
        localClass_obj.innerClass1();*/

        Anonymous anonymous_obj1 = new Anonymous();
        anonymous_obj1.anonymous();

        Anonymous anonymous_obj2 = new Anonymous(){
            @Override
            public void anonymous() {
                System.out.println("This is obj_2");
            }
        };

        anonymous_obj2.anonymous();

        IAnonymous anonymous_obj3 = new IAnonymous() {
            @Override
            public void eat() {
                System.out.println("The unknown animal is eating");
            }
        };

        anonymous_obj3.eat();

        IAnonymous iAnonymous_obj = new IAnonymous() {
            @Override
            public void eat() {
                System.out.println("The unkown anmial2 is eating");
            }
        };


        Anonymous anonymous_obj4 = new Anonymous();
        anonymous_obj4.myMethod().eat();
    }
}