package staff;

public abstract class AuthenticatedStaff extends Staff {

    private int password;

    public void setPassword(int Password){
        this.password = password;
    }

    public boolean authenticates (int password){
        if(this.password == password){
            return true;
        } else {
            return false;
        }
    }
}
