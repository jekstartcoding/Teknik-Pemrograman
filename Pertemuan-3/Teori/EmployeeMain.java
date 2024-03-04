import java.util.Scanner;

class employeeMain{
    public static void main(String[] args) {
        //deklarasi scanner
        Scanner scanner = new Scanner(System.in);
        
        //deklarasi variable lokal
        String code;
        boolean scanStatus = true;

        //instansiasi dari class concrete fullTimer dan class concrete partTimer 
        fullTimer full1 = new fullTimer("Zaky", "101");
        fullTimer full2 = new fullTimer("Fanza", "102");
        partTimer part1 = new partTimer("Fajri", "201");
        partTimer part2 = new partTimer("Rio", "202");

        //pemanggilan method dispInfo dari class Employee
        full1.dispInfo();
        full2.dispInfo();
        part1.dispInfo();
        part2.dispInfo();
        
        //while status untuk memeriksa apakah input valid atau tidak
        while (scanStatus==true){
            System.out.print("Silahkan pilih sesuai angka, siapa yang akan anda pilih untuk rekap? tulis codenya = ");
            code=scanner.next();
            if (code.equals("101")) {
                full1.processSalary(scanner);           //pemanggilan method processSalary
                scanStatus = false;
            } else if(code.equals("102")){
                full2.processSalary(scanner);           //pemanggilan method processSalary
                scanStatus = false;
            } else if(code.equals("201")){
                part1.processSalary(scanner);           //pemanggilan method processSalary
                scanStatus = false;
            } else if(code.equals("202")){
                part2.processSalary(scanner);           //pemanggilan method processSalary
                scanStatus = false;
            } else {
                System.out.println("Input Tidak Valid!");
            }
        }
        
    }
}