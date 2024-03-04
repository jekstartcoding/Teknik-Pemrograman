public class Restaurant {
    private Product[] product;  //perubahan #1 = 3 field berupa nama_makanan, harga_makanan dan stok dijadikan 1 class
    public static byte id=0;

    public Restaurant(){
        /*perubahan #2 = dari yang awalnya instansiasi per field, tapi karena sudah 
        diubah ke record menjadi instansiasi record tersebut*/
        product=new Product[10];     
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        /*perubahan #3 = isi / behaviour sebelumnya sama dengan isi dari constructor di class 
        Product, sehingga method ini behaviornya diubah menjadi pemanggilan constructor Product*/
        product[id]= new Product(nama, harga, stok);
    }

    /*Perubahan #4 = perbedaan pemanggilan field dalam system out, karena pada awalnya attributes tidak
    dilakukan enkapsulasi, dan pada case sekarang, setiap attributes dijadikan private sehingga perlu 
    dibuat getter*/
    public void tampilMenuMakanan(){
        for(int j = 0;j<60;j++){System.out.print("=");}
        System.out.println("\nMenu Tersedia :");
        for (int i = 0; i <= id; i++){
            if(!isOutOfStock(i)){
                System.out.println("("+(i+1)+")"+product[i].getNama_makanan()+"\t["+product[i].getStok()+"]"+"\tRp. "+product[i].getHarga_makanan());
            }
        }
    }

    /*Perubahan #5 = return yang asalnya tidak menggunakan getter menjadi menggunakan getter (karena 
    sudah dienkapsulasi)*/
    public boolean isOutOfStock(int id){
        return product[id].getStok()==0;
    }

    public static void nextId(){
        id++;
    }

    //method baru untuk proses pembelian barang yang melibatkan pengurangan stock dll
    public double purchase(int choice, int quant){
        //deklarasi variable lokal;
        double totalHarga;

        if(quant>product[choice-1].getStok()){
            System.out.println("Stok Barang Tidak Mencukupi");
            return 0;
        }else{
            totalHarga=product[choice-1].getHarga_makanan()*quant;
            System.out.println("Barang yang akan dibeli = "+product[choice-1].getNama_makanan()+" Sebanyak "+quant+" Buah");
            System.out.println("Total Pembayaran = Rp. "+totalHarga);
            product[choice-1].setStok((product[choice-1].getStok()-quant));
            return totalHarga;
        }
        
    }

    public double purchaseSuccess(double hargaAkhir){
        System.out.println("Pembelian dengan total harga "+hargaAkhir+" sukses!");
        hargaAkhir=0;
        return hargaAkhir;
    }
}
