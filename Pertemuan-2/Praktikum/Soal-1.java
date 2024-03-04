import java.util.Scanner;

class Soal1{
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int i=0;
        boolean longStatus;
        
        //menentukan berapa kali inputnya
        System.out.println("Berapa kali anda mau melakukan input = ");
        int j = scanner.nextInt();

        //melakukan perulangan input dan pengecekan sebanyak yang sudah ditentukan sebelumnya
        while (i < j) {
            longStatus=false;
            System.out.println(" ");
            System.out.println("Silahkan input angka berapapun = ");
            String P = scanner.next();

            try{
                Long.parseLong(P);
                longStatus = true;
            } catch(Exception ignore){
                System.out.println("");
            }
            Long T;
            

            //menggunakan nested if untuk mengecek value, dari yang range nya paling besar hingga paling kecil
            if (longStatus==true) {
                T = Long.parseLong(P);
                if(T < Long.MAX_VALUE && T >Long.MIN_VALUE){
                    System.out.println(T+" can be fitted in : ");
                    System.out.println("- Long");
        
                    if(T>Integer.MIN_VALUE && T<Integer.MAX_VALUE ){
                        System.out.println("- Integer");
        
                        if (T > Short.MIN_VALUE && T < Short.MAX_VALUE) {
                            System.out.println("- Short");
        
                            if (T>Byte.MIN_VALUE && T<Byte.MAX_VALUE) {
                                System.out.println("- Byte");
                            }
                        }
                    }
                }
            }else{
                System.out.println("Can't be fitted anywhere");
            }
            i=i+1;
        }
        
    }
}