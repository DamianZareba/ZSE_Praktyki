package first_week.basics;

import java.sql.SQLOutput;

public class lekcja_basics {

    public static void main(String[] args) {
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // Dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie wynik: " + sum);


        // Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmoiwanie wynik: " + sum);

        // Mnożenie zmiennych
        sum = myIntA * myIntB;
        System.out.println("Mnożenie wynik: " + sum);

        // Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("DzielenieBA przez 2: " + sum);

        sum = myIntC / 2;
        System.out.println("Dzielenie C = 77 przez 2: " + sum);


        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA + myDoubleB;

        System.out.println(sumDouble);

        // znaki ( characters )

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja ulubiona literka to: " + myCharA);
        System.out.println("Moj  ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to : " + sumChar);

        // string ciagi znakow słlowa i wyrazy
        String myStringA = "Marcin";
        String myStringB = "lubi placki";
        String myStringC = " z dzemem.";

        System.out.println(myStringA + "\n" + myStringB + myStringC);

        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);
    }
}
