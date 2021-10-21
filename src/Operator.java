public class Operator implements EmployeePosition{
    public String getJobTitle() {
        return "Оператор";
    }

    public int calcSalary(int baseSalary) {
        return baseSalary;
    }
}
