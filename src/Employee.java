import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double employeeTax = 0;
        if (salary >= 1000)
            employeeTax = salary * 0.03;
        return employeeTax;
    }

    public int bonus() {
        int employeeBonus = 0;
        if (workHours > 40)
            employeeBonus = (workHours - 40) * 30;
        return employeeBonus;
    }

    public double raiseSalary() {
        int workTime = 2021 - hireYear;
        double totalSalary = (salary - tax()) + bonus();
        double newSalary = 0;
        if (workTime < 10)
            newSalary = totalSalary * 1.05;
        else if (workTime > 9 && workTime < 20)
            newSalary = totalSalary * 1.10;
        else if (workTime > 19) {
            newSalary = totalSalary * 1.15;
        }
        return newSalary - salary;
    }

    public String toString() {
        System.out.println("Adı : " + name
                + "\nMaaşı : " + salary
                + "\nÇalışma Saati : " + workHours
                + "\nBaşlangıç Yılı : " + hireYear
                + "\nVergi : " + tax()
                + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary()
                + "\nVergi ve Bonuslarla Birlikte Maaş : " + (salary + bonus() + tax())
                + "\nToplam Maaş : " + (salary + bonus() + tax() + raiseSalary()));
        return "Adı : " + name
                + "\nMaaşı : " + salary
                + "\nÇalışma Saati : " + workHours
                + "\nBaşlangıç Yılı : " + hireYear
                + "\nVergi : " + tax()
                + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary()
                + "\nVergi ve Bonuslarla Birlikte Maaş : " + (salary + bonus() + tax())
                + "\nToplam Maaş : " + (salary + bonus() + tax() + raiseSalary());
    }
}
