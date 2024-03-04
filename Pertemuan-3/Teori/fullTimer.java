//class concrete 1 dari class abstract Employee
public class fullTimer extends Employee{
    
    //constructor class fulltimer 
    public fullTimer(String nama, String code){
        super(nama, code);
        setmonthlySalary(300000);
    }

    //method yang di override dari method getSalary di class Employee
    @Override
    public double getSalary(double absent){
        return (getmonthlySalary()-(absent*2/100)*getmonthlySalary());
    }
}
