
package com.ahmadafrisal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ahmad Afrisal
 */
public class latArrayWithBuffered {
    public static void main(String[] args) throws Exception {
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan Jumlah Nilai : ");
        int jumbil = Integer.parseInt(masukan.readLine());
        
        int data[] = new int[jumbil];
        for(int i = 0;i<jumbil;i++) {
            System.out.print("Nilai ke "+(i+1)+" : ");
            data[i] = Integer.parseInt(masukan.readLine());
        }
        System.out.println("=======Hasil========");
        for(int j = 0; j < jumbil; j++) {
            System.out.println(data[j]);
        }
    }
}
