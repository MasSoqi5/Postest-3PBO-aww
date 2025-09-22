package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class TiketService {
    private ArrayList<Tiket> daftarTiket = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahTiket() {
        System.out.println("Pilih jenis tiket: ");
        System.out.println("1. Ekonomi");
        System.out.println("2. VIP");
        System.out.print("Pilihan: ");
        int pilih = scanner.nextInt();
        scanner.nextLine(); // buang enter

        System.out.print("Nama Penumpang: ");
        String nama = scanner.nextLine();
        System.out.print("Tujuan: ");
        String tujuan = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        if (pilih == 1) {
            daftarTiket.add(new TiketEkonomi(nama, tujuan, harga));
        } else if (pilih == 2) {
            System.out.print("Fasilitas VIP: ");
            String fasilitas = scanner.nextLine();
            daftarTiket.add(new TiketVIP(nama, tujuan, harga, fasilitas));
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("Belum ada tiket.");
        } else {
            for (Tiket t : daftarTiket) {
                t.tampilkanInfo(); // Polymorphism → otomatis manggil override
            }
        }
    }

    public void hapusTiket() {
        tampilkanTiket();
        System.out.print("Masukkan nomor tiket yang akan dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= daftarTiket.size()) {
            daftarTiket.remove(index - 1);
            System.out.println("Tiket berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void cariTiket() {
        System.out.print("Masukkan nama penumpang yang dicari: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;

        for (Tiket t : daftarTiket) {
            if (t.getNamaPenumpang().equalsIgnoreCase(nama)) {
                t.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tiket tidak ditemukan.");
        }
    }
}
