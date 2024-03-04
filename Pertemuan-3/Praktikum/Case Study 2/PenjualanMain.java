import java.util.Scanner;

public class PenjualanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan selling = new Penjualan();    //instansiasi objek dari class Penjualan

        //deklarasi variable lokal
        int pilihan;
        int quantity;
        String condition;
        boolean status=true;
        boolean buystatus = true;
        double finalPrice=0;

        //pembuatan atau penambahan 10 produk 
        selling.addNewProduct("Bakwan", 2500, 30);
        Penjualan.nextId();
        selling.addNewProduct("Bakwan Udang", 4000, 20);
        Penjualan.nextId();
        selling.addNewProduct("Tahu Goreng", 2000, 25);
        Penjualan.nextId();
        selling.addNewProduct("Tempe Goreng", 2000, 30);
        Penjualan.nextId();
        selling.addNewProduct("Perkedel", 3000, 30);
        Penjualan.nextId();
        selling.addNewProduct("Sate Kulit", 2000, 40);
        Penjualan.nextId();
        selling.addNewProduct("Sate Usus", 1500, 40);
        Penjualan.nextId();
        selling.addNewProduct("Bakso Urat", 4000, 25);
        Penjualan.nextId();
        selling.addNewProduct("Air Putih", 5000, 20);
        Penjualan.nextId();
        selling.addNewProduct("Es Teh", 6000, 20);



        //proses pembelian dengan menggunakan looping agar dapat membeli produk lain
        while (status == true) {
            buystatus=true;

            selling.showProductList();
            System.out.print("\nSilahkan masukkan makanan pilihan anda sesuai angka yang tertera = ");
            pilihan = scanner.nextInt();
            if(pilihan<1||pilihan>10){
                System.out.println("Produk pilihanmu tidak tersedia.");
            }else{
                System.out.print("Silahkan masukkan jumlah dari barang yang dipilih = ");
                quantity = scanner.nextInt();

                finalPrice=finalPrice+selling.purchase(pilihan, quantity);
            }
        
            //while sebagai konfirmasi apabila ingin memesan makanan/minuman lain
            while(buystatus==true){
                System.out.print("Apakah ingin membeli produk lain? (y/n) ");
                condition = scanner.next();
                if(condition.equals("y")){
                    status=true;
                    selling.nextIdx();
                    buystatus=false;
                }else if(condition.equals("n")){
                    status=false;
                    buystatus=false;
                }else{
                    System.out.println("Input Tidak Valid");
                }
                System.out.println("\n");
            }
        }

        if(finalPrice>0){
            selling.showCartList(finalPrice);
            selling.purchaseSuccess(finalPrice);
        }else{
            System.out.println("Silahkan Berkunjung Lain Kali!");
        }
    }
}
