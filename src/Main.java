import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intScanner=new Scanner(System.in);
        Scanner strScanner=new Scanner(System.in);
        Company company=new Company(100000000);
        company.generateCandidates(1000);
        company.hire(180,"Оператор");
        company.hire(80,"Менеджер");
        company.hire(10,"Топ-менеджер");
//        for (int i = 0; i < company.employees.size(); i++) {
//            System.out.print((i+1)+". ");
//            System.out.println(company.employees.get(i));
//        }
        System.out.println("---------------------------------------------------------------------------------------------\n список из 15 самых высоких зарплат в компании\n---------------------------------------------------------------------------------------------\n");
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println("---------------------------------------------------------------------------------------------\n список из 30 самых низких зарплат в компании\n---------------------------------------------------------------------------------------------\n");
        System.out.println(company.getLowestSalaryStaff(30));
        System.out.println("---------------------------------------------------------------------------------------------\n список из 15 самых высоких зарплат в компании\n---------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < 135; i++) {
            company.fire(i);
        }
//        for (int i = 0; i < company.employees.size(); i++) {
//            System.out.print((i+1)+". ");
//            System.out.println(company.employees.get(i));
//        }
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println("---------------------------------------------------------------------------------------------\n список из 30 самых низких зарплат в компании\n---------------------------------------------------------------------------------------------\n");
        System.out.println(company.getLowestSalaryStaff(30));
    }
}
