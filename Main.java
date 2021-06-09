/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.util.Scanner;

/**
 *
 * @author Asus Gc
 */
public class Main {

    public static void main(String[] args) {

        /*
        Dibuat sebuah scanner untuk menangkap inputan dari keyboard, pada contoh di bawa scanner di beri nama "scan"/
        anda dapat menganti nama scanner sesuka anda.
        untuk menggunakan scanner anda harus mengimport kelas java.util.Scanner
         */
        Scanner scan = new Scanner(System.in);
//        System.out.println(""); untuk mecetak ke layar, apa pun yg berada didalam double quote akan di tampilkan ke layar
//        System.out.println("1. Bisa Hadir Offline");
//        System.out.println("2. Jaringan Bagus");
//        System.out.println("3. Tidak bisa hadir offline dan jaringan tidak bagus");
//        System.out.print(""); fungsin nya sama dengan println(), tp dengan ini mencetak ke layar tanpa bari baru
        System.out.print("Masukan Inputan : ");
//        int input = membuat sebua variabel dengan nama input dan tipe data integer untuk menampung inputan dari keyboard,
//        scan.nextInt();   = untuk menangkap inputan/masukan dari keyboard    
        int input = scan.nextInt();

//       if adalah sebuah pengkodisian/percabangan
//      Menggunakan IF Else
        System.out.println("--- Versi If else---");
        if (input == 1) {
            System.out.println("Sampai Jumpa Di Kelas Offline");
        } else if (input == 2) {
            System.out.println("Silahkan Ikuti Kelas Online");
        } else if (input == 3) {
            System.out.println("Sampai Jumpa semester Depan");
        } else {
            System.out.println("Inputan anda salah");
        }

//        Menggunakan Operator Ternary 
        System.out.println("---Versi Operator Ternary----");
        String opTer = (input == 1) ? "Sampai Jumpa Di Kelas Offline"
                : (input == 2) ? "Silahkan Ikuti Kelas Online"
                : (input == 3) ? "Sampai Jumpa semester Depan" : "Inputan Anda Salah";
        System.out.println(opTer);

//        Menggunakan Switch Case
        System.out.println("----Versi Switch Case-----");
        switch (input) {
            case 1:
                System.out.println("Sampai Jumpa di kelas offline");
                break;
            case 2:
                System.out.println("Silahkan Ikuti kelas Online");
                break;
            case 3:
                System.out.println("Sampai Jumpa semester depan");
                break;
            default:
                System.out.println("Ipnputan anda salah");
                break;
        }

    }
}
