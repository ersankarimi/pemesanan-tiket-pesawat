package pemesanantiketpesawat.data;

public class TujuanAsal {

    // variabel
    SetKota setKotaTujuanAsal = null;

    // constructor
    public TujuanAsal(SetKota setKotaTujuanAsal) {
        this.setKotaTujuanAsal = setKotaTujuanAsal;
        getTujuanAsal();
    }

    public void getTujuanAsal() {
        var asalNya = setKotaTujuanAsal.getKotaAsal();
        var tujuanNya = setKotaTujuanAsal.getKotaTujuan();

        System.out.println("Asal Kota Penerbagan             : " + asalNya);
        System.out.println("Tujuan Kota Penerbagan           : " + tujuanNya);
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
    }


}
