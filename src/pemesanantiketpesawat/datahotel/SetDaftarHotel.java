package pemesanantiketpesawat.datahotel;

public class SetDaftarHotel {

    // variabel
    KotaHotel kotaHotelSetDaftar = null;
    DaftarHotel daftarHotelSetDaftar = null;


    // constructor
    public SetDaftarHotel(KotaHotel kotaHotelSetDaftar, DaftarHotel daftarHotelSetDaftar) {
        this.kotaHotelSetDaftar = kotaHotelSetDaftar;
        this.daftarHotelSetDaftar = daftarHotelSetDaftar;

        setDaftarKota();
    }


    // method
    public void setDaftarKota(){

        if (kotaHotelSetDaftar.getKotaTujuan() == "Bandung"){
            daftarHotelSetDaftar.kotaBandung();
        }else if (kotaHotelSetDaftar.getKotaTujuan() == "Jakarta"){
            daftarHotelSetDaftar.kotaJakarta();
        }else if (kotaHotelSetDaftar.getKotaTujuan() == "Medan"){
            daftarHotelSetDaftar.kotaMedan();
        } else if (kotaHotelSetDaftar.getKotaTujuan() == "Makassar"){
            daftarHotelSetDaftar.kotaMakassar();
        } else daftarHotelSetDaftar.exitPil();
    }

}
