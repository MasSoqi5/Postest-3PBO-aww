/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiket_kapal;

import java.util.Scanner;
import service.TiketService;

public class Tiket_Kapal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiketService service = new TiketService();
        int pilih;

        do {
            System.out.println("\n=== Menu Tiket Kapal ===");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Tampilkan Tiket");
            System.out.println("3. Hapus Tiket");
            System.out.println("4. Cari Tiket");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    service.tambahTiket();
                    break;
                case 2:
                    service.tampilkanTiket();
                    break;
                case 3:
                    service.hapusTiket();
                    break;
                case 4:
                    service.cariTiket();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}