import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Declaration of an array
        int[] array1;
        String[] array2;
        Object[] array3;
//Declaration of not Java style array
        int array4[];
//Declare arrays next to each other
        int[] array5; String array6[];
//1st way to Give values to an array
        int[] array7 = {1, 2, 3, 4, 5, 6};
//Printing out the elements in the array using index number
        System.out.println(array7[0]);
        System.out.println(array7[1]);
        System.out.println(array7[2]);
        System.out.println(array7[3]);
//Giving the length of an array
        int[] array8 = new int[5];
        int[] array9 = new int[]{7, 8, 9, 10};

        //false array declaration int[] array;
        //array = {1,2,3,4,5};
//2nd way to give values in an array
        int[] array10 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            System.out.println(array10[i]);
        }

        int[] array11;
        array11 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array12;
        array12 = new int[6];
        for (int i = 0; i < 5; i++) {
            array12[i] = i * i;
            System.out.println(array12[i]);
        }

        int[] array13 = {20, 21, 22, 23};
        for (int i : array13) {
            System.out.println(i);
        }

        String[] array14 = {"element 1", "element 2", "element 3"};
        for (String element : array14) {
            System.out.println(element);
        }


        char character = 'a';
        int unicode = (int) character;
        System.out.println(unicode);

        int[] array15 = {1, 2, 3, 'a'};
        for (int array15Elements : array15) {
            System.out.println(array15Elements);
        }

        /*int[] array16 = new int[6];
        for (int i = 0; i<10; i++){
            System.out.println(array16[i]);*/

        Object[] array16 = new Object[3];
        array16[0] = 2;
        array16[1] = "int ";
        array16[2] = 444.3;
        for (Object objectArray : array16) {
            System.out.println(objectArray);
        }

        int[] array17 = new int[]{23, 14, 17, 9, 3, 18, 22};
        for (int i = 0; i < array17.length; i++) {
            System.out.println(array17[i]);
        }
        int[] array18 = new int[4];
        for (int i = 0; i < array18.length; i++) {
            array18[i] = i + i;
            System.out.println(array18[i]);
        }

        int[] array19 = new int[array18.length];
        for (int i = 0; i < array18.length; i++) {
            array19[i] = array18[i];
            System.out.println(array19[i]);
        }

        int[] array20 = {1, 2, 3, 4, 5};
        int[] array21 = new int[5];
        System.arraycopy(array20, 0, array21, 0, 5);
        for (int i = 0; i < array20.length; i++) {
            System.out.println(array21[i]);
        }


        int[] array22 = {10, 11, 13, 14, 15};
        int[] array23 = {16, 17, 18, 19, 20};
        System.arraycopy(array22, 1, array23, 2, array22.length - 2);
        for (int i = 0; i < array22.length; i++) {
            System.out.println(array23[i]);
        }


        int[] array24 = {2, 6, 4, 13, 11};
        Arrays.sort(array24);
        for (int sortedArray : array24) {
            System.out.println(sortedArray);
        }

        int[] array25 = {23, 20, 21, 22, 30, 7};
        Arrays.sort(array25, 0, 3);
        for (int sortedArray25 : array25) {
            System.out.println(sortedArray25);
        }

        int[] array26 = {20, 18, 23, 27, 30};
        int element23 = Arrays.binarySearch(array26, 23);
        System.out.println(element23);
        int element35 = Arrays.binarySearch(array26, 35);
        System.out.println(element35);

        int[] array27 = {20, 21, 22, 23, 24, 25};
        int element27 = Arrays.binarySearch(array27, 27);
        if (element27 < 0) {
            System.out.println("The value wasn't found in the array");
        } else {
            System.out.println("The value has been found and the index number is: " + element27);
        }


        char[] array28 = {'N', 'B'};
        char[] array29 = {'N', 'B'};
        System.out.println(Arrays.equals(array28, array29));

        int[] array30 = {1, 2};
        int[] array31 = {1, 2};
        System.out.println(Arrays.equals(array30, array31));

        int[] array32 = new int[1];
        System.out.println(array32[0]);

        String[] array33 = new String[1];
        System.out.println(array33[0]);

        boolean[] array34 = new boolean[1];
        System.out.println(array34[0]);

        int[][] array35 = new int[3][3];
        int[][][] array36 = new int[2][3][4];

        int[][] array37 = new int[][]{{3, 5}, {7, 4}};
        System.out.println(array37[1][0]);

        int[][][] array38 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};
        System.out.println(array38[2][1][2]);

        for (int i = 0; i < array38.length; i++) {
            for (int j = 0; j < array38[i].length; j++) {
                for (int k = 0; k < array38[i][j].length; k++) {
                    System.out.println(array38[i][j][k]);
                }
            }
        }

        for (int[][] dimension3 : array38) {
            for (int[] dimension2 : dimension3) {
                for (int dimension1 : dimension2) {
                    System.out.println(dimension1);
                }
            }
        }


        System.out.println(array38.length);
        System.out.println(array38[0].length);
        System.out.println(array38[1].length);

        String[] array39 = {"New York", "Rio", "Stockholm", "Istanbul"};
        List citiesList = new ArrayList();

        citiesList = Arrays.asList(array39);
        System.out.println(citiesList);
        System.out.println(citiesList.get(2));


        char[] array40 = {'N', 'E', 'R', 'D', 'B', 'Y', 'T', 'E'};

        char[] array41 = {};

        array41 = Arrays.copyOf(array40, 4);
        for (char array41Nerd : array41) {
            System.out.print(array41Nerd);
        }

        int[] array42 = {20, 21, 22, 23, 24, 25};
        int[] array43 = {};

        array43 = Arrays.copyOfRange(array42, 2, 7);
        for (int array43Elements : array43) {
            System.out.println(array43Elements);
        }


        int[] array44 = {1, 2, 3, 4, 5};
        Arrays.fill(array44, 5);
        for (int array44Elements : array44) {
            System.out.println(array44Elements);
        }


        int[] array45 = {10, 11, 13, 15, 16};
        Arrays.fill(array45, 2, 5, 20);
        for (int array45Elements : array45) {
            System.out.println(array45Elements);
        }

        int [] array47 = new int[3];

        arrayMethod(array47);

        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }

    }

    static void arrayMethod(int[] array46) {
        for (int i = 0; i < 3; i++){
            array46[i] = i;
            System.out.println(array46[i]);
        }
    }
}