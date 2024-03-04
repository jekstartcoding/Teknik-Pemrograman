//class dibawah ini adalah class untuk interaksi

import java.util.Scanner;

class onlineShoppingMain{
    public static void main(String[] args) {
        //deklarasi scanner untuk input
        Scanner scanner = new Scanner(System.in);
        customer c = new customer();
        
        //deklarasi variable dibawah untuk keperluan main
        boolean valid = false;
        boolean end = false;
        int opsi;
        int opsiBeli;
        int opsiSaldo;
        boolean buying = true;
        boolean shipping = true;
        int opsiShipping;
        boolean cekSaldo = true;
        boolean sizeStatus = true;
        int opsiSize;

        //deklarasi variable dibawah untuk menampung informasi pengguna
        String name;
        String address;
        int saldo = 0;

        //action dibawah sebagai "welcoming" text dari aplikasi
        for(int i=1;i<100;i++){System.out.print("=");}  //sebagai pemisah
        System.out.println("\nSelamat datang di toko online BeliBadjoe! toko kami menyediakan berbagai kebutuhan fashion mulai dari\nKaos, Kemeja, Celana, dan masih banyak lagi!");
        System.out.println("\nKarena anda adalah pelanggan baru, silahkan untuk memasukkan data diri terlebih dahulu!");
        
        //action dibawah untuk mendapatkan informasi data pelanggan untuk pengiriman
        System.out.print("\nNama = ");
        name = scanner.nextLine();
        System.out.print("\nAlamat = ");
        address = scanner.nextLine();

        
        System.out.println("Data anda sudah kami terima, kemudian silahkan untuk mengisi balance anda terlebih dahulu untuk proses pembelian produk!\n");

        //action dibawah untuk mendapatkan saldo pengguna
        while(valid == false){
            System.out.print("\nSilahkan memasukkan saldo anda minimal Rp. 120.000 dan maksimal Rp. 1.000.000! (tanpa menggunakan titik pemisah)\nSaldo = ");
            saldo = scanner.nextInt();
            if(saldo > 1000000 || saldo < 120000){
                System.out.println("Nominal yang anda masukkan tidak valid");
            }else{
                valid = true;
            }
        }

        //set atribut c dari hasil input sebelumnya
        c.setInfo(name, address, saldo);
        System.out.println("\n\nData pengguna sudah lengkap, kini anda dapat berbelanja di toko kami!");

        //proses berbelanja
        while(end == false){    //menggunakan while agar dapat berulang
            buying=true;

            System.out.println("\n\n");
            for(int i=1;i<100;i++){System.out.print("=");}
            System.out.println("\nHalo! selamat datang di toko kami! silahkan ketik angka sesuai petunjuk dibawah untuk melakukan aktivitas!");
            System.out.println("(1) Belanja");
            System.out.println("(2) Cek/isi Saldo");
            System.out.println("(3) Keluar");
            System.out.print("\nOpsi yang dipilih = ");
            opsi = scanner.nextInt();

            //algoritma apabila opsi belanja dipilih
            if (opsi==1) {
                while(buying==true){
                    //ini adalah algoritma pada saat pemilihan barang
                    System.out.println("Silahkan pilih produk kami yang tersedia dibawah ini!");
                    System.out.println("(1) Kaos Oversize BeliBadjoe Rp. 120.000");
                    System.out.println("(2) Kemeja Lengan Panjang BeliBadjoe Rp. 150.000");
                    System.out.println("(3) Celana Cargo BeliBadjoe Rp. 200.000");
                    System.out.println("(4) Jaket Varsity BeliBadjoe Rp. 250.000");
                    System.out.println("(5) Kembali ke menu\n");
                    
                    c.dispSaldo();          //pemanggilan method dispSaldo
                    System.out.print("Pilihan anda = ");
                    opsiBeli=scanner.nextInt();
                    System.out.println("\n\n");
                    buying=c.purchase(opsiBeli);        //pemanggilan method purchase

                    //while dibawah ini adalah while untuk pemilihan size produk
                    while (sizeStatus==true) {
                        System.out.println("Silahkan pilih juga size anda dengan memasukan input sesuai angka!");
                        System.out.println("(1) XS");
                        System.out.println("(2) S");
                        System.out.println("(3) M");
                        System.out.println("(4) L");
                        System.out.println("(5) XL");

                        System.out.print("\nOpsi yang anda pilih = ");
                        opsiSize=scanner.nextInt();
                        System.out.println("");
                        sizeStatus = c.setProductSize(opsiSize);    //pemanggilan method setProductSize
                    }

                    //while dibawah ini adalah while untuk pemilihan shipping/pengiriman
                    while(buying!=true&&shipping==true){
                        System.out.println("Silahkan pilih jenis pengiriman yang tersedia dibawah ini!");
                        System.out.println("(1) Reguler (Gratis Ongkir!), Estimasi pengiriman paket selama 7 hari");
                        System.out.println("(2) SiCepat Rp. 10.000, Estimasi pengiriman paket sekitar 3 hari");
                        System.out.println("(3) SiExpress Rp. 15.000, Estimasi pengiriman paket selama 2 hari");
                        System.out.println("(4) SiKilat Rp. 20.000, Estimasi pengiriman paket dalam 1 hari\n");
                    
                        System.out.println("\n\n");
                        c.dispSaldo();              //pemanggilan method dispSaldo
                        c.dispPembayaran();         //pemanggilan method dispPembayaran
                        System.out.print("Pilihan anda = ");
                        opsiShipping=scanner.nextInt();
                        System.out.println("\n\n");
                        shipping=c.shipment(opsiShipping);  //pemanggilan method shipment
                    }
                    c.purchaseSuccess();        //pemanggilan method purchaseSuccess
                }

            //apabila opsi cek saldo dipilih
            }else if(opsi==2){
                while(cekSaldo==true){
                    
                    System.out.println("\n(1) Cek Saldo");
                    System.out.println("(2) Isi Saldo");
                    System.out.println("(3) Kembali ke menu utama\n");
                    System.out.println("Silahkan Masukkan input sesuai dengan angka = ");
                    opsiSaldo=scanner.nextInt();

                    if(opsiSaldo==1){
                        c.dispSaldo();      //pemanggilan method getter dispSaldo untuk menampilkan saldo
                    }else if(opsiSaldo==2){

                        System.out.println("Silahkan masukkan nominal untuk pengisian saldo minimal Rp.100.000 hingga maximal Rp.1.000.000 = ");
                        saldo=scanner.nextInt();
                        c.IsiSaldo(saldo);          //pemanggilan method isiSaldo untuk menambah saldo
                        System.out.println("Pengisian Saldo berhasil!");
                        
                        c.dispSaldo();              //pemanggilan method dispSaldo
                    }else if(opsiSaldo==3){
                        cekSaldo=false;
                    }else{
                        System.out.println("Input yang anda masukkan tidak valid!");
                    }
                }
                

            //apabila opsi keluar dipilih
            }else if(opsi==3){
                System.out.println("\n\nTerima kasih sudah berbelanja di toko kami!");
                for(int i=1;i<100;i++){System.out.print("=");}
                end=true;   //agar while berhenti
                
            }else{  //apabila input tidak valid (diluar 1-3)
                System.out.println("Opsi yang anda pilih tidak valid!");
            }
        }
    }
}