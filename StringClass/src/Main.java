import java.awt.*;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char[] Array = {'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r'};
        String character = new String(Array);
        String string1 = "I am learning String Class";
        System.out.println(character + " " + string1);

        String string2 = "This is an example of the String class";
        int string2_length = string2.length();
        System.out.println(string2_length);

        String string3 = "Hello";
        String string4 = "Nerds";
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string3 + " " + string4);

        String string5 = string3 + " " + string4;
        System.out.println(string5);

        String string6 = "Hello ";
        String string7 = "World";
        String string8 = string6.concat(string7);
        System.out.println(string8);

        //when we compare two numeric value we use '==' marks which means equal operator in numeric values.
        //when we compare two character based value we use 'equals()' method from String class.

        String string9 = "Hello";
        String string10 = "hello";

        if (string9.equalsIgnoreCase(string10)) {
            System.out.println("These two strings are equal");
        } else {
            System.out.println("These two strings are not equal");
        }

        String string11 = "max";
        String string12 = "MAX";

        System.out.println(string11.compareTo(string12));
        System.out.println(string11.compareToIgnoreCase(string12));

        String string13 = "abc";
        String string14 = "def";

        System.out.println(string13.compareTo(string14));

        String string15 = "I am learning Java.";
        String string16 = "Java";
        boolean control1;

        control1 = string15.regionMatches(14, string16, 0, string16.length());
        if (control1 == true) {
            System.out.println("String15 contains String16 = " + string15 + " " + string16);
        } else {
            System.out.println("String15 doesn't contain String16= " + string15 + " " + string16);
        }

        String string17 = "Java programming language";
        boolean control2;
        control2 = string17.startsWith("Java");
        System.out.println(control2);

        boolean control3;
        control3 = string17.endsWith("language");
        System.out.println(control3);

        boolean control4 = string17.startsWith("ava",1);
        System.out.println(control4);

        // While I can overload the startsWith() method and I can specify the index number where the inspection starts from
        //I cannot do the same thing for endsWith() method
        //boolean control5;
        //control5 = string17.endsWith("age", 10);

        //syntax of getChar() => getChars(int starting_index_number, int ending_index_number, char sourceArray[], int source_index)

        String string18 = "Hello World Welcome To Nerd Byte Academy";
        char [] arrayChar = new char[30];
        string18.getChars(6,11,arrayChar,0);
        System.out.println(arrayChar[0]);
        System.out.println(arrayChar[1]);
        System.out.println(arrayChar[2]);
        System.out.println(arrayChar[3]);
        System.out.println(arrayChar[4]);
        //System.out.println(arrayChar[5]);

        System.out.println();
        String string19 = "ABCD";
        System.out.print("The first letter of alphabet is: ");
        System.out.println(string19.charAt(0));
        System.out.print("The second letter of alphabet is: ");
        System.out.println(string19.charAt(1));
        System.out.print("The third letter of alphabet is: ");
        System.out.println(string19.charAt(2));
        System.out.print("The fourth letter of alphabet is: ");
        System.out.println(string19.charAt(3));
        System.out.println();

        String string20 = "Hello Nerds";
        int string20Length=string20.length();
        char[] string20Array = new char[string20Length];
        string20Array = string20.toCharArray();
        for (int i = 0; i< string20Length -1 ; i++){
            System.out.print(string20Array[i]);
        }

        System.out.println();
        String string21 = "Hello I am learning String Class";
        System.out.print("The fist index of 'e' in String21 is: ");
        System.out.println(string21.indexOf("e"));
        System.out.print("The last index of 'e' in String 21 is: ");
        System.out.println(string21.lastIndexOf("e"));
        System.out.println(string21.indexOf("learning"));
        System.out.println(string21.indexOf("learninggg"));
        System.out.println();

        System.out.println(string21.indexOf("e",12));
        System.out.println(string21.lastIndexOf("l",2));
        System.out.println();

        String string22 = "Hello Nerds Welcome To Nerd Byte";
        String string23;
        String string24;

        string23 = string22.substring(6,11);
        System.out.println(string23);

        string24 = string22.substring(0,5);
        System.out.println(string24);

        String string25 = "Hello Nerds Welcome";
        String string26;
        System.out.println("This is our original String25: " + string25);
        string26 = string25.replace("e","o");
        System.out.println("This is replaced string value: " + string26);
        System.out.println();

        String string27 = " Hello World ";
        System.out.println(string27);
        System.out.println(string27.trim());
        System.out.println(string27.length());
        String string28 = string27.trim();
        System.out.println(string28.length());

        String string29 = "Nerd Byte Academy";
        System.out.println(string29.toUpperCase());
        System.out.println(string29.toLowerCase());

        int int1 = 7;
        float float1 = 15f;
        double double1 = 14.5;
        char char1 = 'c';
        long long1 = 45;
        boolean boolean1 = false;
        Object o = new String("test");
        String string30;

        string30 = String.valueOf(int1);
        System.out.println(string30 + 15);
        string30 = String.valueOf(float1);
        System.out.println(string30 + 5);
        string30 = String.valueOf(char1);
        System.out.println(string30 + char1);
        string30 = String.valueOf(long1);
        System.out.println(string30+long1);
        string30 = String.valueOf(boolean1);
        System.out.println(string30 + boolean1);
        string30 = String.valueOf(o);
        System.out.println(string30 + o);
        System.out.println();

        String string31 = "Hello\n";
        System.out.println(string31.repeat(5));
        System.out.println();


        String string32 = "";
        System.out.println(string32.isBlank());

        if (!string32.equals("") && string32.trim().length() !=0){
            System.out.println("The string32 is not blank");
        }else {
            System.out.println("The string32 is blank");
        }

        String string33 = " Hello ";
        System.out.println("#" + string33.strip() + "#");
        System.out.println("#"+string33+"#");
        System.out.println("#" + string33.stripLeading()+ "#");
        System.out.println("#" + string33.stripTrailing() + "#");

        String string34 = "Hello\n\r World";
        System.out.println(string34);

        String string35 = "Hello\n Nerds\r Welcome";
        System.out.println(string35);
        List listString35 = string35.lines().collect(Collectors.toList());
        System.out.println(listString35);
        System.out.println();

        String string36 = "Hello";
        System.out.println(string36.indent(5));
        System.out.println(string36.length());
        String string37 = string36.indent(5);
        System.out.println(string37.length());

        String string38 = "Nerd Byte Academy Where Coding Becomes Fun";
        StringTokenizer stringTokenizer = new StringTokenizer(string38);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println();

        String string39 = "Nerd-Byte-Academy-Where-Coding-Becomes-Fun";
        String string40 ="-";
        StringTokenizer stringTokenizer1 = new StringTokenizer(string39,string40);
        while (stringTokenizer1.hasMoreElements()){
            System.out.println(stringTokenizer1.nextElement());
        }

        String string41 = "NERD";
        string41 += " BYTE";
        System.out.println(string41);

        StringBuffer stringBuffer = new StringBuffer("NERD");
        stringBuffer.append(" BYTE");
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer("x");
        stringBuffer1.append("=").append("7").append("y").append("=").append("c");
        System.out.println(stringBuffer1);

        StringBuffer stringBuffer2 = new StringBuffer("C++");
        stringBuffer2.append(" is a fun ");
        stringBuffer2.replace(0,3,"Java");
        stringBuffer2.insert(14, "language");
        System.out.println(stringBuffer2);

        String string42 = """
                dasdsadasdasdasdasdasdasdasd
                asdasdasdasdasdasdad
                asdasdsadasdasd
                
                """;





    }
}