import java.util.Random;
import java.util.Scanner;

public class Notatki {
    public static void main(String[] args) {
        int[] array = {1, 2};
        System.out.println("array[0] = " + array[0] + "\narray[1] = " + array[1]);
        System.out.println("Długość tablicy = " + array.length);


        System.out.println();
        int[] arrayInt = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Array{" + i + "} = " + arrayInt[i]);
        }

        System.out.println();

        String word = " Mam dużo kotów ";
        String[] symbol;                                     //Ustalanie wielkości tablicy
        symbol = new String[word.length()];                  //Wpisywanie symboli do tablicy
        symbol = word.split(" ");                      //regex:X pomija symbol X
        for (int i = 0; i < symbol.length; i++) {
            System.out.println("Symbol{" + i + "} = " + symbol[i]);
        }

        System.out.println();

        // Tablica Stringów Gotowa
        String[] words = {"one", "two", "house", "flamingo", "flower"};
        for (String element : words)
        {
            if(element.length() > 3)                         // Wypisuje słowa większe niż 3 symbole
                {
                System.out.println("Word = " + element);
                }
        }

        System.out.println();

        //Tablica intów + modulo
        int[] numbers = {223,-123,356,765,345,55,-56};
            for(int value: numbers)
                {
                if(value < 0 && value % 3 == 0)              // Wypisuje liczby mniejsze od 0 i podzielne przez 3
                    {
                        System.out.println(value);
                    }
                }

        System.out.println();

        //Przykład 7 Losowanie liczb i porównywanie ich

        Random random = new Random();
            int wylosowanaLiczba = 0;
            for(int i =0; i < 10; i++)
            {
                wylosowanaLiczba = random.nextInt(3);  // Losuje liczby od 0 do 2
                System.out.println("Wylosowano[" + i + "] = " + wylosowanaLiczba);
            }

        //Przykład 8 Tworzenie klasy postaci oraz wypisanie jej
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];                      // od 0-3

        System.out.println("Podaj imię: ");
        person[0] = scanner.next();

        System.out.println(person[0]);

        // Przykład 5 i 6




    }
}


