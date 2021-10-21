public class TopManager implements EmployeePosition {
    Company company;
    public TopManager(Company company) {
        this.company=company;
    }
    public String getJobTitle() {
        return "Топ-менеджер";
    }

    public int calcSalary(int baseSalary) {
        if (company.getIncome()>10000000)return (int)(baseSalary+baseSalary*1.5);
        return baseSalary;
    }

}
