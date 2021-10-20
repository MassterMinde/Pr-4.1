import java.util.ArrayList;
public class Company extends  ArrayList {
    int income;
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Employee> genEmployees = new ArrayList<>();

    public Company(int income) {
        this.income = income;
    }

    void hire(int position) {
        if(position<genEmployees.size())return;
        employees.add(genEmployees.get(position - 1));
        genEmployees.remove(position-1);
        for (int j = 0; j < genEmployees.size(); j++) {
            System.out.println(j + 1 + ") " + genEmployees.get(j));
        }
    }

    void hire(int number,String type){
        int count=0;
            for (int i = 0; i < genEmployees.size()&&count<number; i++) {
                if (type.equals(genEmployees.get(i).getJobTitle())){
                    employees.add(genEmployees.get(i));
                    genEmployees.remove(i);
                    count++;
                }
            }
    }
    void hireAll() {
        employees.addAll(genEmployees);

    }

    void fire(int position) {
        employees.remove(position);
    }

    public int getIncome() {
        return income;
    }

    public void generateCandidates(int num) {
        genEmployees.clear();
        String[] FirstNames = {"Алексей", "Иван", "Макар", "Тарас", "Александр", "Сергей", "Виталий" ,"Кирилл" ,"Леонид"};
        String[] SecondNames = {"Навальный", "Утин", "Говнецкий", "Коренной", "Аникин", "Петросян" , "Суворов" ,"Самойлов" ,"Новиков"};
        for (int i = 0; i < num; i++) {
            int firNam = (int) (Math.random() * 8);
            String firstName = FirstNames[(firNam)];
            int secNam = (int) (Math.random() * 8);
            String secondName = SecondNames[(secNam)];
            int position = (int) (Math.random() * 3);
            int baseSalary = 50000 + (int) (Math.random() * 50000);
            if (position == 0) genEmployees.add(i, new Manager(firstName, secondName, baseSalary));
            if (position == 1) genEmployees.add(i, new Operator(firstName, secondName, baseSalary));
            if (position == 2) genEmployees.add(i, new TopManager(firstName, secondName, baseSalary,this));
        }
        for (int j = 0; j < genEmployees.size(); j++) {
            System.out.println(j + 1 + ") " + genEmployees.get(j));
        }
    }


    String getTopSalaryStaff(int count) {
        String top="";
        for (int i = 1; i < employees.size(); i++) {
            int j = i;
            while (j > 0 && employees.get(j - 1).calcSalary() < employees.get(j).calcSalary()) {
                employees.add(j+1,employees.get(j-1));
                employees.remove(j-1);
                j--;
            }
        }
        for (int i = 0; i < employees.size()&&i<count; i++) {
            top+=((i+1))+". ";
            top+=(employees.get(i).calcSalary())+" руб.\n";
        }
        return top;
    }

    String getLowestSalaryStaff(int count) {
        String min="";
        for (int i = 1; i < employees.size(); i++) {
            int j = i;
            while (j > 0 && employees.get(j - 1).calcSalary() > employees.get(j).calcSalary()) {
                employees.add(j+1,employees.get(j-1));
                employees.remove(j-1);
                j--;
            }
        }
        for (int f = 0; f < employees.size()&&f<count; f++) {
            min+=((f+1))+". ";
            min+=(employees.get(f).calcSalary())+" руб.\n";
        }
        return min;
    }
}

