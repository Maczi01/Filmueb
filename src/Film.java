public class Film {

    private String name;
    private String director;
    private int yearOfProduction;
    private String category;
    private String description;
    private double rating;

    public Film(String name, String director, int yearOfProduction, String category, String description, double rating) {
        this.name = name;
        this.director = director;
        this.yearOfProduction = yearOfProduction;
        this.category = category;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    void showInfo(){
        System.out.println(getName());
        System.out.println(getCategory());
        System.out.println(getDescription());
        System.out.println(getRating());
        System.out.println(getCategory());
        System.out.println(getDirector());
    }
}
