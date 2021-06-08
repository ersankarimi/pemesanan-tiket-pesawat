package pemesanantiketpesawat.data;

public class SetKota {

    PilihKota pilihKotaSetKota = null;
    protected String KotaAsal;
    protected String KotaTujuan;


    // constructor
    public SetKota(PilihKota pilihKotaSetKota) {
        this.pilihKotaSetKota = pilihKotaSetKota;

        if (pilihKotaSetKota.pilKotaAsal == 1){
            setKotaAsal("Bandung");
            if (pilihKotaSetKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKotaSetKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKotaSetKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKotaSetKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKotaSetKota.pilKotaAsal == 2){
            setKotaAsal("Jakarta");
            if (pilihKotaSetKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKotaSetKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKotaSetKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKotaSetKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKotaSetKota.pilKotaAsal == 3){
            setKotaAsal("Medan");
            if (pilihKotaSetKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKotaSetKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKotaSetKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKotaSetKota.pilKotaTujuan == 4){
                setKotaTujuan("Makassar");
            }
        } else if (pilihKotaSetKota.pilKotaAsal == 4){
            setKotaAsal("Makassar");
            if (pilihKotaSetKota.pilKotaTujuan == 1){
                setKotaTujuan("Bandung");
            } else if (pilihKotaSetKota.pilKotaTujuan == 2){
                setKotaTujuan("Jakarta");
            } else if (pilihKotaSetKota.pilKotaTujuan == 3){
                setKotaTujuan("Medan");
            } else if (pilihKotaSetKota.pilKotaTujuan == 4){
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
