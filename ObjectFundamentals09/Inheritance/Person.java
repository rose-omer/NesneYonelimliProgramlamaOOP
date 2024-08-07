package ObjectFundamentals09.Inheritance;

abstract public class Person {
    protected String firstName;
    protected String lastName;
    private  String emailAdress;

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

    public String getFullName () {
        return firstName+" "+lastName;
    }

    abstract public String getGreetings ();

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
