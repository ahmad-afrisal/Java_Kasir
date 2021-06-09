/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus Gc
 */
public class Kasir_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ArrayList<Barang> list_obj = new ArrayList<Barang>();

        String barang;
        int input = 0, total = 0;

        ArrayList<String> barangList = new ArrayList<>();
        ArrayList<Integer> hargaList = new ArrayList<>();
        ArrayList<Integer> jumlahList = new ArrayList<>();
        ArrayList<Integer> totalList = new ArrayList<>();

        System.out.println("==========================");
        System.out.println("|\tMenu Kasir       |");
        System.out.println("==========================");
        System.out.println("| [1] Input Pembelian    |");
        System.out.println("| [2] Cetak Nota         |");
        System.out.println("| [3] Keluar             |");
        System.out.println("==========================");

        boolean running = true;

        while (running) {
            System.out.print("Masukan Pilihan : ");
            String choice = scan.next();
            scan.nextLine();
            if (choice.equalsIgnoreCase("1")) {
                do {
                    System.out.println();
                    System.out.print("Nama Barang : ");
                    barang = scan.nextLine();

                    if (barang.equalsIgnoreCase("/")) {
                        input = -1;
                    } else {
                        System.out.print("Harga : ");
                        int harga = scan.nextInt();
                        System.out.print("Jumlah : ");
                        int jumlah = scan.nextInt();
                        scan.nextLine();
                        System.out.println();
                        total = harga * jumlah;
                        int i = 0;
                        barangList.add(i, barang);
                        hargaList.add(i, harga);
                        jumlahList.add(i, jumlah);
                        totalList.add(i, total);

                        i++;
                    }

                } while (input != -1);
            } else if (choice.equalsIgnoreCase("2")) {
                if (barangList.size() != 0) {
                    System.out.println("=====================================================");
                    System.out.println("|\tNota Pembelian Alat Tulis isal               |");
                    System.out.println("=====================================================");
                    System.out.printf("|%-15s" + "%-15s" + "%-15s" + "%-7s|%n", "Barang", "Harga", "Banyaknya", "Total");

                    int totalPembayaran = 0;
                    for (int i = 0; i < barangList.size(); i++) {
                        totalPembayaran += totalList.get(i);
                        System.out.printf("|%-15s" + "%-15d" + "%-15d" + "%-7d|%n", barangList.get(i), hargaList.get(i), jumlahList.get(i), totalList.get(i));
                    }
                    System.out.println("=====================================================");

                    System.out.println("\t\tTotal Pembayarn Rp " + totalPembayaran);
                    System.out.println();
                    System.out.print("Masukan Pembayaran Rp ");
                    int pembayaran = scan.nextInt();
                    int kembalian;
                    if (pembayaran < totalPembayaran) {
                        System.out.println("Uang Anda Tidak Cukup.");
                    } else {
                        kembalian = pembayaran - totalPembayaran;
                        System.out.println("Pembayaran berhasil");
                        System.out.println("Kembalian Anda Rp " + kembalian);
                        System.out.println();
                        System.out.println("\tTerima Kasih telah berbelanja di Toko Kami");
                        System.out.println("\tBarang yang sudah di beli tidak dapat dikembalikan");

                    }
                } else {
                    System.out.println("Data Kosong");
                }
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.println("Keluar....");
                System.exit(0);
            }
        }
    }
}
