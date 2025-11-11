package oop;

import java.util.Scanner;

public class ProgramKonversi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi array konverter
        int jumlahkonverter = 4, n = 0;
        KonverterSatuan konverters[] = new KonverterSatuan[jumlahkonverter];
        konverters[n++] = new CelciusFahrenheit();
        konverters[n++] = new FahrenheitCelcius();
        konverters[n++] = new CelciusReamur();
        konverters[n++] = new ReamurCelcius();

        int pilihan;

        // Loop utama program
        while (true) {
            // Langkah 1: Tampilkan daftar konverter
            System.out.println("\n=== PROGRAM KONVERSI SATUAN ===");
            System.out.println("Pilih jenis konversi:");
            for (int i = 0; i < jumlahkonverter; i++) {
                System.out.println((i + 1) + ". " + konverters[i].satuanInput()
                        + " ke " + konverters[i].satuanOutput());
            }
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            // Langkah 2: Ambil masukan pilihan konverter
            pilihan = input.nextInt();

            // Langkah 3: Periksa masukan apakah sah atau tidak
            if (pilihan == 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            if (pilihan < 1 || pilihan > jumlahkonverter) {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-" + jumlahkonverter + " atau 0 untuk keluar.");
                continue;
            }

            // Langkah 4: Jika sah, ambil masukan nilai skala asal
            System.out.print("Masukkan nilai " + konverters[pilihan - 1].satuanInput() + ": ");
            float nilaiAsal = input.nextFloat();

            // Langkah 5: Hitung nilai konversi
            float hasilKonversi = konverters[pilihan - 1].konversi(nilaiAsal);

            // Langkah 6: Tampilkan hasil konversi
            System.out.println("\nHasil Konversi:");
            System.out.println(nilaiAsal + " " + konverters[pilihan - 1].satuanInput()
                    + " = " + hasilKonversi + " " + konverters[pilihan - 1].satuanOutput());

            // Langkah 7: Kembali ke langkah 1 (loop while akan mengulang)
        }

        input.close();
    }
}
