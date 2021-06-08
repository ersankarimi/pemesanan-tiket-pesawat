package pemesanantiketpesawat.datahotel;

import pemesanantiketpesawat.data.SetKota;

public class KotaHotel {


    // ini class untuk mendapatkan tujuan dari penerbangan
    // variabel
    SetKota setKotaHotel = null;
    protected String kotaTujuan;

    // constructor
    public KotaHotel(SetKota setKotaHotel) {
        this.setKotaHotel = setKotaHotel;

        setKotaTujuan();
    }




    // method setter dan getter
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan() {
        this.kotaTujuan = setKotaHotel.getKotaTujuan();
    }
}
