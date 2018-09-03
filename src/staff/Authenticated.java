package staff;

public interface Authenticated {

    public void setPassword(int Password);

    public boolean authenticates (int password);
}
