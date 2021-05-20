package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.Scanner;

public class Penumpang {

    // variabel
    Scanner sc = new Scanner(System.in);
    protected byte jumPenumpang;
    protected String namaPenumpang;
    protected ArrayList<String> daftarNamaPenumpang = new ArrayList<>();

    // constructor
    public Penumpang(){

        setJumPenumpang();
        setNamaPenumpang();
    }

    // method set banyak penumpang
    public void setJumPenumpang(){

        System.out.print("Berapa Jumlah Tiket yg Dipesan? ");
        this.jumPenumpang = sc.nextByte();
    }

    // method cetak form penumpang
    public void setNamaPenumpang(){

        for (byte i = 1 ; i <= jumPenumpang; i++){

            System.out.println(" ");
            System.out.println("Silahkan Masukkan Data Diri Penumpang " + i);
            System.out.print("Nama Penumpang : ");
            this.namaPenumpang = sc.next();
            daftarNamaPenumpang.add(namaPenumpang);
            System.out.println(" ");
        }
    }
}
