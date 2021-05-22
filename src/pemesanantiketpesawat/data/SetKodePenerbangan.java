package pemesanantiketpesawat.data;

public class SetKodePenerbangan {

    // variabel

    PilihKodePenerbangan pilihKodePenerbanganSet = null;


    public SetKodePenerbangan(PilihKodePenerbangan pilihKodePenerbangan) {
        this.pilihKodePenerbanganSet = pilihKodePenerbangan;


        getKodePenerbangan();
    }

    public void getKodePenerbangan(){

        var kodePenerbangan = pilihKodePenerbanganSet.getKodePenerbangan();


        System.out.println(" ");
        System.out.println("---------------------------------------------------");
        System.out.println("Anda Memilih Kode Penerbangan    : " + kodePenerbangan);

    }
}
