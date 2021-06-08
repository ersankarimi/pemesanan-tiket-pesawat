package pemesanantiketpesawat.datahotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CetakTiketHotel {

    // variabel
    Scanner sc = new Scanner(System.in);
    List<String> daftarNama = new ArrayList<>();
    TamuHotel tamuHotelCetakTiket = null;
    protected String atasNama;
    CheckInOut checkInOutCetakTiket = null;
    IdTiketHotel idTiketHotelCetakTiket = null;
    NamaHotel namaHotelCetakTiket = null;

    DateFormat dateCekinTiket = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    DateFormat dateCekotTiket = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Thread t;

    // constructor
    public CetakTiketHotel(TamuHotel tamuHotelCetakTiket, CheckInOut checkInOutCetakTiket, IdTiketHotel idTiketHotelCetakTiket, NamaHotel namaHotelCetakTiket) {
        this.tamuHotelCetakTiket = tamuHotelCetakTiket;
        this.checkInOutCetakTiket = checkInOutCetakTiket;
        this.idTiketHotelCetakTiket = idTiketHotelCetakTiket;
        this.namaHotelCetakTiket = namaHotelCetakTiket;

        pengecekanAtasNama();
        processing();
        System.out.println(" ");
        patternTiketHotel();

        System.out.println(" ");

    }

    //method atas nama
    public void pengecekanAtasNama(){
        System.out.println(" ");
        System.out.println("Jumlah Kamar yang di Pesan  : " + tamuHotelCetakTiket.kamarHotel);

        for (int i = 1; i <= tamuHotelCetakTiket.kamarHotel; i++){
            System.out.print("Masukkan Nama untuk Kamar " + i + " : ");
            this.atasNama = sc.next();
            this.daftarNama.add(atasNama);
        }
    }


    // method pembuatan tiket
    public void patternTiketHotel(){
        for (int i = 0; i < tamuHotelCetakTiket.kamarHotel; i++) {
            System.out.println(" ");
            System.out.println("Atas Nama Pemesan : " + daftarNama.get(i));
            System.out.println("------------------------------------------------------");
            System.out.println(" _           _       _ \n" +
                    "| |         | |     | |\n" +
                    "| |__   ___ | |_ ___| |\n" +
                    "| '_ \\ / _ \\| __/ _ \\ |\n" +
                    "| | | | (_) | ||  __/ |\n" +
                    "|_| |_|\\___/ \\__\\___|_|");
            System.out.println("------------------------------------------------------");
            System.out.println(" ");
            System.out.println("Nama Hotel      : " + namaHotelCetakTiket.getNamaHotel());
            System.out.println("Lama Menginap   : " + checkInOutCetakTiket.durasi + " Malam");
            System.out.println("Waktu Check-in  : " + dateCekinTiket.format(checkInOutCetakTiket.waktuCheckin));
            System.out.println("Waktu Check-out : " + dateCekotTiket.format(checkInOutCetakTiket.waktuCheckout));
            System.out.println("No Id Pemesanan : " + idTiketHotelCetakTiket.daftarRandomCharHotel.get(i));
            System.out.println("------------------------------------------------------");
        }
    }

    // method loading
    public void processing( ) {
        System.out.print("Loading---------");

        for (int i = 0 ; i <= 100 ; i++) {
            if (i < 10) {
                System.out.print(i + "%");
                System.out.print("\b\b");
            } else if (i >= 10 && i <= 99) {
                System.out.print(i + "%");
                System.out.print("\b\b\b");
            }
            if (i == 100) {
                System.out.println(i + "%");
            }
            try {
                t.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
