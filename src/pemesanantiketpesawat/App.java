package pemesanantiketpesawat;

import pemesanantiketpesawat.data.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char karakterKu;
        var looping = true;
        while (looping){
            Header header = new Header();
            PilihKota pilihKota = new PilihKota();
            SetKota setKota = new SetKota(pilihKota);

            DaftarPilihanTiket daftarPilihanTiket = new DaftarPilihanTiket(pilihKota);
            PilihKodePenerbangan pilihKodePenerbangan = new PilihKodePenerbangan();
            SetKodePenerbangan setKodePenerbangan = new SetKodePenerbangan(pilihKodePenerbangan);
            SetNamaMaskapai setNamaMaskapai = new SetNamaMaskapai(pilihKodePenerbangan);
            SetHargaTiket setHargaTiket = new SetHargaTiket(pilihKodePenerbangan);
            TujuanAsal tujuanAsal = new TujuanAsal(setKota);
            Penumpang penumpang = new Penumpang();
            TotalHargaTiket totalHargaTiket = new TotalHargaTiket(setHargaTiket, penumpang);
            Transfer transfer = new Transfer(totalHargaTiket);

            SetelahTf setelahTf = new SetelahTf();
            Progress progress = new Progress();
            IdTicket idTicket = new IdTicket(penumpang);
            CetakTiket cetakTiket = new CetakTiket(setNamaMaskapai, penumpang, setKota,idTicket);

            System.out.print("Apakah Anda ingin Menggunakan Program nya Lagi? Y/N : ");
            karakterKu = sc.next().charAt(0);

            if (karakterKu == 'Y' || karakterKu == 'y'){
                System.out.println(" ");
                continue;

            } else {
                System.out.println("Terima Kasih Telah Menggunakan Program Kami");;
                System.exit(0);
                break;
            }

        }
    }

}
