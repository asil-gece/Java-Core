//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int gradeMath = 80;

        if (/*condition*/ gradeMath >= 85) {
            /*if block*/
            System.out.println("Your grade is AA");
        } else {
            /*else block*/
            System.out.println("Your grade is not AA");
        }

        int gradeEnglish = 45;

        if (gradeEnglish >= 50) {
            System.out.println("You have passed");
        } else {
            System.out.println("You have not passed.");
        }

        int gradeGrammar = 100;
        if (gradeGrammar > 100 || gradeGrammar < 0) {
            System.out.println("This is not a correct grade");
        } else if (gradeGrammar <= 100 && gradeGrammar >= 90) {
            System.out.println("Your grade is AA");
        } else if (gradeGrammar <= 89 && gradeGrammar >= 85) {
            System.out.println("Your grade is BA");
        } else if (gradeGrammar <= 84 && gradeGrammar >= 80) {
            System.out.println("Your grade is BB");
        }

        int speed = 105;

        if (speed > 100) {
            System.out.println("You exceeded the speed limit and you caught on the radar");
            if (speed >= 100 && speed <= 110) {
                System.out.println("Your fine is $100.");
            } else if (speed > 110 && speed <= 130) {
                System.out.println("Your fine is $200. ");
            }
        } else {
            System.out.println("Your speed is normal.");
        }

        String tennisDay = "Tuesday";

        switch (tennisDay) {

            case "Monday":
                System.out.println("This is Monday. This is not tennis day.");
                break;

            case "Tuesday":
                System.out.println("This is Tuesday and this is your tennis day");
                break;

            case "Wednesday":
                System.out.println("This is Wednesday. This is not tennis day");
                break;

        }

          int luckyNumber = 3;

        switch (luckyNumber){
            case 1:
                System.out.println("This is not your lucky number");
                break;

            case 2:
                System.out.println("This is not your luck number");
                break;
            default:
                System.out.println("Your luck number was 3");
                break;
        }

        int number = 3;

        switch (number){
            case 1, 3, 5, 7, 9 -> System.out.println("The number is an odd number");
            case 0, 2, 4, 6, 8 -> System.out.println("The number is even");
        }

        int daysOfWeek = 7;

        String message = switch (daysOfWeek){
            case 1, 2, 3, 4, 5 -> "Working full-time";
            case 6 -> "Working part-time";
            case 7 -> {
                System.out.println("Finally I am not working! I am free!");
                yield  "Not working";}
            default -> "Unknown day";
        };
        System.out.println(message);

       int x = 5;
        while (/*condition*/ x < 10 & x > 0){
            /*piece of code*/
            System.out.println("This loop is running");
            x--;
        }


        int y = 10;
        do{
            System.out.println("This loop is running from do-while loop");
            y--;
            /*piece of codes*/
        }while(/*condition*/ y == 10);



        for(int i = 0; i < 10; i++){
            System.out.println("This is for loop");
        }

        int i = 0;
        while (true){
           if (i == 6){
               System.out.println("The value of i is 6 now.");
               break;
           }else {
               System.out.println("The value of i is: " + i );
           }
           i++;
        }

        for (int j = 0; j < 10; j++){
            if (j == 5){
                continue;
            }else {
                System.out.println("The value of j is:" + j);
            }
        }

    }
}
