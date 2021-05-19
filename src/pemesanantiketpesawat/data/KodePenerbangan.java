package pemesanantiketpesawat.data;

import java.util.Scanner;

public class KodePenerbangan {

    // variabel
    Scanner sc = new Scanner(System.in);
    SetKota setKotaKode = null;

    public KodePenerbangan(SetKota setKotaKode) {
        this.setKotaKode = setKotaKode;

        cetak();



    }

    public void cetak(){
        var kotaku = setKotaKode.getKotaAsal();
        var tujuanku = setKotaKode.getKotaTujuan();
        System.out.println(" ");
        System.out.println("-----------------------");
        System.out.println("Kota Asal   : " + kotaku);
        System.out.println("Kota Tujuan : " + tujuanku);
        System.out.println("-----------------------");
        System.out.println(" ");
    }
}
