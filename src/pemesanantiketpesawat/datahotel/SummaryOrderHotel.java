package pemesanantiketpesawat.datahotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SummaryOrderHotel {

    // variabel
    NamaHotel namaHotelSummary = null;
    TamuHotel tamuHotelSummary = null;
    SetHargaHotel setHargaHotelSummary = null;
    CheckInOut checkInOutSummary = null;

    DateFormat dateCekinSummary = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    DateFormat dateCekotSummary = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    // constructor

    public SummaryOrderHotel(NamaHotel namaHotelSummary, TamuHotel tamuHotelSummary, SetHargaHotel setHargaHotelSummary, CheckInOut checkInOutSummary) {
        this.namaHotelSummary = namaHotelSummary;
        this.tamuHotelSummary = tamuHotelSummary;
        this.setHargaHotelSummary = setHargaHotelSummary;
        this.checkInOutSummary = checkInOutSummary;

        summaryOrederHotel();
    }


    // method summary order

    public void summaryOrederHotel(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("------------RINGKASAN PESANAN-------------");
        System.out.println("------------------------------------------");
        System.out.println("Nama Hotel      : " + namaHotelSummary.getNamaHotel());
        System.out.println("Harga per Malam : " + setHargaHotelSummary.getHargaHotel());
        System.out.println("-------------------------------------------");
        System.out.println("Banyak Tamu     : " + tamuHotelSummary.tamuHotel);
        System.out.println("Banyak Kamar    : " + tamuHotelSummary.kamarHotel);
        System.out.println("Waktu Check-in  : " + dateCekinSummary.format(checkInOutSummary.waktuCheckin));
        System.out.println("Waktu Check-out : " + dateCekotSummary.format(checkInOutSummary.waktuCheckout));
        System.out.println("Lama Menginap   : " + checkInOutSummary.durasi + " Malam");
        System.out.println("Total Harga     : " + tamuHotelSummary.totalHarga);
        System.out.println("--------------------------------------------");
    }
}
