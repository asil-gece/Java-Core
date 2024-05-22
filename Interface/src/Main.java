import com.org.example.InterfaceDefender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Laborer laborer_employee1 = new Laborer();
        Manager manager_employee1 = new Manager();
        SalesPerson salesPerson_employee1 = new SalesPerson();

        laborer_employee1.departmentPrint();
        System.out.println(laborer_employee1.assignSalary(22));

        manager_employee1.departmentPrint();
        System.out.println(manager_employee1.assignSalary(26));

        salesPerson_employee1.departmentPrint();
        salesPerson_employee1.soldUnit = 60;
        System.out.println(salesPerson_employee1.assignSalary(18));*/

        Defender defender_obj1 = new Defender();
        defender_obj1.defaultMethod();

        InterfaceDefender.staticMethod();

        Conflict conflict_obj1 = new Conflict();
        conflict_obj1.run();

        NestedInterface nestedInterface_obj = new NestedInterface();
        nestedInterface_obj.print2();
        nestedInterface_obj.print3();
        nestedInterface_obj.print4();
    }
}