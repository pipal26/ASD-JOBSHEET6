package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerpestrasi13 data = new MahasiswaBerpestrasi13(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            data.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        data.tampil();

        System.out.println("Data setelah BUBBLE SORT (DESC):");
        data.bubbleSort();
        data.tampil();

        System.out.println("Data setelah SELECTION SORT (ASC):");
        data.selectionSort();
        data.tampil();

        System.out.println("Data setelah INSERTION SORT (ASC):");
        data.insertionSort();
        data.tampil();

        sc.close();
    }
}