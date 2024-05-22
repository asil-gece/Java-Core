import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  int a = 7;
        //  int b = 0;
        //  int c = a/b;
        //  System.out.println(c);

        //try{write down the code that we want to test or run or in simple terms we are going to write down the exception
        // }catch{write down the type of the exception and the feedback related to exception
        // }finally{ Either there is an exception or not this block will be executed.}

        int a1 = 7;
        int b1 = 0;
        try {
            int c1 = a1 / b1;
        } catch (Exception ae) {
            System.out.println("An Exception Happened " + ae.toString());
        }

        int[] array = {7, 6, 8, 9, 10};
        System.out.println(array[0]);
        try {
            System.out.println("We are in try block");
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of bounds " + e.toString());
        }
        int[] array2 = {1, 2, 3, 4};
        try {
            System.out.println(array2[9]);
        } catch (Exception e) {
            System.out.println("Hey Nerds You have caused an exception go back and check!");
        }

       /* Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your grade");
       try {
           int grade1 = scanner1.nextInt();
       }catch (Exception e){
           System.out.println("There is an error!");
           System.out.println(e.toString());
           System.out.println("Please enter a number");
       }*/

        Exceptions exceptions_obj1 = new Exceptions();
        exceptions_obj1.exceptionInArray();

        int a3 = 8;
        int b3 = 0;
        String[] array3 = new String[]{"Nerd", "Byte", "Academy"};
        try {
            int c3 = a3 / b3;
            System.out.println(array3[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 2 happened");
            System.out.println(e.toString());
        } catch (ArithmeticException ae) {
            System.out.println("Exception 1 happened");
            System.out.println(ae.toString());
        }

        int a4 = 9;
        int b4 = 0;
        String[] array4 = new String[]{"Hello", "Nerds"};
        try {
            int c = a4 / b4;
            String a = array4[0];
        } catch (ArithmeticException e) {
            System.out.println("There is an exception");
            System.out.println(e.toString());
        } finally {
            System.out.println("This is finally block");
            try {
                String b = array4[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("There is a second exception");
                System.out.println(e.toString());
            }
        }
        /*Exceptions exceptions_obj2 = new Exceptions();
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Please enter the first number");
            int number1 = scanner1.nextInt();
            System.out.println("Please enter the second number");
            int number2 = scanner1.nextInt();
            exceptions_obj2.divideException(number1,number2);
        }catch (Exception e){
            System.out.println(e.toString());
        }*/

        Throws obj1_throws = new Throws();
        obj1_throws.callMethod1();
        obj1_throws.callMethod2();
        obj1_throws.callCallMethod3();

        //int a6 = 7;
        //int b6 = 0;
        //int c6 = a6 / b6;

file("file.txt");

    DrivingLicenseTest drivingLicenseTest_obj1 = new DrivingLicenseTest();
    try {
        drivingLicenseTest_obj1.drivingTestAgeLimit(15);
    }catch (DrivingLicenseTestAgeException e){
        System.out.println(e.toString());
    }
    }


private static void file(String nameOFTheFile) {
        try {
            FileReader fileReader_obj = new FileReader(nameOFTheFile);
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
}
}