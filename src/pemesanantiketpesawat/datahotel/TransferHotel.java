package pemesanantiketpesawat.datahotel;

import java.util.ArrayList;
import java.util.List;

public class TransferHotel {

    //variabel
    TamuHotel tamuHotelTrasfer = null;
    List<String> daftarRekeningHotel;
    List<String> daftraBankHotel;


    public TransferHotel(TamuHotel tamuHotelTrasfer) {
        this.tamuHotelTrasfer = tamuHotelTrasfer;

        daftarRekeningHotel = new ArrayList<>();
        daftarRekeningHotel.addAll(List.of("1120102711", "1120104311", "112010051120102", "120100311201"));

        daftraBankHotel = new ArrayList<>();
        daftraBankHotel.addAll(List.of("BCA    ", "BNI    ", "BRI    ", "Mandiri"));

        rekeningTransferHotel();
    }

    // method
    public void rekeningTransferHotel(){
        System.out.println(" ");
        System.out.println("---------------------------------------");
        System.out.println("Silahkan Transfer ke rekening berikut : " );
        for (byte i = 0 ; i < daftraBankHotel.size(); i++){
            System.out.println(daftraBankHotel.get(i) + " : " + daftarRekeningHotel.get(i));
        }

        if (tamuHotelTrasfer.totalHarga > 1000000){
            System.out.println("Transfer sebesar  Rp " + tamuHotelTrasfer.totalHarga +"jt");
        } else System.out.println("Transfer sebesar  Rp " + tamuHotelTrasfer.totalHarga + "rb");
        System.out.println("Screenshot Hasil Pembayaran Sebagai Bukti Pembayaran!");
        System.out.println("---------------------------------------");
    }
}
