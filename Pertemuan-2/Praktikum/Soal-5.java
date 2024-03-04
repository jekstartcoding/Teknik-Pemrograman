import java.util.Scanner;

class soal5{
    String capitalizeFirst(String S){
        char[] charArray = S.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        S = new String (charArray);
        return S;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soal5 myObject = new soal5(); 

        System.out.println("Silahkan masukkan string 1 = ");
        String string1 = scanner.nextLine();
        System.out.println("Silahkan masukkan string 2 = ");
        String string2 = scanner.nextLine();   

        int stringLength = string1.length() + string2.length();
        char s1 = string1.charAt(0);
        char s2 = string2.charAt(0);
        System.out.println(stringLength);
        
        if(s1>s2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        string1 = myObject.capitalizeFirst(string1);
        string2 = myObject.capitalizeFirst(string2);
        System.out.println(string1+" "+string2);
    }
}