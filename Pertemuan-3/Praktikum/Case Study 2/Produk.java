//class product yang memiliki 3 buah attribute
public class Produk {
    private String nama_produk;
    private double harga;
    private int qty;

    //constructor class Produk
    public Produk(String nama, double hargaP, int quant){
        this.nama_produk=nama;
        this.harga=hargaP;
        this.qty=quant;
    }

    //method setter untuk qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    //method getter untuk nama_produk
    public String getNama_produk() {
        return nama_produk;
    }

    //method getter untuk harga
    public double getHarga() {
        return harga;
    }

    //method getter untuk qty
    public int getQty() {
        return qty;
    }

   

    
}
