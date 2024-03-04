class Employee extends Sortable{
    //attributes Employee
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    //constructor
    public Employee (String n, double s, int day, int month, int year){
        name=n;
        salary=s;
        hireday=day;
        hiremonth=month;
        hireyear=year;
    }

    //getter attribute hireyear
    public int hireYear(){
        return hireyear;
    }

    //method print
    public void print(){
        System.out.println(name+" "+salary+" "+hireYear());
    }

    //method raiseSalary
    public void raiseSalary(double byPercent){
        salary *= 1 + byPercent/100;
    }

    //override method compare
    @Override
    public int compare(Sortable b){
        Employee eb = (Employee) b;
        if (salary<eb.salary) return -1;
        if (salary>eb.salary) return +1;
        return 0;
    }       
}