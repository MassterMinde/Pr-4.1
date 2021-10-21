public class Employee {
    String firstName;
    String secondName;
    int baseSalary;
    EmployeePosition  position;
    public Employee(String firstName, String secondName, int baseSalary,int position,Company company) {
        if (position == 0)this.position = new Manager();
        if (position == 1)this.position = new Operator();
        if (position == 2)this.position = new TopManager(company);
        this.firstName = firstName;
        this.secondName = secondName;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", baseSalary=" + baseSalary +
                ", position=" + position.getJobTitle() +
                '}';
    }
}

