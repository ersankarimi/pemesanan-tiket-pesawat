package pemesanantiketpesawat.datahotel;

import java.util.Scanner;

public class TamuHotel {
    //variabel
    Scanner sc = new Scanner(System.in);
    SetHargaHotel setHargaHotelTamuHotel = null;
    CheckInOut checkInOutTamuHotel = null;

    protected byte tamuHotel;
    protected byte kamarHotel;
    protected long totalHarga;

    // constructor
    public TamuHotel(SetHargaHotel setHargaHotelTamuHotel, CheckInOut checkInOutTamuHotel) {
        this.setHargaHotelTamuHotel = setHargaHotelTamuHotel;
        this.checkInOutTamuHotel = checkInOutTamuHotel;

        setTamuHargaHotel();
    }

    // method
    public void setTamuHargaHotel(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Perhatian 1 Kamar hanya untuk 2 Tamu");
        System.out.println("Jika Tamu lebih dari 2 , maka Kamar Otomatis dilebihkan!");
        System.out.print("Masukkan Banyak Tamu : ");
        this.tamuHotel = sc.nextByte();

        if (this.tamuHotel % 2 == 0){
            this.kamarHotel = (byte) (this.tamuHotel / 2);
        } else if (this.tamuHotel % 2 == 1){
            this.kamarHotel = (byte) ((byte) ((this.tamuHotel / 2) + 0.5) + 1);
        }

        // mengatur harga sesuai banyak kamar
        this.totalHarga = (setHargaHotelTamuHotel.getHargaHotel() * this.kamarHotel) * checkInOutTamuHotel.durasi;
    }
}
