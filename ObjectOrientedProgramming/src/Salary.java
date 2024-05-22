public enum Salary {
    George(1000), Max(2000), John(3000);
    private int salary;
    Salary(int salary){
        this.salary = salary;
    }

    int displaySalary(){
        return salary;
    }
}
