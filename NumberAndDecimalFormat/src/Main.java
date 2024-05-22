import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale [] localeArray = Locale.getAvailableLocales();
        for (Locale locale : localeArray){
            System.out.println(locale);

            //NumberFormat.getInstance().format(the_number_format);
            //NumberFormat formatting_number = NumberFormat.getInstance();
            //formatting_number.format(the_number_format);

            System.out.println(Locale.getDefault());
            System.out.println(NumberFormat.getInstance().format(1234567));
            System.out.println(NumberFormat.getInstance().format(123.4567));

            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
            System.out.println(numberFormat.format(1234567));
            System.out.println(numberFormat.format(123.54));

            NumberFormat formatter = NumberFormat.getInstance(new Locale("en_US"));
            System.out.println(formatter.format(123456));

            NumberFormat numberFormat2 = NumberFormat.getInstance(new Locale("tr","TR"));
            System.out.println(numberFormat2.format(3567));
        }

        //2.12345; max digits: 4 => 2.1234
        //3 : min digits : 2 => 3.00

        //formatter.setMinimumFractionDigits(min_decimal_fractions);
        //formatter.setMaximumFractionDigits(max_decimal_fractions);

        double number1 = 2;
        double number2 = 2.123456789;

        NumberFormat numberFormat3 = NumberFormat.getInstance(new Locale("tr","TR"));
        numberFormat3.setMinimumFractionDigits(2);
        numberFormat3.setMaximumFractionDigits(4);
        System.out.println(numberFormat3.format(number1));
        System.out.println(numberFormat3.format(number2));
        System.out.println();


        //setRoundingMode(RoundingMode.UP); => Rounding Up
        //setRoundingMode(RoundingMode.DOWN); => Rounding Down

        double[] numbers = {3.14, 5.16, 7.87, 6.99, 3.55};
        NumberFormat numberFormat5 = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat5.setMinimumFractionDigits(1);
        numberFormat5.setMaximumFractionDigits(1);
        numberFormat5.setRoundingMode(RoundingMode.UP);

        for (double number: numbers){
            System.out.println(numberFormat5.format(number));
        }
        System.out.println();
        numberFormat5.setRoundingMode(RoundingMode.DOWN);
        for (double number6 : numbers){
            System.out.println(numberFormat5.format(number6));
        }

        NumberFormat numberFormat6 = NumberFormat.getCompactNumberInstance();
        System.out.println(numberFormat6.format(250000));
        System.out.println();

       NumberFormat numberFormat7 = NumberFormat.getCompactNumberInstance(new Locale("tr","TR"), NumberFormat.Style.LONG);
        System.out.println(numberFormat7.format(3000000));

        NumberFormat numberFormat8 = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(numberFormat8.format(3000000));

        NumberFormat numberFormat9 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(numberFormat9.format(3000000));

        NumberFormat numberFormat10 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        numberFormat10.setMinimumFractionDigits(2);
        System.out.println(numberFormat10.format(3000000));
        System.out.println();

        double number11 = 0.5;
        double number12 = 25f /100f;

        NumberFormat numberFormatPercentage = NumberFormat.getPercentInstance(new Locale("tr"));
        System.out.println(numberFormatPercentage.format(number11));

        NumberFormat numberFormatPercentage2 = NumberFormat.getPercentInstance();
        System.out.println(numberFormatPercentage2.format(number12));
        System.out.println();


        NumberFormat numberFormatMoney = NumberFormat.getInstance();
        Currency currencyUnit = numberFormatMoney.getCurrency();
        System.out.println(currencyUnit.getDisplayName());
        System.out.println(currencyUnit.getCurrencyCode());
        System.out.println(currencyUnit.getNumericCode());
        System.out.println(currencyUnit.getSymbol());

        NumberFormat numberFormatMoney2 = NumberFormat.getInstance(new Locale("zh","CN"));
        Currency currencyUnit2 = numberFormatMoney2.getCurrency();
        System.out.println(currencyUnit2.getDisplayName());
        System.out.println(currencyUnit2.getCurrencyCode());
        System.out.println(currencyUnit2.getNumericCode());
        System.out.println(currencyUnit2.getSymbol());
        System.out.println();

        double PI = 3.14159;
        DecimalFormat decimalFormat1 = new DecimalFormat("0");
        System.out.println(decimalFormat1.format(PI));

        decimalFormat1 = new DecimalFormat("0.00");
        System.out.println(decimalFormat1.format(PI));

        decimalFormat1 = new DecimalFormat("00.000");
        System.out.println(decimalFormat1.format(PI));

        decimalFormat1 = new DecimalFormat("##.##");
        System.out.println(decimalFormat1.format(PI));

        String pattern1 = "###,###.###";
        double number13 = 12345.6;
        DecimalFormat decimalFormatPatter3 = new DecimalFormat(pattern1);
        System.out.println(decimalFormatPatter3.format(number13));

        String pattern2 = "000,000.000";
        double number14 = 12345.6;
        decimalFormatPatter3 = new DecimalFormat(pattern2);
        System.out.println(decimalFormatPatter3.format(number14));

        double number15 = 5.6789;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(number15));

        Locale locale = new Locale("tr","TR");
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);

        df.applyPattern(pattern2);
        System.out.println(df.format(number15));

        DecimalFormat decimalFormat2 = new DecimalFormat();
        decimalFormat2.setGroupingSize(2);
        System.out.println(decimalFormat2.format(123456789));

        DecimalFormat decimalFormat3 = new DecimalFormat();
        decimalFormat3.setGroupingSize(3);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator('*');
        decimalFormatSymbols.setDecimalSeparator('/');
        decimalFormat3.setDecimalFormatSymbols(decimalFormatSymbols);
        System.out.println(decimalFormat3.format(123456789.123456789));

        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        try {
            System.out.println(numberFormat.parse("4 thousand"));
            System.out.println(numberFormat.parse("200"));
            System.out.println(numberFormat.parse("5 million"));
        }catch (Exception e){
            System.out.println("Exception happened");
        }
    }
}