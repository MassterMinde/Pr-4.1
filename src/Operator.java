public class Operator extends Employee implements EmployeePosition{
    public Operator(String firstName, String secondName, int baseSalary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.baseSalary = baseSalary;
        this.position = "Оператор";
    }
    public String getJobTitle() {
        return position;
    }

    public int calcSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", baseSalary=" + baseSalary +
                ", position='" + position + '\'' +
                '}';
    }
}
