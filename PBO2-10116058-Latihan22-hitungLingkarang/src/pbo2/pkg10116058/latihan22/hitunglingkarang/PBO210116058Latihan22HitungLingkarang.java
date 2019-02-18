/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan22.hitunglingkarang;

import java.util.Scanner;

public class PBO210116058Latihan22HitungLingkarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diameter;
        double ph, jari, luas, keliling;
        ph = 3.14;
        boolean ulang = true;

        Scanner doyen = new Scanner(System.in);

        while (ulang == true) {
            System.out.println("=======Perhitungan Lingkaran=========");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = doyen.next();

            if (diameter.matches("[0-9]*")) {

                double d = Double.parseDouble(diameter);
                jari = d / 2;
                luas = 0.5 * ph * (Math.pow(jari, 2));
                keliling = 2 * ph * jari;
                System.out.println("=======Hasil Perhitungan Lingkaran==="
                );
                System.out.println("Jari-jari Lingkaran\t=" + jari);
                System.out.println("Luas Lingkaran\t\t=" + luas);
                System.out.println("Keliling Lingkaran\t=" + keliling);
                ulang = false;

            } else {
                System.out.println("Nilai Diameter Tidak Sesuai ");
            }

        }

    }

}