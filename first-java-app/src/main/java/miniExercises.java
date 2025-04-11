import java.math.MathContext;
import java.sql.SQLOutput;

public class miniExercises {
    public static void main(String[] args) {

        // #1 abs
        int num = -45;
        System.out.println(Math.abs(-45));


        // #2 max
        double num2 = 3.5;
        double num3 = 7.8;

        System.out.println(Math.max(num2, num3));

        // #3 min
        int var1 = 99;
        int var2 = 23;

        System.out.println(Math.min(var1, var2));

        // #4 floor
        double num4 = 8.9;

        System.out.println(Math.floor(num4));

        // #5 ceil
        double num5 = 5.2;

        System.out.println(Math.ceil(num5));

        // #6 round
        double num6 = 9.6;

        System.out.println(Math.round(num6));

        // #7 Bonus

        double morningTemp = -3.7;
        double afternoonTemp = 12.4;

        double difference = Math.abs(afternoonTemp - morningTemp);

        System.out.println(difference);
        System.out.println(Math.max(morningTemp, afternoonTemp));
        System.out.println(Math.min(morningTemp, afternoonTemp));
        System.out.println(Math.round(afternoonTemp));
        System.out.println(Math.floor(morningTemp));

        // #8 Bonus Money Challenge
        double price = 10.876;
        double rndPrice = price * 100;
        double rndedPrice = Math.round(rndPrice);
        double finalPrice = rndedPrice / 100;
        System.out.println(finalPrice);






        }


    }

