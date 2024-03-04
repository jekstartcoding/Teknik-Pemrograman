public class Penjualan {
    //3 attribute yang sudah ditentukan, namun dirubah menjadi array agar bisa menampilkan semua barang yang akan dibeli nantinya
    private String nama_produk[];
    private double harga_total[];
    private int quantity[];

    //pemanggilan data type Produk yang sudah dibuat di class Produk
    private Produk[] produk;

    //id = index untuk attribute Produk. idx = index untuk attribute Penjualan
    public static byte id=0;
    public static byte idx=0;

    //constructor
    public Penjualan(){
        produk= new Produk[10];
        nama_produk= new String[10];
        harga_total = new double[10];
        quantity = new int[10];
    }

    //penambahan produk baru dengan memanggil constructor dari class Produk
    public void addNewProduct(String nama, double harga, int qty){
        produk[id]= new Produk(nama, harga, qty);
    }

    //method untuk memperlihatkan list semua produk beserta harga dan quantitasnya
    public void showProductList(){
        for(int j = 0;j<60;j++){System.out.print("=");}
        System.out.println("\nMenu Tersedia :");
        for (int i = 0; i <= id; i++){
            if(!isOutOfStock(i)){
                System.out.println("("+(i+1)+")"+produk[i].getNama_produk()+"\t["+produk[i].getQty()+"]"+"\tRp. "+produk[i].getHarga());
            }
        }
    }

    //method untuk memperlihatkan cart atau keranjang yang berisi barang barang yang akan dibeli yang sebelumnya sudah ditentukan
    public void showCartList(double hargaAkhir){
        for(int j = 0;j<60;j++){System.out.print("=");}
        System.out.println("\nBarang Yang Akan Dibeli :");
        for (int i = 0; i <= idx; i++){
            System.out.println("("+(i+1)+") "+nama_produk[i]+" sebanyak "+quantity[i]+" buah seharga Rp."+harga_total[i]);
        }
        System.out.println("total harga barang = Rp. "+hargaAkhir+"\n");
    }

    //method apabila sebuah produk habis stocknya
    public boolean isOutOfStock(int id){
        return produk[id].getQty()==0;
    }

    //method iterasi index id
    public static void nextId(){
        id++;
    }

    //method iterasi index idx
    public static void nextIdx(){
        idx++;
    }

    //method untuk melakukan pembelian produk. Melibatkan pengurangan stock dan lain sebagainya
    public double purchase(int choice, int quant){

        if(quant>produk[choice-1].getQty()){
            System.out.println("Stok Barang Tidak Mencukupi");
            return 0;
        }else{
            harga_total[idx]=produk[choice-1].getHarga()*quant;
            nama_produk[idx]=produk[choice-1].getNama_produk();
            quantity[idx]=quant;
            System.out.println("\nBarang yang akan dibeli = "+nama_produk[idx]+" Sebanyak "+quantity[idx]+" Buah");
            System.out.println("Total Pembayaran = Rp. "+produk[choice-1].getHarga()+" * "+quantity[idx]+" = "+harga_total[idx]+"\n");
            produk[choice-1].setQty((produk[choice-1].getQty()-quant));
            return harga_total[idx];
        }
        
    }

    //method untuk menampilkan pesan apabila pembelian sukses
    public void purchaseSuccess(double hargaAkhir){
        System.out.println("Pembelian dengan total harga Rp."+hargaAkhir+" sukses!");
    }
}
