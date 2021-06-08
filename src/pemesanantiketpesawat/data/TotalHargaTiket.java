package pemesanantiketpesawat.data;

public class TotalHargaTiket {

    SetHargaTiket setTotalTiket = null;
    Penumpang penumpangTiket = null;
    private long hargaTiketnya;
    private byte banyakPenumpang;
    private byte banyakPenumpangDibawahUmur;
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
        this.banyakPenumpang = penumpangTiket.jumPenumpang;
        this.banyakPenumpangDibawahUmur = penumpangTiket.jumPenumpangDibawahUmur;
    }

    // method kalkulasi harga tiket
    public void kalkulasiHargaTiket(){

        if (this.banyakPenumpangDibawahUmur > 0){
            this.totalHarga = (this.banyakPenumpang * this.hargaTiketnya) * 25/100;
            if (this.totalHarga > 1000000){
                System.out.println("Total Harga Tiket yang di Pesan    : Rp " + totalHarga + "jt");
                System.out.println("Tiket Termasuk Diskon 25% ( Untuk Penumpang dibawah 12 tahun )");
            } else {
                System.out.println("Total Harga Tiket yang di Pesan    : Rp " + totalHarga + "rb");
                System.out.println("Tiket Termasuk Diskon 25% ( Untuk Penumpang dibawah 12 tahun )");
            }
        } else {
            this.totalHarga = this.banyakPenumpang * this.hargaTiketnya;
            if (this.totalHarga > 1000000){
                System.out.println("Total Harga Tiket yang di Pesan    : Rp " + totalHarga + "jt");
            } else System.out.println("Total Harga Tiket yang di Pesan    : Rp " + totalHarga + "rb");
        }
        System.out.println("Jumlah Tiket yang Dipesan sebanyak : " + penumpangTiket.jumPenumpang + " Tiket");
        System.out.println(" ");
    }
}
