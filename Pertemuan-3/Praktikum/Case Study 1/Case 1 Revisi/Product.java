//perubahan #1 = 3 field dijadikan 1 class dan dijadikan private field (enkapsulasi)
public class Product {  
    private String nama_makanan;
    private double harga_makanan;
    private int stok;

        /*perubahan #3 = Class Product memiliki constructor dengan behavior mirip seperti behavior tambahMenuMakanan 
     pada code sebelumnya, sehingga pada method tambahMenuMakanan hanya perlu memanggil constructor Class Product*/
    public Product(String nama, double harga, int stock){
        this.nama_makanan=nama;
        this.harga_makanan=harga;
        this.stok = stock;
    }

    //berikut ini method setter untuk stok (karena hanya stok yang perlu menggunakan setter)
    public void setStok(int stok) {
        this.stok = stok;
    }

    //berikut ini ketiga method getter untuk class Product
    public String getNama_makanan() {
        return nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public int getStok() {
        return stok;
    }
}
