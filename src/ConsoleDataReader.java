import java.util.Scanner;

public class ConsoleDataReader {

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

    Actor createActor() {
        Scanner scanner = new Scanner(System.in);
        Actor actor = new Actor();
        System.out.println("Podaj imie aktora");
        actor.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko aktora");
        actor.setLastName(scanner.nextLine());
        System.out.println("Podaj kraj pochodzenia aktora");
        actor.setCountry(scanner.nextLine());
//        System.out.println(actor.getFirstName() + " " + actor.getLastName() + " " +actor.getCountry());
        return actor;
    }

//    void showInfoAboutActor() {
//        createActor().getFirstName();
//        createActor().getLastName();
//        createActor().getCountry();
//    }
//
//    void showInfoAboutSerial() {
//        createTvSeries().getName();
//        createTvSeries().getCategory();
//        createTvSeries().getDescription();
//        createTvSeries().getNumberOfSeasons();
//        createTvSeries().getProducer();
//        createTvSeries().getNumberOfParts();
//        createTvSeries().getRating();
//    }
//
//    void showInfoAboutMovie() {
//        createMovie().getName();
//        createMovie().getCategory();
//        createMovie().getDescription();
//        createMovie().getDirector();
//        createMovie().getRating();
//        createMovie().getYearOfProduction();
//    }
}
