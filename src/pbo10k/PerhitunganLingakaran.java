/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;

/**
 *
 * @author tegar
 */
public class PerhitunganLingakaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter, jarijari, luas, keliling;
        System.out.println ("=====Perhitungan Lingkaran=====");
        Lingkaran hitung_lingkaran = new Lingkaran();

        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJarijari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
    
}
