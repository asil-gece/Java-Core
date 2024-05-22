
public class Main {
    public static void main(String[] args) {
        //Usage of addition assignment operator
        int x = 5;
        int y = 7;
        y += 5;
        System.out.println(y);
        //Usage of subtraction assignment operator
        y -= 3;
        System.out.println(y);
        //Usage of multiplication assignment operator
        y *= 2;
        System.out.println(y);
        //Usage of division assignment operator
        y /= 3;
        System.out.println(y);
        //Assigning data to each other
        int num1 = 3;
        int num2 = 5;

        int num3 = num1 = num2;

        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);

        int a = 5;
        int b = 10;
        int c;

        c = a;
        a = b;

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

        int a1 = 5;
        int b1 = 6;
        //Greater operator
        System.out.println(a1 > b1);
        //Smaller operator
        System.out.println(a1 < b1);
        //Smaller and equal operator
        System.out.println(a1 <= b1);
        //Greater and smaller operator
        System.out.println(a1 >= b1);
        //Equal operator
        System.out.println(a1 == b1);
        //Not equal operator
        System.out.println(a1 != b1);
        //Adding the values based on data name
        int a2 = 5;
        int b2 = 8;
        int c2 = a2 + b2;

        System.out.println(c2);
        //Subtracting values based on data name
        int a3 = 10;
        int b3 = 4;
        int c3 = a3 - b3;

        System.out.println(c3);
        //Multiplying values based on data name
        int a4 = 5;
        int b4 = 6;
        int c4 = a4 * b4;

        System.out.println(c4);
        //Dividing values based on data name
        int a5 = 10;
        int b5 = 5;
        int c5 = a5 / b5;

        System.out.println(c5);
        //Getting the mode based on data name
        int a6 = 13;
        int b6 = 9;
        int c6 = a6 % b6;

        System.out.println(c6);
        //Assigning a new value using the minus operator
        int a7 = 8;
        a7 = -a7;

        System.out.println(a7);

        a7 = -a7;

        System.out.println(a7);
        //Postfix increment operator
        int number1 = 10;
        int a8, b8;
        a8 = number1++;

        System.out.println(a8);
        System.out.println(number1);
        //Prefix increment operator
        b8 = ++number1;

        System.out.println(b8);

        boolean t = true;
        boolean f = false;
        //Bitwise and operator
        System.out.println("t&f = " + (t & f));
        //Bitwise or operator
        System.out.println("t|f = " + (t | f));
        //And operator
        System.out.println("t&&f = " + (t && f));
        //Or operator
        System.out.println("t||f = " + (t || f));
        //Bitwise not operator
        System.out.println("!t = " + (!t));
        //XOR (Exclusive bitwise or operator)
        System.out.println("t^f = " + (t ^ f));

        int bit = 0b1111;
        int bit2 = 0b1010;


        System.out.println(bit);
        System.out.println(~bit);

        String bitBinary = Integer.toBinaryString(-16);
        System.out.println(bitBinary);
        System.out.println(bit & bit2);
        int result = 0b1010;
        System.out.println(result);

        int result2 = 0b1111;
        System.out.println(result2);
        System.out.println(bit2 | bit);

        System.out.println(bit ^ bit2);

        int result3 = 0b0101;
        System.out.println(result3);
        //Signed right shift operator
        System.out.println(bit >> 2);

        String bitOperatorSwipeRight = Integer.toBinaryString(3);
        System.out.println(bitOperatorSwipeRight);
        //Signed left shift operator
        System.out.println(bit2 << 2);
        String bitOperatorSwipeLeft = Integer.toBinaryString(40);

        System.out.println(bitOperatorSwipeLeft);

        Integer intObject = Integer.valueOf(8);
        System.out.println(intObject instanceof Integer);


    }
}