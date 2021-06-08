package pemesanantiketpesawat.data;

public class SetKelas {

    // inisialisasi variabel
    PilihKelas pilihKelasSetKelas = null;
    private String kelas;

    public SetKelas(PilihKelas pilihKelasSetKelas) {
        this.pilihKelasSetKelas = pilihKelasSetKelas;

        if (pilihKelasSetKelas.pilKelas == 1){
            setKelas("Business Class");
        } else setKelas("Economy Class");
    }

    // method get and set kelas

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
