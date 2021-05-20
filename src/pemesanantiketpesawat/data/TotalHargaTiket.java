package pemesanantiketpesawat.data;

public class TotalHargaTiket {

    SetHargaTiket setTotalTiket = null;
    Penumpang penumpangTiket = null;
    protected long hargaTiketnya;
    protected byte banyakPenumpang;
    protected long totalHarga;

    public TotalHargaTiket(SetHargaTiket setTotalTiket, Penumpang penumpangTiket) {
        this.setTotalTiket = setTotalTiket;
        this.penumpangTiket = penumpangTiket;

        getData();
        kalkulasiHargaTiket();
    }

    // method getPenumpangHargaTiket

    public void getData(){

        this.hargaTiketnya = setTotalTiket.getHargaTiket();
        this.banyakPenumpang= penumpangTiket.jumPenumpang;
    }

    // method kalkulasi harga tiket
    public void kalkulasiHargaTiket(){
        this.totalHarga = this.banyakPenumpang * this.hargaTiketnya;
        System.out.println(" ");

        System.out.println("Jumlah Tiket yang Dipesan sebanyak : " + penumpangTiket.jumPenumpang + " Tiket");
        System.out.println("Total Harga Tiket yang di Pesan    : Rp " + totalHarga);
    }

}
