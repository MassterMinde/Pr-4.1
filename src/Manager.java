public class Manager extends Employee implements EmployeePosition{
    int gen;
     public Manager(String firstName, String secondName, int baseSalary) {
         this.firstName = firstName;
         this.secondName = secondName;
         this.baseSalary = baseSalary;
         this.position = "Менеджер";
         this.gen=115000+(int)(Math.random()*25000);
    }

    public String getJobTitle() {
        return position;
    }

    public int calcSalary() {
        return (int)(baseSalary+0.05*gen-0.05*gen);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", baseSalary=" + baseSalary +
                ", position='" + position + '\'' +
                '}';
    }
}
