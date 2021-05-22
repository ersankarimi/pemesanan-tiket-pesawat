package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.List;

public class Transfer {

    TotalHargaTiket  totalHargaTiketTransfer;
    List<String> daftarRekening;
    List<String> daftraBank;

    public Transfer(TotalHargaTiket totalHargaTiketTransfer) {
        this.totalHargaTiketTransfer = totalHargaTiketTransfer;

        daftarRekening = new ArrayList<>();
        daftarRekening.addAll(List.of("1120102711", "1120104311", "112010051120102", "120100311201"));

        daftraBank = new ArrayList<>();
        daftraBank.addAll(List.of("BCA    ", "BNI    ", "BRI    ", "Mandiri"));

        rekeningTransfer();
    }

    // method
    public void rekeningTransfer(){
        System.out.println(" ");
        System.out.println("---------------------------------------");
        System.out.println("Silahkan Transfer ke rekening berikut : " );
        for (byte i = 0 ; i < daftraBank.size(); i++){
            System.out.println(daftraBank.get(i) + " : " + daftarRekening.get(i));
        }

        if (totalHargaTiketTransfer.totalHarga > 1000000){
            System.out.println("Transfer sebanyak Rp " + totalHargaTiketTransfer.totalHarga +"jt");
        } else System.out.println("Transfer sebanyak Rp " + totalHargaTiketTransfer.totalHarga + "rb");
        System.out.println("Screenshot Bukti Pembayaran Sebagai Bukti Pembayaran!");
        System.out.println("---------------------------------------");
    }
}
