import java.math.BigInteger;
import java.util.Scanner;

class soal6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S1=scanner.nextLine();
        String S2=scanner.nextLine();
        BigInteger A = new BigInteger(S1);
        BigInteger B = new BigInteger(S2);
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
