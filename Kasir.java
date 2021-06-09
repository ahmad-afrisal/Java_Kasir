/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Asus Gc
 */
public class Kasir {

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
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
            if (choice.equalsIgnoreCase("1")) {
//                System.out.println("Data Sudah Di input");
                saveData();
//                loopis();
//                running = false;
            } else if (choice.equalsIgnoreCase("2")) {
                cetakNota();
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.println("Keluar....");
                System.exit(0);
            }
        }
    }

    public static void saveData() {
//        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        Vector<String> vec1 = new Vector<>();
//        Vector<Vector<String>> s = new Vector<Vector<String>>();
//        Vector<String>[][] s = new Vector<String>[5][5];
//        Vector<String>[] s = new Vector<String>[5];
//        String nameProduct;
        int pembanding = 0;
        do {

            System.out.print("Nama Item : ");
            String nameProduct = scan.nextLine();

//            choice = scan.readLine();
            if (nameProduct.equalsIgnoreCase("/")) {
                pembanding = 1;
            } else {
                System.out.print("Harga Satuan : ");
                String price = scan.nextLine();
                System.out.print("Banyaknya :");
                String amount = scan.nextLine();
                String choice = nameProduct + price + amount;
//            System.out.print("Masukan Input (0-9) :");
                int i = 0;
                vec1.add(i, choice);
                i++;
            }

        } while (pembanding != 1);

        for (String barang : vec1) {
            System.out.println(barang);
        }
    }

    public static void cetakNota() {
        Barang product1 = new Barang("Buku", 3000, 2);
        Barang product2 = new Barang("Pensil", 1000, 3);
        Barang product3 = new Barang("Pulpen", 2000, 4);
        Barang[] arr1 = {product1, product2, product3};
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("|\tNota Pembelian Alat Tulis isal               |");
        System.out.println("=====================================================");
        System.out.println("No\tNama Item\tHarga\tBanyaknya\tTotal");
        System.out.println("=====================================================");
        int totalPembelian = 0;

        for (int i = 0; i < arr1.length; i++) {
            Barang brg = arr1[i];
            int no = i + 1;
            int total = brg.price * brg.amount;
            totalPembelian += total;
            System.out.printf("|%d\t%s\t\t%d\t\t%d\t%d |\n", no, brg.nameProduct, brg.price, brg.amount, total);
        }
        System.out.println("=====================================================");
        System.out.println("\t\t\t\tTotal Pembelian " + totalPembelian);
        System.out.println();
        System.out.println("\tTerima Kasih telah berbelanja di Toko Kami");
        loopis();
    }

    public static void loopis() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kembali Ke menu kasir (Y/N) : ");
        String decide = scan.next();

        if (decide.equalsIgnoreCase("N")) {
            System.out.println("Keluar....");
            System.exit(0);
        } else if (decide.equalsIgnoreCase("Y")) {
            menu();
        }

    }

}
