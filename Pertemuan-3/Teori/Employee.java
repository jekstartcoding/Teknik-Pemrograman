import java.util.Scanner;

//class abstract sebagai superclass
public abstract class Employee{
    private String name;                    //penampung nama pekerja
    private String kode;                    //penampung kode pekerja
    private int monthlySalary;              //penampung gaji bulanan pekerja
    private int absentDays;                 //penampung jumlah absent pekerja

    //constructor class employee
    public Employee(String nama, String code){
        this.name=nama;
        this.kode=code;
    }

    //method untuk menampilkan nama dan kode
    public void dispInfo(){
        System.out.println("Nama = "+name+" Kode = "+kode);
    }

    //method setter untuk monthlySalary
    public void setmonthlySalary(int salary){
        this.monthlySalary=salary;
    }

    //method getter 
    public int getmonthlySalary(){
        return monthlySalary;
    }

    //method abstract untuk mendapatkan gaji final setelah dikurangi absent yang akan diimplemen di concrete class
    public abstract double getSalary(double absent);

    //method proses mendapatkan gaji final
    public void processSalary(Scanner scanner) {
        boolean inputStatus = true;
        double absent;
        double finalSalary;

        while(inputStatus){
            System.out.print("Berapa hari employee ini absent bulan ini? (masukkan 0-30) = ");
            absent = scanner.nextDouble();
            if (absent < 0 || absent > 30) {
                System.out.println("Input Tidak Valid");
            } else {
                finalSalary = this.getSalary(absent);
                System.out.print("Gaji pegawai ini di bulan ini adalah Rp. ");
                System.out.println(finalSalary);
                inputStatus = false;
            }
        }
    }
}