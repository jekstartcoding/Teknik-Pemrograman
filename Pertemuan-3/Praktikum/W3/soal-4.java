import java.util.Scanner;

class agent {
    float gaji=500000;
    float hargaBarang=50000;
    float gajiFinal;

    void setGajiFinal(float Salary){
        gajiFinal=Salary;
    }

    void dispGajiFinal(){
        System.out.println(gajiFinal);
    }

    float gajiPegawai(int barang){
        if(barang < 15){
            return (float) gaji-(15*(15-barang)*hargaBarang/100);
        }else if(barang > 40&&barang < 80){
            return (float) gaji+(25*barang*hargaBarang/100);
        }else if(barang > 80){
            return (float) gaji+(35*barang*hargaBarang/100);
        }else{
            return (float) gaji+(10*barang*hargaBarang/100);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        agent A = new agent();
        int item;
        float gaji;

        System.out.println("Berapa barang yang anda jual bulan ini? = ");
        item = scanner.nextInt();
        gaji=A.gajiPegawai(item);
        A.setGajiFinal(gaji);
        A.dispGajiFinal();


    }
}
