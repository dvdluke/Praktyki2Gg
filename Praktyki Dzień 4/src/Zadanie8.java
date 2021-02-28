import java.util.Scanner;

public class Zadanie8
    {
    public static void main(String[] args)
        {
        Scanner postac = new Scanner(System.in);
        String nazwa;
        String rasa;
        String klasa;
        String bron;
            System.out.println("Wybierz imię postaci:");
            nazwa = postac.nextLine();
            System.out.println("Wybierz rasę postaci:");
            rasa = postac.nextLine();
            System.out.println("Wybierz klasę postaci:");
            klasa = postac.nextLine();
            System.out.println("Wybierz główną broń postaci:");
            bron = postac.nextLine();
            System.out.println("Stworzona przez ciebie postać to:");
            System.out.println("Nazwa postaci: " + nazwa);
            System.out.println("Rasa postaci: " + rasa);
            System.out.println("Klasa postaci: " + klasa);
            System.out.println("Broń postaci: " + bron);
        }
    }