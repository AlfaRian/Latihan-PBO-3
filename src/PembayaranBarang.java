public class PembayaranBarang extends Barang implements Pembayaran {
    private int jumlahBeli;

    public PembayaranBarang(String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    // Implementasi metode dari interface Pembayaran
    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }
}