package pemesanantiketpesawat.data;

public class SetKota {

    PilihKota pilihKotaSetKota = null;
    protected String KotaAsal;
    protected String KotaTujuan;


    // constructor
    public SetKota(PilihKota pilihKota) {
        this.pilihKotaSetKota = pilihKota;

        if (pilihKota.pilKotaAsal == 1){
            setKotaAsal("Bandung");
            if (pilihKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKota.pilKotaAsal == 2){
            setKotaAsal("Jakarta");
            if (pilihKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKota.pilKotaAsal == 3){
            setKotaAsal("Medan");
            if (pilihKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKota.pilKotaAsal == 4){
            setKotaAsal("Makassar");
            if (pilihKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        }
    }

    public String getKotaAsal() {
        return KotaAsal;
    }

    public void setKotaAsal(String setKotaAsal) {
        this.KotaAsal = setKotaAsal;
    }

    public String getKotaTujuan() {
        return KotaTujuan;
    }

    public void setKotaTujuan(String setKotaTujuan) {
        this.KotaTujuan = setKotaTujuan;
    }


}
