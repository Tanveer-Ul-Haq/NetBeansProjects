
package employee__heirarchy;

/**
 *
 * @author tanve
 */

public abstract class Employee__Heirarchy {
  private String firstName;
  private String lastName;
   private String socialSecurityNumber;

    public Employee__Heirarchy(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }
  
    // abstract method overridden by concrete subclasses        
    public abstract double earnings(); // no implementation here
    // end abstract class Employee
     
    @Override
    public String toString(){
        return String.format("%s %s ssn: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
//}

//    public static void main(String[] args) {
        // TODO code application logic here
        
//    }
    
}
