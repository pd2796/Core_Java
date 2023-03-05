public class customer {

    private String firstName,LastName,creditcard;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        if(firstName==null){
            System.out.println("invalid first name");
        }
        this.firstName = firstName;
    }
}
