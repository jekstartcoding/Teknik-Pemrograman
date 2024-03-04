class customer{
    //deklarasi atribut/variable costumer disertai dengan "private" dalam rangka enkapsulasi
    private String Nama;                //sebagai penampung nama customer
    private String Alamat;              //sebagai penampung alamat customer
    private Integer Saldo;              //sebagai penampung jumlah saldo customer
    private Integer Pembayaran;         //sebagai penampung jumlah yang harus dibayarkan customer
    private String Product;             //sebagai penampung produk apa yang akan dibeli customer
    private String ProductSize;         //sebagai penampung size produk
    
    //method dibawah ini merupakan salah satu implementasi dari "setter" untuk melakukan set kepada attribute dari customer
    void setInfo(String nama, String alamat, int saldo){
        Nama = nama;
        Alamat = alamat;
        Saldo = saldo;
    }

    //method dibawah ini merupakan method untuk menambah attribute saldo berdasarkan parameter yang diberikan
    void IsiSaldo(int saldo){
        Saldo = Saldo+saldo;
    }

    //method dibawah ini merupakan method untuk menentukan attribute productSize berdasarkan opsi yang dipilih
    boolean setProductSize(int size){
        boolean status=true;
        
        if(size==1){
            ProductSize="XS";
            status=false;
        }else if(size==2){
            ProductSize="S";
            status=false;
        }else if(size==3){
            ProductSize="M";
            status=false;
        }else if(size==4){
            ProductSize="L";
            status=false;
        }else if(size==5){
            ProductSize="XL";
            status=false;
        }else{
            System.out.println("Input yang anda masukkan tidak valid!");
        }

        return status;
    }

    //method dibawah ini merupakan salah satu implementasi dari "getter" untuk menampilkan jumlah saldo
    void dispSaldo(){
        System.out.println("Saldo anda saat ini adalah = Rp."+Saldo+".");
    }

    //method dibawah ini merupakan salah satu implementasi dari "getter" untuk menampilkan jumlah Pembayaran
    void dispPembayaran(){
        System.out.println("Jumlah yang harus anda bayar adalah "+Pembayaran+".");
    }

    //method dibawah ini adalah sebuah method untuk algoritma pembelian dalam olshop yang melibatkan pengurangan saldo dan lain sebagainya
    boolean purchase(int option){
        //variable lokal untuk produk
        boolean status=true;
        Product="";

        //algoritma pembelian yang melibatkan Penambahan Pembayaran
        if(option==1){
            Pembayaran = 120000;
            Product="Baju Oversize";
        }else if(option==2){
            Pembayaran = 150000;
            Product="Kemeja Lengan Panjang";
        }else if(option==3){
            Pembayaran = 200000;
            Product = "Celana Cargo";
        }else if(option==4){
            Pembayaran = 250000;
            Product="Jaket Varsity";
        }else if(option==5) {
            status = false;          //agar keluar dari while pembelian 
        }else{
            System.out.println("input yang anda masukkan tidak valid!");    //input diluar 1-5
        }

        if(Saldo<Pembayaran){    //kondisi apabila jika saldo kurang dari jumlah pembayaran 
            System.out.println("Nominal anda tidak mencukupi!");
            Product="";
            Pembayaran=0;
        }else if(Product!="" && status==true){
            status=false;
        }

        return status;
    }

    //method dibawah ini adalah sebuah method yang digunakan untuk menentukan jenis express/pengiriman berdasarkan opsi
    boolean shipment(int option){
        //variable lokal untuk produk
        boolean status=true;
        String express = "";
        String duration = "";

        //algoritma pembelian yang melibatkan penambahan Pembayaran
        if(option==1){
            express="Reguler (free ongkir)"; 
            duration="7 hari";
        }else if(option==2){
            Pembayaran = Pembayaran+10000;
            express="SiCepat"; 
            duration="3 hari";
        }else if(option==3){
            Pembayaran = Pembayaran+15000;
            express="SiExpress";
            duration="2 hari";
        }else if(option==4){
            Pembayaran = Pembayaran+20000;
            express = "SiKilat";
            duration="1 hari";
        }else if(option==5) {
            status = false;          //agar keluar dari while pengiriman
        }else{
            System.out.println("input yang anda masukkan tidak valid!");    //input diluar 1-5
        }

        if(Saldo<Pembayaran){    //kondisi apabila jika saldo negatif setelah dikurangi (maka saldo akan dikembalikan lagi seperti semula dam diberikan suatu pesan)
            System.out.println("Nominal anda tidak mencukupi!");
            if(option==2){
                Pembayaran = Pembayaran + 10000;
            }else if(option==3){
                Pembayaran = Pembayaran + 15000;
            }else if(option==4){
                Pembayaran = Pembayaran + 20000;
            }

        }else if(express!="" && status==true){
            System.out.println("produk berupa "+Product+ " dengan size "+ProductSize+" dari toko BeliBadjoe akan dikirim ke penerima "+Nama+", yang beralamat di \n"+Alamat+" dalam "+duration+" melalui pengiriman "+express+".");
            status=false;
        }

        return status;
    }

    //method dibawah ini merupakan method apabila pembelian barang sukses, melibatkan pengurangan attribute Saldo dan reset attribute Pembayaran
    void purchaseSuccess(){
        System.out.println("Terima kasih atas pembelian produk kami!");
        Saldo=Saldo-Pembayaran;
        Pembayaran=0;
    }
}
