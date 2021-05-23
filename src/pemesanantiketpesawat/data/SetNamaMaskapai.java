package pemesanantiketpesawat.data;

public class SetNamaMaskapai {

    // variabel
    PilihKodePenerbangan namaMaskapaiPenerbangan = null;
    protected String namaMaskapai;

    // constructor
    public SetNamaMaskapai(PilihKodePenerbangan namaMaskapai) {
        this.namaMaskapaiPenerbangan = namaMaskapai;

        pengecekanNamaMaskapai();
        getMaskapai();
    }


    public String getNamaMaskapai() {
        return namaMaskapai;
    }

    public void setNamaMaskapai(String namaMaskapai) {
        this.namaMaskapai = namaMaskapai;
    }

    public void getMaskapai(){
        System.out.println("Dengan Nama Maskapai Penerbangan : " + getNamaMaskapai());
    }

    // method pengecekan
    public void pengecekanNamaMaskapai(){
        if (namaMaskapaiPenerbangan.getKodePenerbangan() == 101 || namaMaskapaiPenerbangan.getKodePenerbangan() == 201 || namaMaskapaiPenerbangan.getKodePenerbangan() == 301 || namaMaskapaiPenerbangan.getKodePenerbangan() == 401){
            setNamaMaskapai("Sriwijaya Air");
        } else if (namaMaskapaiPenerbangan.getKodePenerbangan() == 102 || namaMaskapaiPenerbangan.getKodePenerbangan() == 202 || namaMaskapaiPenerbangan.getKodePenerbangan() == 302 || namaMaskapaiPenerbangan.getKodePenerbangan() == 402){
            setNamaMaskapai("Garuda Indonesia");
        } else if (namaMaskapaiPenerbangan.getKodePenerbangan() == 103 || namaMaskapaiPenerbangan.getKodePenerbangan() == 203 || namaMaskapaiPenerbangan.getKodePenerbangan() == 303 || namaMaskapaiPenerbangan.getKodePenerbangan() == 403){
            setNamaMaskapai("Lion Air");
        } else {
            System.out.println(" ");
            System.out.println("Pilihan Salah Program Berhenti!");
            System.exit(0);
        }
    }


}
