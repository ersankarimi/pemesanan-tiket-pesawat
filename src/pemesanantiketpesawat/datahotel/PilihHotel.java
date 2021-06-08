package pemesanantiketpesawat.datahotel;

import java.util.Scanner;

public class PilihHotel {

    // variabel
    private final Scanner sc = new Scanner(System.in);
    private byte pilHotel;
    private byte kodeHotel;

    // constructor
    public PilihHotel(){
        pilihKodeHotel();
    }



    // method untuk meng-input kode penerbangan
    public PilihHotel pilihKodeHotel(){
        // proses set kode penerbangan
        System.out.print("Pilih [1-3] Hotel yg Tersedia : ");
        this.pilHotel = sc.nextByte();

        if (this.pilHotel > 3){
            System.out.println("Pilihan Tidak tersedia!");
            System.out.println("Silahkan Pilih [1-3] Hotel yg Tersedia!");
            return pilihKodeHotel();
        } else {
            setKodeHotel(pilHotel);
            System.out.println(" ");
        }
        return null;
    }

    // method setter dan getter
    public int getKodeHotel() {
        return kodeHotel;
    }

    public void setKodeHotel(byte kodeHotel) {
        this.kodeHotel = kodeHotel;
    }
}
