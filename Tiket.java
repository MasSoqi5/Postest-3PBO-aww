package model;

public class Tiket {
    private String namaPenumpang;
    private String tujuan;
    private double harga;

    // Constructor
    public Tiket(String namaPenumpang, String tujuan, double harga) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk di-override
    public void tampilkanInfo() {
        System.out.println("Nama Penumpang: " + namaPenumpang +
                           ", Tujuan: " + tujuan +
                           ", Harga: " + harga);
    }
}
