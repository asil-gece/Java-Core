import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);
        /*int number = getData.nextInt();
        System.out.println("You have entered an int data type and your value is: " + number);
        byte number2 = getData.nextByte();
        System.out.println("You have entered a byte data type and your value is: " + number2);
        short number3 = getData.nextShort();
        System.out.println("You have entered a short data type and the value is: " + number3);
        float number4 = getData.nextFloat();
        System.out.println("You have entered a float data type and the value is: " + number4);
        double number5 = getData.nextDouble();
        System.out.println("You have entered a double data type and the value is: " + number5);
        boolean t = getData.nextBoolean();
        System.out.println("You have entered a boolean data type and the value is: " +t);
        String stringData = getData.nextLine();
        System.out.println("You have entered a string data type and the value is:" + stringData);
        String stringData1 = getData.next();
        System.out.println("You have entered a string data type and the value is: " + stringData1);

        System.out.println("Please enter your speed");
        int speed = getData.nextInt();
        if (speed >= 100){
            System.out.println("You have exceed the speed limitation");
            if (speed >= 100 && speed < 120){
                System.out.println("Your fine is $100");
            }else {
                System.out.println("Your fine is $200");
            }
        }else {
            System.out.println("Your speed is normal");
        }
        System.out.println("Please enter a sentence");
        for (int i = 0; i <3; i++){
            String sentence = getData.next();
            System.out.print(sentence);
        }

        System.out.println("Please enter a number between 1 to 10:");
        for (int i = 3; i > 0; i--) {
            int luckyNumber = getData.nextInt();
            switch (luckyNumber) {
                case 1, 2, 3, 4, 5, 6, 8, 9, 10 ->
                        System.out.println("You didn't guess your lucky number and you have " + (i - 1) + " right left.");
                case 7 -> System.out.println("You got your lucky number correct!");
                default ->
                        System.out.println("Please enter a valid number between 1 to 10 and you have " + (i - 1) + " right left");
            }
            if (luckyNumber == 7)
                break;

        }
        int [][] array = new int[2][2];
        System.out.println("Please enter the 1st row and the 1st column of the array.");
        array[0][0] = getData.nextInt();
        System.out.println("Please enter the 1 row and the 2nd column of the array");
        array[0][1] = getData.nextInt();
        System.out.println("Please enter 2nd row and the 1st column of the array");
        array[1][0] = getData.nextInt();
        System.out.println("Please enter 2nd row and the 2nd column of the array");
        array[1][1] = getData.nextInt();

        String value = JOptionPane.showInputDialog("Hello World");
        JOptionPane.showMessageDialog(null,5, "Nerd Byte Message",JOptionPane.WARNING_MESSAGE); */

        String quiz = JOptionPane.showInputDialog("Please enter your quiz point");
        int q1 = Integer.parseInt(quiz);

        while (q1<0 | q1>100){
            quiz = JOptionPane.showInputDialog("Please enter a valid point");
            q1 = Integer.parseInt(quiz);
        }

        String finalExam = JOptionPane.showInputDialog("Please enter your final point");
        int f1 = Integer.parseInt(finalExam);

        while (f1<0 | f1>100){
            finalExam = JOptionPane.showInputDialog("Please enter a valid point");
            f1 = Integer.parseInt(finalExam);
        }

        int grade = (int) (q1*0.3 + f1*0.7);
        String result = "Your grade is: " + grade;
        JOptionPane.showMessageDialog(null,result, "grade calculation",JOptionPane.INFORMATION_MESSAGE);
    }
}