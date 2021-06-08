package pemesanantiketpesawat.datahotel;

public class SetHargaHotel {

    // variabel
    KotaHotel kotaHotelSetHarga = null;
    PilihHotel pilihHotelSetHarga = null;
    private long hargaHotel;

    // constructor
    public SetHargaHotel(KotaHotel kotaHotelSetHarga, PilihHotel pilihHotelSetHarga) {
        this.kotaHotelSetHarga = kotaHotelSetHarga;
        this.pilihHotelSetHarga = pilihHotelSetHarga;
        pengecekanHargaHotel();
    }

    //method pengecekan
    public void pengecekanHargaHotel(){

        if (kotaHotelSetHarga.getKotaTujuan() == "Bandung"){
            if (pilihHotelSetHarga.getKodeHotel() == 1){
                setHargaHotel(550_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 2){
                setHargaHotel(400_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 3){
                setHargaHotel(700_000L);
            }
        } else if (kotaHotelSetHarga.getKotaTujuan() == "Jakarta"){
            if (pilihHotelSetHarga.getKodeHotel() == 1){
                setHargaHotel(890_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 2){
                setHargaHotel(850_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 3){
                setHargaHotel(889_000L);
            }
        } else if (kotaHotelSetHarga.getKotaTujuan() == "Medan"){
            if (pilihHotelSetHarga.getKodeHotel() == 1){
                setHargaHotel(770_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 2){
                setHargaHotel(440_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 3){
                setHargaHotel(450_000L);
            }
        } else if (kotaHotelSetHarga.getKotaTujuan() == "Makassar"){
            if (pilihHotelSetHarga.getKodeHotel() == 1){
                setHargaHotel(750_000);
            } else if (pilihHotelSetHarga.getKodeHotel() == 2){
                setHargaHotel(550_000L);
            } else if (pilihHotelSetHarga.getKodeHotel() == 3){
                setHargaHotel(580_000);
            }
        }
    }

    //method getter dan setter harga hotel
    public long getHargaHotel() {
        return hargaHotel;
    }

    public void setHargaHotel(long hargaHotel) {
        this.hargaHotel = hargaHotel;
    }
}
