import com.org.inner.LocalClassI;

public class House {

    public House() {
        System.out.println("This is house class constructor");
    }

    public void printHouseOfBathroom (){
        Bathroom bathroom = new Bathroom();
        bathroom.printBathroom();
    }
    public class LivingRoom implements LocalClassI {
        public LivingRoom() {
            System.out.println("This is LivingRoom constructor");
        }

        public void printLivingRoomOFBathroom(){
            Bathroom bathroom_obj_2 = new Bathroom();
            bathroom_obj_2.printBathroom();
        }

        @Override
        public void run() {

        }
    }

    private class Bathroom {
        public void printBathroom(){
            System.out.println("This is a method from bathroom");
        }

    }

    public class Bedroom {
        public void printBedroom() {
            System.out.println("This is bedroom method");
        }


    }

    public static class Storage {
        public void printStorage() {
            System.out.println("This is a method from the static storage class");
        }

        public static void storageItem()

        {
            System.out.println("Items are stored in this storage");
        }
    }
}
