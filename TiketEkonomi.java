package model;

public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String namaPenumpang, String tujuan, double harga) {
        super(namaPenumpang, tujuan, harga);
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("[EKONOMI] Nama Penumpang: " + getNamaPenumpang() +
                           ", Tujuan: " + getTujuan() +
                           ", Harga: " + getHarga());
    }
}
