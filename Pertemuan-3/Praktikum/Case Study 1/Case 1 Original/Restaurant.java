public class Restaurant{
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id=0;

    public Restaurant(){
        nama_makanan=new String[10];
        harga_makanan=new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for (int i = 0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println("("+(i+1)+") "+nama_makanan[i]+"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(stok[id]==0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }

    //method baru untuk pembelian
    public double purchase(int choice, int quant){
        //deklarasi variable lokal;
        double totalHarga;

        if(quant>stok[choice -1]){
            System.out.println("Stok Barang Tidak Mencukupi");
            return 0;
        }else{
            totalHarga=harga_makanan[choice-1]*quant;
            System.out.println("Barang yang akan dibeli = "+nama_makanan[choice-1]+" Sebanyak "+quant+" Buah");
            System.out.println("Total Pembayaran = Rp. "+totalHarga);
            stok[choice-1] = stok[choice-1]-quant;
            return totalHarga;
        }
    }

    //method baru apabila pembelian berhasil
    public double purchaseSuccess(double hargaAkhir){
        System.out.println("Pembelian dengan total harga "+hargaAkhir+" sukses!");
        hargaAkhir=0;
        return hargaAkhir;
    }
}

