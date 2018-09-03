import staff.AuthenticatedStaff;

public class InternalSystem {

    private int password = 2222;

    public void authenticates (AuthenticatedStaff sa){

        boolean authenticated = sa.authenticates(this.password);

        if(authenticated){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}
