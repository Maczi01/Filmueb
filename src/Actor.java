public class Actor {

    private String firstName;
    private String lastName;
    private String country;
    private Actor[] actors;

    public Actor() {
    }

    public Actor(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
//        this.actors = actors;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public Actor[] getActors() {
//        return actors;
//    }
//
//    public void setActors(Actor[] actors) {
//        this.actors = actors;
//    }

    void showInfo() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getCountry());
    }
}
