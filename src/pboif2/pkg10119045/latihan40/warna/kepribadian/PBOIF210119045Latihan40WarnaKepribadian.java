/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan40.warna.kepribadian;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi            : Program Warna Kepribadian
 */
public class PBOIF210119045Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String warna,nama;

        System.out.println(Warna.RED+"YUK"+Warna.GREEN+" CEK"+Warna.YELLOW+" KEPRIBADIANMU"+Warna.CYAN+" DARI"+Warna.PURPLE+" WARNA"+Warna.BLUE+" FAVORITMU");
        System.out.println(Warna.RED+"MERAH");
        System.out.println(Warna.GREEN+"HIJAU");
        System.out.println(Warna.YELLOW+"KUNING");
        System.out.println(Warna.BLUE+"BIRU");
        System.out.println(Warna.PURPLE+"UNGU");
        System.out.println(Warna.BLACK+"");
        System.out.println("*gunakan huruf kapital");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        Warna.tesKepribadianWarna(warna, nama);
        System.out.println("Developed by : Zainul Rifqi Muwaffaq");
    }
    
}

    
    

