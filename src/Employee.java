public class Employee {
    String nameSurname;
    double salary;
    int workHour;
    int hireYear;

    Employee(String nameSurname, double salary, int workHour, int hireYear){
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double sa = this.salary;
        if(salary > 1000)
        {
            this.salary*=0.97;
        }
        return sa-this.salary;
    }
    public double bonus(int workHour){
        double wh = this.salary;
        if (workHour >40){
            this.salary+=(workHour-40)*30;
        }
        return this.salary - wh;
    }

    public double raiseSalary(int hireYear){
        double sa = this.salary;
        if(hireYear-2021 < 10)
        {
            this.salary*=1.05;
        }
        else if(hireYear-2021 < 20 ){
            this.salary*=1.1;
        }
        else {
            this.salary*=1.15;
        }
        return this.salary-sa;
    }

    public void toStr()
    {
        System.out.println("Name: " + this.nameSurname);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hour:"+ this.workHour);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax(this.salary));
        System.out.println("Bonus: " + bonus(this.workHour));
        System.out.println("Salary Raise: " + raiseSalary(this.hireYear));
        System.out.println("Total Salary: " + this.salary);
    }
}
