/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;
import java.util.Scanner;
/**
 *
 * @author tegar
 */
public class Lingkaran {
    private double diameter, jarijari, luas, keliling;
    final double PHI = 3.14;
    Scanner scanner = new Scanner(System.in);

    public double getDiameter() {
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) {
            try {
                diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
            }
        }
        return diameter;
    }

    public double getJarijari() {
        jarijari = diameter /2 ;
        return jarijari;
    }

    public double getLuas() {
        luas = PHI * jarijari * jarijari;
        return luas;
    }

    public double getKeliling() {
        keliling = PHI * diameter;
        return keliling;
    }
    public double hasilHitung() {
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t\t= %.2f%n", getJarijari());
        System.out.printf("Luas Lingkaran\t\t\t= %.2f%n", getLuas());
        System.out.printf("Keliling lingkaran\t\t= %.2f%n", getKeliling());
        return 0;
    }
}
