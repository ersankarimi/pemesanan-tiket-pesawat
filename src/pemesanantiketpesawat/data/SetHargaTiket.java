package pemesanantiketpesawat.data;

public class SetHargaTiket {

    PilihKodePenerbangan pilihKodePenerbanganHarga = null;
    protected long hargaTiket;

    // contructor
    public SetHargaTiket(PilihKodePenerbangan pilihKodePenerbanganHarga) {
        this.pilihKodePenerbanganHarga = pilihKodePenerbanganHarga;

        pengecekanHarga();
        cetakTiket();
    }

    //method setter dan getter

    public long getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(long hargaTiket) {
        this.hargaTiket = hargaTiket;
    }


    // method pengecekan untuk harga tiket

    public void pengecekanHarga(){
        if (pilihKodePenerbanganHarga.getKodePenerbangan() == 101 || pilihKodePenerbanganHarga.getKodePenerbangan() == 402){
            setHargaTiket(1_200_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 102 || pilihKodePenerbanganHarga.getKodePenerbangan() == 301){
            setHargaTiket(1_400_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 103){
            setHargaTiket(1_000_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 201 || pilihKodePenerbanganHarga.getKodePenerbangan() == 303) {
            setHargaTiket(1_300_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 202) {
            setHargaTiket(1_500_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 203 || pilihKodePenerbanganHarga.getKodePenerbangan() == 401) {
            setHargaTiket(1_100_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 302){
            setHargaTiket(1_600_000);
        } else if (pilihKodePenerbanganHarga.getKodePenerbangan() == 403){
            setHargaTiket(900_000);
        }
    }

    // method cetak tiket
    public void cetakTiket(){
        System.out.println("Harga Tiket per Orang            : Rp " + getHargaTiket());
    }
}
