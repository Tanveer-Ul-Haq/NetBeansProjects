
package employee__heirarchy;

/**
 *
 * @author tanve
 */
public class Salaried__Employee extends Employee__Heirarchy{

    private double weeklySalary; 

    public Salaried__Employee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        
        this.setWeeklySalary(salary);
    }
    
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double salary) {
        if(salary >= 0.0){
            this.weeklySalary = salary;
        }else 
            throw new IllegalArgumentException("Weekly Salary Must be >= 0.0");
    }

    @Override
    public double earnings() {
        return  getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary" , getWeeklySalary());
    }
}
