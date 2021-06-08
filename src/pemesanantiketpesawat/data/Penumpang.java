package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.Scanner;

public class Penumpang {

    // variabel
    Scanner sc = new Scanner(System.in);
    protected byte jumPenumpang;
    private String namaPenumpang;
    protected byte jumPenumpangDibawahUmur;
    private char karakter;
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

        checkPenumpang();

    }

    // method cetak form penumpang
    public void setNamaPenumpang(){

        for (byte i = 1 ; i <= jumPenumpang; i++){

            System.out.println(" ");
            System.out.println("Silahkan Masukkan Data Diri Penumpang " + i);
            System.out.print("Nama Depan : ");
            this.namaPenumpang = sc.next();
            daftarNamaPenumpang.add(namaPenumpang);


            System.out.println(" ");
        }
    }

    // method pengecekan penumpang dibawah umur
    public void checkPenumpang(){
        System.out.print("Apakah Ada Penumpang Dibawah Umur 12 tahun? Y/N : ");
        this.karakter = sc.next().charAt(0);

        if (this.karakter == 'Y' || this.karakter == 'y'){
            System.out.print("Berapa Banyak Penumpang Dibawah Umur 12 tahun : ");
            this.jumPenumpangDibawahUmur = sc.nextByte();
        } else System.out.println(" ");
    }
}
