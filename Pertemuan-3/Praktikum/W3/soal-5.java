import java.util.Scanner;

class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarasi variable lokal
        int A;
        int B;
        int C;
        int D;

        System.out.print("Nilai A = ");
        A = scanner.nextInt();
        System.out.print("Nilai B = ");
        B = scanner.nextInt();
        System.out.print("Nilai C = ");
        C = scanner.nextInt();
        System.out.print("Nilai D = ");
        D = scanner.nextInt();

        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        String strC = Integer.toString(C);
        String strD = Integer.toString(D);

        String strTotal = strA+strB+strC+strD;
        Long Total = Long.parseLong(strTotal);
        System.out.println(Total);

        if((Total-999999)%5==0){
            System.out.println("Berhenti");
        }else{
            System.out.println("Jalan");
        }
    }
}
