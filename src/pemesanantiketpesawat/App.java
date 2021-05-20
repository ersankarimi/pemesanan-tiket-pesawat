package pemesanantiketpesawat;

import pemesanantiketpesawat.data.*;

public class App {

    public static void main(String[] args) {

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

//        SetelahTf setelahTf = new SetelahTf();

    }
}
