public class Filmueb {

    public static void main(String[] args) {
        ConsoleDataReader cdr = new ConsoleDataReader();
        cdr.createMovie();
        cdr.createTvSeries();
        cdr.createMovie();

        Filmueb.about();
    }

    static void about(){
        System.out.println();
        System.out.println("******-----------******");
        System.out.println("Filmueb");
        System.out.println("version: 0.1");
    }
}
