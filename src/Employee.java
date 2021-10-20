public class Employee implements EmployeePosition{
    public String getJobTitle(){
        return "none";
    }
    public int calcSalary(){
        return baseSalary;
    }
    String firstName;
    String secondName;
    int baseSalary;
    String  position;
}

