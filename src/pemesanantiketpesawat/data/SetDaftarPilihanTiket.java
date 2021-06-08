package pemesanantiketpesawat.data;

public class SetDaftarPilihanTiket {

    // variabel
    PilihKota pilihKotaSetDaftar = null;
    DaftarPilihanTiket daftarPilihanTiketSetDaftar = null;
    PilihKelas pilihKelasSetDaftar = null;

    // constructor
    public SetDaftarPilihanTiket(DaftarPilihanTiket daftarPilihanTiketSetDaftar, PilihKelas pilihKelasSetDaftar, PilihKota pilihKotaSetdaftar) {
        this.daftarPilihanTiketSetDaftar = daftarPilihanTiketSetDaftar;
        this.pilihKelasSetDaftar = pilihKelasSetDaftar;
        this.pilihKotaSetDaftar = pilihKotaSetdaftar;
        pengecekanKelas();
    }

    // method pengecekan
    public void pengecekanKelas(){
        if (pilihKelasSetDaftar.pilKelas == 1){
            if (pilihKotaSetDaftar.pilKotaTujuan == 1){
                daftarPilihanTiketSetDaftar.bandungPilBusiness();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 2){
                daftarPilihanTiketSetDaftar.jakartaPilBusiness();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 3){
                daftarPilihanTiketSetDaftar.medanPilBusiness();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 4){
                daftarPilihanTiketSetDaftar.makassarPilBusiness();
            }
        } else if (pilihKelasSetDaftar.pilKelas == 2){
            if (pilihKotaSetDaftar.pilKotaTujuan == 1){
                daftarPilihanTiketSetDaftar.bandungPilEco();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 2){
                daftarPilihanTiketSetDaftar.jakartaPilEco();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 3){
                daftarPilihanTiketSetDaftar.medanPilEco();
            } if (pilihKotaSetDaftar.pilKotaTujuan == 4){
                daftarPilihanTiketSetDaftar.makassarPilEco();
            }
        }
    }



}
