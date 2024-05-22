import com.org.employee.EmployeeSalary;

public class SalesPerson implements EmployeeSalary {
    double unitPrice = 16.5;
    double fixedHourlyRate;
    int soldUnit;

    @Override
    public void departmentPrint() {
        System.out.println("This is sales department");
    }

    @Override
    public double assignSalary(double fixedHourlyRate) {
        System.out.print("The salary of a salesperson is: ");
        this.fixedHourlyRate = fixedHourlyRate;
        return (fixedHourlyRate * workingHours * 20) + ((unitPrice*soldUnit) * 0.2);
    }
}
