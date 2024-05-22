import java.util.Random;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Math.pow(5, 2));
        int pow = (int) Math.pow(10, 3);
        System.out.println(pow);

        System.out.println(Math.sqrt(25));
        int squareRoot = (int) Math.sqrt(16);
        System.out.println(squareRoot);

        System.out.println(Math.abs(-40));
        int absoluteValue = Math.abs(-75);
        System.out.println(absoluteValue);
        System.out.println(Math.abs(20));
        int absoluteValue2 = -(Math.abs(-30));
        System.out.println(absoluteValue2);

        System.out.println(Math.floor(7.8));
        int flooringDown = (int) Math.floor(9.6);
        System.out.println(flooringDown);

        System.out.println(Math.ceil(7.1));
        int ceilingUp = (int) Math.ceil(12.5);
        System.out.println(ceilingUp);

        System.out.println(Math.min(100,80));
        System.out.println(Math.max(100,80));

        int a = (int) ((Math.random())*10+40);
        System.out.println(a);

        System.out.println();
        Random r = new Random();
        int randomNumber1 = r.nextInt(10);
        System.out.println(randomNumber1);
        double randomNumber2 = r.nextDouble();
        boolean randomBoolean1 = r.nextBoolean();
        float randomNumber3 = r.nextFloat();
        long randomNumber4 = r.nextLong();
        System.out.println(r.nextGaussian());
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println(randomNumber4);
        System.out.println(randomBoolean1);

        int num1 = 10;
        int guess = 0;
        Random r1 = new Random();
        while (true){
            int i = r1.nextInt(11);
            if (i!=num1)
                guess++;
            else {
                System.out.println("The number was found on " + guess + ". time");
                break;
            }
        }
        System.out.println();

        Random r2 = new Random();
        for (int i = 0 ; i < 3 ; i++){
            int dice1 = r2.nextInt(6);
            dice1 ++;

            int dice2 = r2.nextInt(6);
            dice2++;
            System.out.println("The numbers we got on the dice");
            System.out.println(dice1+"-"+dice2);
        }

        System.out.println("0.5 radians = " + Math.toDegrees(0.5) + " degrees.");

        System.out.println("45 degree = " + Math.toRadians(45) + " radians");

        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.toDegrees(1.0));

        System.out.println(Math.toDegrees(Math.asin(0.745678)));

        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.toDegrees(Math.acos(1)));

        System.out.println(Math.PI);

        System.out.println(Math.log(2.45));
        System.out.println(Math.log10(1000));
        System.out.println(Math.log1p(1000));


    }
}