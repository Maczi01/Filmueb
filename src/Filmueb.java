public class Filmueb {

    public static void main(String[] args) {
        Film film = new Film("Underdog", "Maciej Kawulski", 2018, "Akcja",
                "Zawodnik MMA wraca na ring",6.8);
        Serial serial = new Serial("Lost", 6, 121, "J.J. Abrams", "Akcja",
                "Opowieść o grupie rozbitków", 9.0);
        Actor actor = new Actor("Jake", "Gyllenhall", "USA");

        film.showInfo();
        System.out.println("---");
        serial.showInfo();
        System.out.println("---");
        actor.showInfo();
        Filmueb.about();
    }

    static void about(){
        System.out.println();
        System.out.println("Filmueb");
        System.out.println("version: 0.1");
    }
}
