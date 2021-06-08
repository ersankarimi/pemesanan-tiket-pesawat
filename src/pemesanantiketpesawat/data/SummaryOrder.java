package pemesanantiketpesawat.data;

public class SummaryOrder {

    // variabel
    PilihKodePenerbangan pilihKodePenerbanganSummary = null;
    NamaMaskapai namaMaskapaiSummary = null;
    SetHargaTiket setHargaTiketSummary = null;
    SetKota setKotaSummary = null;

    // constructor


    public SummaryOrder(PilihKodePenerbangan pilihKodePenerbanganSummary, NamaMaskapai namaMaskapaiSummary, SetHargaTiket setHargaTiketSummary, SetKota setKotaSummary) {
        this.pilihKodePenerbanganSummary = pilihKodePenerbanganSummary;
        this.namaMaskapaiSummary = namaMaskapaiSummary;
        this.setHargaTiketSummary = setHargaTiketSummary;
        this.setKotaSummary = setKotaSummary;

        summaryOrder();
    }

    public void summaryOrder(){
        System.out.println("------------RINGKASAN PESANAN-------------");
        System.out.println("------------------------------------------");
        System.out.println(namaMaskapaiSummary.getNamaMaskapai());
        System.out.println("🛫" + " " + setKotaSummary.getKotaAsal());
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("🛬" + " " + setKotaSummary.getKotaTujuan());

        if (setHargaTiketSummary.getHargaTiket() > 1_000_000){
            System.out.println("Total Harga Tiket per Orang : Rp." + setHargaTiketSummary.getHargaTiket() + "jt");
        } else System.out.println("Total Harga Tiket per Orang : Rp " + setHargaTiketSummary.getHargaTiket() +"rb");
        System.out.println("------------------------------------------");
    }


}
