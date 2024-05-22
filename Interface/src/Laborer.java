import com.org.employee.EmployeeSalary;

public class Laborer implements EmployeeSalary {
    double fixedHourlyRate;

    @Override
    public void departmentPrint() {
        System.out.println("This is laborer department");
    }

    @Override
    public double assignSalary(double fixedHourlyRate) {
        System.out.print("The salary of a laborer is: ");
        this.fixedHourlyRate = fixedHourlyRate;
        return fixedHourlyRate * workingHours * 20;
    }
}
