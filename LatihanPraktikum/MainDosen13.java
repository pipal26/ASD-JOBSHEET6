package LatihanPraktikum;

import java.util.Scanner;

public class MainDosen13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 pengelola = new DataDosen13();
        int pilih;

        do {
            System.out.println("\nMenu Data Dosen:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble - Usia)");
            System.out.println("4. Sorting DSC (Selection - Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (P/W): ");
                    boolean jk = sc.next().equalsIgnoreCase("P");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    pengelola.tambah(new Dosen13(kd, nm, jk, usia));
                    break;
                case 2:
                    pengelola.tampil();
                    break;
                case 3:
                    pengelola.SortingASC();
                    pengelola.tampil();
                    break;
                case 4:
                    pengelola.sortingDSC();
                    pengelola.tampil();
                    break;
                case 5:
                    System.out.println("Selesai.");
                    break;
            }
        } while (pilih != 5);
    }
}
