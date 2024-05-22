public class Exceptions {
    public void exceptionInArray() {
        String[] array = new String[]{"Nerd", "Byte", "Academy"};
        try {
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println("There is an error happened while writing down the array");
            System.out.println(e.toString());
        }
    }

    public int divideException(int num1, int num2)throws Exception {
        if (num2 == 0) {

               throw new Exception("Please choose a number than 0");

        }
        return num1 / num2;
    }
}
