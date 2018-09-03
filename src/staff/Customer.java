package staff;

public class Customer implements Authenticated {

    private String name;
    private String id;
    private String occupation;
    private Authentication authentication;

    public Customer(){

        this.authentication = new Authentication();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }

    @Override
    public boolean authenticates(int password) {
        return this.authentication.authenticates(password);
    }
}
