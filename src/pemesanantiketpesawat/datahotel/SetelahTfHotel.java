package pemesanantiketpesawat.datahotel;

import java.util.Scanner;

public class SetelahTfHotel {

    //variabel
    private Scanner sc = new Scanner(System.in);
    protected char karakter;



    // constructor


    public SetelahTfHotel() {
        prosesPembayaran();
        pengecekanKarakter();
    }

    public void pengecekanKarakter(){
        if (karakter == 'Y' || karakter == 'y'){
            System.out.println("Tunggu Sebentar...");
            System.out.println("Kami Sedang Memproses Tiket Anda");
            System.out.println(" ");
        } else {
            System.out.println(" ");
            System.out.println("Selesaikan Pembayaran Untuk Proses Tiket!");
            System.out.println("Untuk Proses Tiket Hotel Anda!");
            System.out.println(" ");
            prosesPembayaran();
        }
    }

    public void prosesPembayaran(){
        System.out.print("Apakah Anda Menyelesaikan Pembayaran? Y/N : ");
        this.karakter = sc.next().charAt(0);

    }
}

