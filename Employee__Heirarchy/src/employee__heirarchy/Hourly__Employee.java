
package employee__heirarchy;

/**
 *
 * @author tanve
 */
public class Hourly__Employee extends Employee__Heirarchy{
  private double wage; //wage per hour
  private double hours;// hours worked for week

    public Hourly__Employee(String firstName, String lastName, String ssn, double hours, double  wage) {
        super(firstName, lastName, ssn);
        this.setHours(hours);
        this.setWage(wage);
       
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double hourlyWage) {
        if(hourlyWage >= 0.0){
            this.wage = hourlyWage;
        }else
            throw  new IllegalArgumentException("HourLY Wage must be >=0.0");
    }
   

    public double getHours() {
        return hours;
    }

    public void setHours(double hourWorked) {
        if(hourWorked >= 0.0){
           this.hours = hourWorked;
        }else
            throw new IllegalArgumentException("Hour must be >=0.0 and <=168"); //work hour per week 7*24hrs
    }

    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWage()*getHours();
        }else{
            return getWage()*getHours()+(getHours()-40)*getWage()*1.5;
        }
    }

    @Override                                                            
    public String toString()                                             
    {                                                                    
         return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage" , getWage(), "hours worked", getHours() );
    }
}

