package first_week.basics.zadania;

import java.util.Scanner;

public class Zadanie2_pętle {
    public static void main(String[] args) {

        // Zadanie 1
        Scanner zad1 = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = zad1.nextInt();

        if (x > 0){
            System.out.println("Twoja liczba jest większa od 0");
        }
        else {
            System.out.println("Twoja liczba jest mniejsza od 0");
        }

//        //Zadanie 2
        Scanner zad2 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = zad2.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = zad2.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = zad2.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Największa liczba to: " + a);
            }
        }
        if (a < b){
            if (c < b){
                System.out.println("Największa liczba to: " + b);
            }
        }
        if (a > b){
            if (a < c){
                System.out.println("Największa liczba to: " + c);
            }
        }

        //Zadanie 3
        Scanner zad3 = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = zad3.next();
        System.out.println("Podaj hasło: ");
        String hasło = zad3.next();

        if (login.equals("admin")){
            if (hasło.equals("tajnehaslo")){
                System.out.println("Zalogowano pomyślnie :D");
            }
            else{
                System.out.println("Niezautoryzowany użytkownik ");
            }
        }
        else{
            System.out.println("Niezautoryzowany użytkownik ");
        }

        //Zadanie 4
        Scanner zad4 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int A = zad4.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int B = zad4.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int C = zad4.nextInt();
        if (A > B) {
            if (B > C) {
                System.out.println("Kolejność malejąca");
            }
        }
        if (A < B){
            if (B < C){
                System.out.println("Kolejność rosnąca");
            }
        }
        if (A > B){
            if (B < C){
                System.out.println("Brak kolejności");
            }
        }
        else {
            System.out.println("Brak kolejności");
        }

        // Zadanie 5
        Scanner zad5 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double X = zad5.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double y = zad5.nextDouble();
        System.out.println("Podaj swój wybór (+,- ,* ,/): ");
        char wybor = zad5.next().charAt(0);

        switch (wybor){
            case '+':
                double sum = X + y;
                System.out.println("Dodawanie równa sie: " + sum);
                break;
            case '-':
                double odejm = X - y;
                System.out.println("Odejmowanie równa się: " + odejm);
                break;
            case '*':
                double mnoz = X * y;
                System.out.println("Mnożenie równa się: " + mnoz);
                break;
            case '/':
                double dziel = X / y;
                System.out.println("Dzielenie równa się: " + dziel);
                break;
        }

    }
}

