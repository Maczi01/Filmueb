public class Serial {

    private String name;
    private int numberOfSeasons;
    private int numberOfParts;
    private String producer;
    private String category;
    private String description;
    private double rating;

    public Serial(){

    }

    public Serial(String name, int numberOfSeasons, int numberOfParts, String producer, String category, String description, double rating) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfParts = numberOfParts;
        this.producer = producer;
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

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(int numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        System.out.println(getNumberOfParts());
        System.out.println(getNumberOfSeasons());
        System.out.println(getProducer());
        System.out.println(getRating());
    }
}
