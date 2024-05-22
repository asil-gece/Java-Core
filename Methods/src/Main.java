//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //accessModifiers_returnType_methodName(parameter1, paramater2,...){piece of code}
        write();
        System.out.println(write2());

        int x = calculation();
        System.out.println(x);

        int y = addition(3, 5);
        System.out.println(y);

        int a = 9;
        System.out.println(a);

        double z = addition(5.6, 7.8);
        System.out.println(z);

        int f = factorial(5);
        System.out.println(f);

    }

        static void write () {
            System.out.println("Hello Nerds from write method.");
        }

        static String write2 () {
            return "Hello Nerds from write 2 method.";
        }

        static int calculation () {
            return 3 * 5;
        }

        static int addition ( int a, int b){
            return a + b;
        }

        static void print () {
            int a = 7;
        }

        static double addition ( double a, double b){
            return a + b;
        }

        static int factorial ( int number){
            if (number == 1)
                return 1;
            else
                return (number * (factorial(number - 1)));
        }

    }