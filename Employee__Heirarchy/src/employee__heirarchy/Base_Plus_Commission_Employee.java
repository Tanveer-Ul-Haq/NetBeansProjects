
package employee__heirarchy;

/**
 *
 * @author tanve
 */
public class Base_Plus_Commission_Employee extends Comission__Employee{

    private double baseSalary;
    public Base_Plus_Commission_Employee(String firstName, String lastName, String ssn, double sales, double rate, double salary) {
        super(firstName, lastName, ssn, sales, rate);
        this.setBaseSalary(salary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary >= 0.0){
            this.baseSalary = salary;
        }else
            throw new IllegalArgumentException("Base salary must be >0.0");
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override                                                           
    public double earnings()                                                   {                                                                   
        return getBaseSalary() + super.earnings();                       
    }
                                          
    @Override                                                          
    public String toString()                                           
    {                                                                  
        return String.format( "%s %s; %s: $%,.2f",
             "base-salaried", super.toString(),                           
            "base salary", getBaseSalary() );                            
    }
   
}