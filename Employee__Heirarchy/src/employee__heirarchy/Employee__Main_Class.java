
package employee__heirarchy;

/**
 *
 * @author tanve
 */
public class Employee__Main_Class {

    public static Salaried__Employee salariedEmployee;
    public static Hourly__Employee hourlyEmployee;
    public static Comission__Employee commissionEmployee;
    public static Base_Plus_Commission_Employee basePlusCommissionEmployee;

    public static void main(String[] args) {
   
        // create four-element Employee array
        Employee__Heirarchy[] employees = new Employee__Heirarchy[4];

        // initialize array with Employees
        employees[0] =  new Salaried__Employee("Archangel", "Macsika", "A001", 680000.00);
        employees[1] = new Hourly__Employee("Nsikak", "Imoh", "A002", 17.00, 9000.00);
        employees[2] =  new Comission__Employee("John", "Doe", "A003", 9100000, 0.04);
        employees[3] = new Base_Plus_Commission_Employee("Rose", "Maryland", "A004", 2120000, .03, 590000);

        System.out.println("Employees processed polymorphically:\n");

        for (Employee__Heirarchy currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            if (currentEmployee instanceof Base_Plus_Commission_Employee) {

                Base_Plus_Commission_Employee employee = (Base_Plus_Commission_Employee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n",  employee.getBaseSalary());
            }

            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings());
        }

    }

}
