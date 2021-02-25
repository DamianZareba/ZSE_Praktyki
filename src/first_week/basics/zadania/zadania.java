package first_week.basics.zadania;

public class zadania {

    public static void main(String[] args) {
       // Zadanie 1

        String myStringA = "Damian";
        System.out.println("Mam na imie " + myStringA);
       int myIntA = 23;
        System.out.println("Moja ulubiona liczba to " + myIntA);
       double myDoubleB = 3.54;
        System.out.println("Moja średnia z pierwszego półrocza to " + myDoubleB);
       char myCharC = '$';
        System.out.println("Mój ulubiony znak to " + myCharC);

        // Zadanie 2

        int A = 5;
        int B = 2;
        int sum = A*A + B*B;
        System.out.println("Wynik działania to " + sum);

        // Zadanie 3

        double sqrt = Math.sqrt(3);
        int bok = 7;
        double wynik = bok*bok * sqrt/4;
        System.out.println("Pole równe jest " + wynik);

        // Zadanie 4

        String myStringB = "Damian";
        String myStringC = "Zaręba";
        System.out.println("Nazywam się " + myStringB + " " + myStringC);
    }
}
