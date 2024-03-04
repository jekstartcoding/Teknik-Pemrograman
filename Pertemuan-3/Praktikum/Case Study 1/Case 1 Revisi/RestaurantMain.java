import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        //deklarasi variable lokal
        int pilihan;
        int quantity;
        String condition;
        boolean status=true;
        double finalPrice=0;

        //pembuatan menu secara manual menggunakan method tambahMenuMakanan
        menu.tambahMenuMakanan("Bala-bala", 1000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu      ", 1000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu      ", 1000, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen     ", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Pisang Aroma", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Sate Taichan", 2500, 15);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Bakso Sedang", 3000, 25);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Cilok Isi", 500, 50);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Air Putih", 2000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Es Teh   ", 4000, 10);
        
        //proses pembelian dengan menggunakan looping agar dapat membeli produk lain
        while (status == true) {
            
            menu.tampilMenuMakanan();
            System.out.print("\nSilahkan masukkan makanan pilihan anda sesuai angka yang tertera = ");
            pilihan = scanner.nextInt();
            System.out.print("Silahkan masukkan jumlah dari barang yang dipilih = ");
            quantity = scanner.nextInt();

            finalPrice=finalPrice+menu.purchase(pilihan, quantity);
            System.out.print("Apakah ingin membeli produk lain? (y/n) ");
            
            condition = scanner.next();

            if(condition.equals("y")){
                status=true;
            }else if(condition.equals("n")){
                status=false;
            }else{
                System.out.println("Input Tidak Valid");
            }
            System.out.println("\n");
        }
        if(finalPrice>0){
            finalPrice=menu.purchaseSuccess(finalPrice);
        }
        System.out.println("Berikut ini stok barang saat ini = ");
        menu.tampilMenuMakanan();
    }
}
