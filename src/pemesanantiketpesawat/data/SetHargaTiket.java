package pemesanantiketpesawat.data;

public class SetHargaTiket {

    // inisialisasi variabel
    PilihKelas pilihKelasSetTiket = null;
    PilihKodePenerbangan pilihKodePenerbanganSetTiket = null;
    private long hargaTiket;

    // constructor
    public SetHargaTiket(PilihKelas pilihKelasSetTiket, PilihKodePenerbangan pilihKodePenerbanganSetTiket) {
        this.pilihKelasSetTiket = pilihKelasSetTiket;
        this.pilihKodePenerbanganSetTiket = pilihKodePenerbanganSetTiket;

        pengecekanKelas();
    }

    // method pengecekan
    public void pengecekanKelas(){
        if (pilihKelasSetTiket.pilKelas == 1){
            pengecekanHargaBusiness();
        } else if (pilihKelasSetTiket.pilKelas == 2){
            pengecekanHargaEco();
        }
    }
    public void pengecekanHargaEco(){
        if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 101 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 402){
            setHargaTiket(1_200_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 102 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 301){
            setHargaTiket(1_400_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 103){
            setHargaTiket(1_000_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 201 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 303) {
            setHargaTiket(1_300_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 202) {
            setHargaTiket(1_500_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 203 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 401) {
            setHargaTiket(1_100_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 302){
            setHargaTiket(1_600_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 403){
            setHargaTiket(900_000);
        }
    }
    public void pengecekanHargaBusiness(){
        if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 101 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 402){
            setHargaTiket(2_400_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 102 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 301){
            setHargaTiket(2_800_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 103){
            setHargaTiket(2_000_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 201 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 303) {
            setHargaTiket(2_600_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 202) {
            setHargaTiket(3_000_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 203 || pilihKodePenerbanganSetTiket.getKodePenerbangan() == 401) {
            setHargaTiket(2_200_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 302){
            setHargaTiket(3_200_000);
        } else if (pilihKodePenerbanganSetTiket.getKodePenerbangan() == 403){
            setHargaTiket(1_800_000);
        }
    }

    // method getter and setter harga
    public long getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(long hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}
