import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;
        double salary;
        int workHours;
        int hireYear;
        Scanner sc = new Scanner(System.in);
        System.out.print("Adı : ");
        name = sc.next();
        System.out.print("Maaşı : ");
        salary = sc.nextDouble();
        System.out.print("Çalışma saati : ");
        workHours = sc.nextInt();
        System.out.print("Başlangıç yılı : ");
        hireYear = sc.nextInt();
        Employee emp = new Employee(name,salary,workHours,hireYear);
        emp.toStringEmployee();
    }
}
