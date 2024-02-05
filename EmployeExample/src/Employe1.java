public abstract class Employe1 {
    private String firstName, lastName,SSN;

    public Employe1(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
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

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public abstract double earning();

    public String toString(){

        return String.format("%s%s%s",getFirstName(),getLastName(),getSSN());
        // return getFirstname+getlastname olarakta yazılabilirdi
    }
}
