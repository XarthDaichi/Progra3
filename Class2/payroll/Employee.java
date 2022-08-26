
package payroll;

public class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Three-argument constructor
    public Employee ( String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // end three-argument Employee constructor

    public Employee ( String first, String last ) {
        this(first, last, "");
    }

    // set/get methods
    public void setFirstName( String first ) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName( String last ) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber( String ssn ) {
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    public String toString() {
        return String.format( "%s %s (social security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber() );
    } // end method toString

    public String iniTials() {
        return this.firstName.substring(0, 1) + "." + this.lastName.substring(0,1) + ".";
    }

    public boolean equals( Employee obj ) {
        return this.getSocialSecurityNumber().equals(obj.getSocialSecurityNumber);
    }
}