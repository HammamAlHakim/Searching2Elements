package Pencarian2Angka;

import javax.swing.JOptionPane;
import java.util.Random;

public class SearchingProgram {

    public static void main(String[] args) {

        do{
        int jlh_data = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah data"));
        System.out.print("Jumlah Data : " + jlh_data);
        System.out.println("\n========================================================");

        int[] data = new int[jlh_data];

        System.out.println("\nPENGISIAN DATA (SECARA RANDOM)");

        for (int a = 0; a < jlh_data; a++) {
            data[a] = new Random().nextInt(201);
        }

        System.out.println("\nTampilkan Data");
        for (int a = 0; a < jlh_data; a++) {
            System.out.println("Data ke-" + (a + 1) + " : " + data[a]);
        }

        System.out.println("========================================================");
        
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Data yang dicari \nPertama : "));
        System.out.println("\nInput Data yang dicari :\nPertama : " + cari);

        int cari1 = Integer.parseInt(JOptionPane.showInputDialog("Kedua : "));
        System.out.println("Kedua : " + cari1);

        boolean temu = false;
        boolean temu1 = false;
        int urutan = 0;
        int urutan1 = 0;
        System.out.println("========================================================");
        
        for (int a = 0; a < jlh_data; a++) {
            if (data[a] == cari) {
                urutan = a + 1;
                temu = true;
                break;
            }
        }

        for (int a = 0; a < jlh_data; a++) {
            if (data[a] == cari1) {
                urutan1 = a + 1;
                temu1 = true;
                break;
            }
        }

        if (temu == true) {
            System.out.println("\nData " + cari + " ditemukan pada urutan ke-" + (urutan));
        } else {
            System.out.println("\nData " + cari + " tidak ditemukan");
        }
        
        if (temu1 == true) {
            System.out.println("\nData " + cari1 + " ditemukan pada urutan ke-" + (urutan1));
        } else {
            System.out.println("\nData " + cari1 + " tidak ditemukan");
        }
        int ulang = Integer.parseInt(JOptionPane.showInputDialog("Ulangi proses?\n"));
        System.out.println("\nInput Data yang dicari :\nPertama : " + cari);
        }while
        System.out.println("\n========================================================");
        System.out.println("Hammam Al-Hakim/XRPL6/27");
    }
}
