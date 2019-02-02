import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleDataReader {

    Actor[] tabelaAktorow;
    Serial[] tabelaSeriali;
    Film[] tablicaFilmow;

    void options() {
        System.out.println("Menu wyboru opcji");
        System.out.println("1 : Dodaj aktora");
        System.out.println("2 : Dodaj film");
        System.out.println("3 : Dodaj serial");
        System.out.println("4 : Wyświetl informacje o aktorach");
        System.out.println("5 : Informacje o programie");
        System.out.println("0 : Wyjscie z programu");
    }

    void menu() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            options();
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    createActor();
                    break;
                case 2:
                    createMovie();
                    break;
                case 3:
                    createTvSeries();
                    break;
                case 4:
                    wyswietlAktorow();
                    break;
                case 5:
                    aboutProgram();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Sprobuj ponownie");
            }
        } while (number != 0);

    }

    Film createMovie() {
        Scanner scanner = new Scanner(System.in);
        Film film = new Film();
        System.out.println("Podaj nazwę filmu");
        film.setName(scanner.nextLine());
        System.out.println("Podaj kategorie");
        film.setCategory(scanner.nextLine());
        System.out.println("Podaj opis filmu");
        film.setDescription(scanner.nextLine());
        System.out.println("Podaj reżysera");
        film.setDirector(scanner.nextLine());
        System.out.println("Podaj ocenę");
        film.setRating(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        film.setYearOfProduction(scanner.nextInt());
//        System.out.println("------");
//
//        System.out.println(film.getName()+ " " + film.getCategory()+ " "  + film.getDescription()+ " "  + film.getDirector()+ " "
//                + film.getRating()+ " "+film.getYearOfProduction());
        return film;
    }

    Serial createTvSeries() {
        Scanner scanner = new Scanner(System.in);
        Serial serial = new Serial();
        System.out.println("Podaj nazwę serialu");
        serial.setName(scanner.nextLine());
        System.out.println("Podaj kategorie");
        serial.setCategory(scanner.nextLine());
        System.out.println("Podaj opis filmu");
        serial.setDescription(scanner.nextLine());
        System.out.println("Podaj liczbę sezonow");
        serial.setNumberOfSeasons(scanner.nextInt());
        System.out.println("Podaj liczbę odcinkow");
        serial.setNumberOfParts(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj producenta");
        serial.setProducer(scanner.nextLine());
        System.out.println("Podaj ocenę");
        serial.setRating(scanner.nextDouble());
        return serial;
//        System.out.println(serial.getName()+" "  + serial.getCategory()+" " + serial.getDescription()+" " +
//                serial.getNumberOfSeasons()+" "+
//                serial.getProducer()+" " + serial.getRating());
    }


    void createActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu aktorów chcesz dodać ?");
        int q = scanner.nextInt();
        tabelaAktorow = new Actor[q];
        for (int i = 0; i < tabelaAktorow.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Podaj imie aktora");
            String imie = scanner1.nextLine();
            System.out.println("Podaj nazwisko aktora");
            String nazwisko = scanner1.nextLine();
            System.out.println("Podaj kraj pochodzenia aktora");
            String kraj = scanner1.nextLine();
            tabelaAktorow[i] = new Actor(imie, nazwisko, kraj);
        }
    }



    void wyswietlAktorow() {
        for (int i = 0; i < tabelaAktorow.length; i++) {
            System.out.println(tabelaAktorow[i].getFirstName());
            System.out.println(tabelaAktorow[i].getCountry());
            System.out.println(tabelaAktorow[i].getLastName());
        }
    }

    static void aboutProgram() {
        System.out.println();
        System.out.println("******-----------******");
        System.out.println("Filmueb");
        System.out.println("version: 0.1");
    }

}
