public class TopManager extends Employee implements EmployeePosition {
    Company company;
    public TopManager(String firstName, String secondName, int baseSalary,Company company) {
        this.company=company;
        this.firstName = firstName;
        this.secondName = secondName;
        this.baseSalary = baseSalary;
        this.position = "Топ-менеджер";
    }
    public String getJobTitle() {
        return position;
    }

    public int calcSalary() {
        if (company.getIncome()>10000000)return (int)(baseSalary+baseSalary*1.5);
        return baseSalary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", baseSalary=" + baseSalary +
                ", position='" + position + '\'' +
                '}';
    }
}
