public class Manager implements EmployeePosition{
    int gen;
     public Manager() {
         this.gen=115000+(int)(Math.random()*25000);
    }

    public String getJobTitle() {
        return "Менеджер";
    }

    public int calcSalary(int baseSalary) {
        return (int)(baseSalary+0.05*gen);
    }
}
