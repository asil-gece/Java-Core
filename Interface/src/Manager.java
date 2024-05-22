import com.org.employee.EmployeeSalary;

public class Manager implements EmployeeSalary {
    double fixedHourlyRate;

    @Override
    public void departmentPrint() {
        System.out.println("This is management department");
    }

    @Override
    public double assignSalary(double fixedHourlyRate) {
        System.out.print("The salary of a manager is: ");
        this.fixedHourlyRate = fixedHourlyRate;
        return fixedHourlyRate * workingHours * 20;
    }
}
