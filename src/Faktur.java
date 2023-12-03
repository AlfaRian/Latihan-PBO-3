public class Faktur {
  private String noFaktur;
    private String namaPelanggan;
    private PembayaranBarang pembayaranBarang;

    public Faktur(String noFaktur, String namaPelanggan, PembayaranBarang pembayaranBarang) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.pembayaranBarang = pembayaranBarang;
    }

    public void cetakFaktur() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nama Barang: " + pembayaranBarang.getNamaBarang());
        System.out.println("Harga Barang: " + pembayaranBarang.getHargaBarang());
        System.out.println("Jumlah Beli: " + pembayaranBarang.getJumlahBeli());
        System.out.println("Total Bayar: " + pembayaranBarang.hitungTotalBayar());
    }
}