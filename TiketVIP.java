package model;

public class TiketVIP extends Tiket {
    private String fasilitas;

    public TiketVIP(String namaPenumpang, String tujuan, double harga, String fasilitas) {
        super(namaPenumpang, tujuan, harga);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("[VIP] Nama Penumpang: " + getNamaPenumpang() +
                           ", Tujuan: " + getTujuan() +
                           ", Harga: " + getHarga() +
                           ", Fasilitas: " + fasilitas);
    }
}
