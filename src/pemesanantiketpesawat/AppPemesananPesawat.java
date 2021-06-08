package pemesanantiketpesawat;

import pemesanantiketpesawat.data.*;
import pemesanantiketpesawat.datahotel.*;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class AppPemesananPesawat {


    public static void main(String[] args) {

        // variabel
        Scanner sc = new Scanner(System.in);
        char karakter;
        var looping = true;

        while (looping){
            Header header = new Header();
            PilihKota pilihKota = new PilihKota();
            PilihKelas pilihKelas = new PilihKelas();
            SetKelas setKelas = new SetKelas(pilihKelas);
            SetKota setKota = new SetKota(pilihKota);
            Progress progress = new Progress();
            DaftarPilihanTiket daftarPilihanTiket = new DaftarPilihanTiket();
            SetDaftarPilihanTiket setDaftarPilihanTiket = new SetDaftarPilihanTiket(daftarPilihanTiket, pilihKelas, pilihKota);
            PilihKodePenerbangan pilihKodePenerbangan = new PilihKodePenerbangan();
            NamaMaskapai namaMaskapai = new NamaMaskapai(pilihKodePenerbangan);
            SetHargaTiket setHargaTiket = new SetHargaTiket(pilihKelas, pilihKodePenerbangan);
            SummaryOrder summaryOrder = new SummaryOrder(pilihKodePenerbangan, namaMaskapai, setHargaTiket, setKota);
            Penumpang penumpang = new Penumpang();
            TotalHargaTiket totalHargaTiket = new TotalHargaTiket(setHargaTiket, penumpang);
            Loading loading = new Loading();
            Transfer transfer = new Transfer(totalHargaTiket);
            SetelahTf setelahTf = new SetelahTf();
            LoadingTiket loadingTiket = new LoadingTiket();
            IdTicket idTicket = new IdTicket(penumpang);
            CetakTiket cetakTiket = new CetakTiket(namaMaskapai, penumpang, setKota, idTicket);

            System.out.println(" ");
            System.out.println("- Program ini di Lengkapi dengan Pemesanan Tiket Hotel , ");
            System.out.println("  Untuk Memudahkan Anda Perjalanan Anda , ");
            System.out.println(" ");
            System.out.println("- Jika Y maka kami akan membantu anda , ");
            System.out.println("  Untuk menemukan Hotel sesuai destinasi tujuan penerbangan anda.");
            System.out.println("- Jika N maka program akan berhenti.");
            System.out.println(" ");
            System.out.print("- Apakah Anda Ingin Memesan Tiket Hotel? Y/N : ");
            karakter = sc.next().charAt(0);
            if (karakter == 'Y' || karakter == 'y'){
                System.out.println(" ");
                HeaderHotel headerHotel = new HeaderHotel();
                KotaHotel kotaHotel = new KotaHotel(setKota);
                DaftarHotel daftarHotel = new DaftarHotel(kotaHotel);
                LoadingHotel loadingHotel = new LoadingHotel();
                SetDaftarHotel setDaftarHotel = new SetDaftarHotel(kotaHotel, daftarHotel);
                PilihHotel pilihHotel = new PilihHotel();
                NamaHotel namaHotel = new NamaHotel(kotaHotel, pilihHotel);
                SetHargaHotel setHargaHotel = new SetHargaHotel(kotaHotel, pilihHotel);
                CheckInOut checkInOut = new CheckInOut();
                TamuHotel tamuHotel = new TamuHotel(setHargaHotel, checkInOut);
                LoadingHotelSatu loadingHotelSatu = new LoadingHotelSatu();
                SummaryOrderHotel summaryOrderHotel = new SummaryOrderHotel(namaHotel, tamuHotel, setHargaHotel, checkInOut);
                TransferHotel transferHotel = new TransferHotel(tamuHotel);
                SetelahTfHotel setelahTfHotel = new SetelahTfHotel();
                LoadingHotelDua loadingHotelDua = new LoadingHotelDua();
                IdTiketHotel idTiketHotel = new IdTiketHotel(tamuHotel);
                CetakTiketHotel cetakTiketHotel = new CetakTiketHotel(tamuHotel, checkInOut, idTiketHotel, namaHotel);

                System.out.println("Terima Kasih Telah Menggunakan Program Kami");
                System.exit(0);
                break;
            } else {
                System.out.println("Terima Kasih Telah Menggunakan Program Kami");
                System.exit(0);
                break;
            }
        }
    }
}
