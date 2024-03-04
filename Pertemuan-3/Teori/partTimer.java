import java.util.Scanner;

//class concrete 2 dari class abstract Employee
public class partTimer extends Employee{
    int hourlySalary=20000;

    //constructor class partTimer
    public partTimer(String nama, String code){
        super(nama,code);
    }

    //method untuk mendapatkan monthly salary dengan memanggil method getter getmonthlySalary dari class Employee
    public double getMonthlySalary(int hour){
        setmonthlySalary(hourlySalary*hour);
        return getmonthlySalary();
    }

    //override dari method getSalary dari class Employee
    @Override
    public double getSalary(double absent){
        return getmonthlySalary()-(absent*2/100)*getmonthlySalary();
    }

    //method mendapatkan final salary dengan memanggil method processSalary dari class Employee
    public void processSalary(Scanner scanner) {
        boolean inputStatus = true;
        int hour;
        double finalSalary;

        while(inputStatus){
            System.out.print("Berapa jam employee ini bekerja bulan ini? (masukkan 1-120) = ");
            hour = scanner.nextInt();
            if (hour < 0 || hour > 120) {
                System.out.println("Input Tidak Valid");
            } else {
                finalSalary = this.getMonthlySalary(hour);  //pemanggilan method getMonthlySalary
                inputStatus = false;
            }
        }

        super.processSalary(scanner);
    }
}