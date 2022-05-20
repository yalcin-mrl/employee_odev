public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary <1000.0)
            return 0;
        else
            return this.salary*0.03;
    }
    double bonus() {
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        else {
            return 0;
        }
    }
    double raiseSalary(){
        if((2021 - this.hireYear)<10){
            return this.salary*0.5;
        }else if((2021 - this.hireYear)>9 && (2021 - this.hireYear)<20){
            return this.salary*0.10;
        }
        else{
            return this.salary*0.15;
        }
    }
    void toStringEmployee(){
        System.out.println("Vergi : "+ tax());
        System.out.println("Vergi : "+ bonus());
        System.out.println("Vergi : "+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş  : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam maaş : "+ (this.salary - tax() + bonus() + raiseSalary()));
    }
}
