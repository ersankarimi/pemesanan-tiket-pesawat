package pemesanantiketpesawat.data;

public class DaftarPilihanTiket {

    // variabel
    PilihKota pilihKotaTiket = null;

    public DaftarPilihanTiket(PilihKota pilihKota) {
        this.pilihKotaTiket = pilihKota;

        if (pilihKota.pilKotaTujuan == 1){
            bandungPil();
        } else if (pilihKota.pilKotaTujuan == 2){
            jakartaPil();
        } else if (pilihKota.pilKotaTujuan == 3){
            medanPil();
        } else if (pilihKota.pilKotaTujuan == 4){
            makassarPil();
        } else if (pilihKota.pilKotaTujuan == 5){
            exitPil();
        }
    }

    // pilihan pertama
    private void bandungPil(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Kode" + "\t\t\t" + "Nama" + "\t\t\t\t"+ "Kota" + "\t\t" + "Harga");
        System.out.println("Penerbangan " + "\t" +"Maskapai" + "\t\t\t" + "Tujuan" + "\t\t" + "Tiket");
        System.out.println("------------------------------------------------------------------");

        System.out.println("101" + "\t\t\t\t" + "Sriwijaya Air" + "\t\t" + "Bandung" + "\t\t" + "RP 1.200.000");
        System.out.println("102" + "\t\t\t\t" + "Garuda Indonesia" + "\t" + "Bandung" + "\t\t" + "RP 1.400.000");
        System.out.println("103" + "\t\t\t\t" + "Lion Air" + "\t\t\t" + "Bandung" + "\t\t" + "RP 1.000.000");

        System.out.println(" ");
    }

    // pilihan kedua
    private void jakartaPil(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Kode" + "\t\t\t" + "Nama" + "\t\t\t\t"+ "Kota" + "\t\t" + "Harga");
        System.out.println("Penerbangan " + "\t" +"Maskapai" + "\t\t\t" + "Tujuan" + "\t\t" + "Tiket");
        System.out.println("------------------------------------------------------------------");

        System.out.println("201" + "\t\t\t\t" + "Sriwijaya Air" + "\t\t" + "Jakarta" + "\t\t" + "RP 1.300.000");
        System.out.println("202" + "\t\t\t\t" + "Garuda Indonesia" + "\t" + "Jakarta" + "\t\t" + "RP 1.500.000");
        System.out.println("203" + "\t\t\t\t" + "Lion Air" + "\t\t\t" + "Jakarta" + "\t\t" + "RP 1.100.000");

        System.out.println(" ");
    }

    // pilihan ketiga
    private void medanPil(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Kode" + "\t\t\t" + "Nama" + "\t\t\t\t"+ "Kota" + "\t\t" + "Harga");
        System.out.println("Penerbangan " + "\t" +"Maskapai" + "\t\t\t" + "Tujuan" + "\t\t" + "Tiket");
        System.out.println("------------------------------------------------------------------");

        System.out.println("301" + "\t\t\t\t" + "Sriwijaya Air" + "\t\t" + "Medan" + "\t\t" + "RP 1.400.000");
        System.out.println("302" + "\t\t\t\t" + "Garuda Indonesia" + "\t" + "Medan" + "\t\t" + "RP 1.600.000");
        System.out.println("303" + "\t\t\t\t" + "Lion Air" + "\t\t\t" + "Medan" + "\t\t" + "RP 1.300.000");

        System.out.println(" ");
    }

    // pilihan keempat
    private void makassarPil(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Kode" + "\t\t\t" + "Nama" + "\t\t\t\t"+ "Kota" + "\t\t" + "Harga");
        System.out.println("Penerbangan " + "\t" +"Maskapai" + "\t\t\t" + "Tujuan" + "\t\t" + "Tiket");
        System.out.println("------------------------------------------------------------------");

        System.out.println("401" + "\t\t\t\t" + "Sriwijaya Air" + "\t\t" + "Makassar" + "\t\t" + "RP 1.100.000");
        System.out.println("402" + "\t\t\t\t" + "Garuda Indonesia" + "\t" + "Makassar" + "\t\t" + "RP 1.200.000");
        System.out.println("403" + "\t\t\t\t" + "Lion Air" + "\t\t\t" + "Makassar" + "\t\t" + "RP 900.000");

        System.out.println(" ");
    }

    // pilihan kelima
    private void exitPil(){
        System.out.println("Terima Kasih Telah Menggunakan Program Kami");
        System.exit(0);
    }

    // jika pilihan tidak ada di daftar
    private void elsePil(){
        System.out.println("Maaf Pilihan Tidak Ada di Daftar!");
        System.out.println("Silahkan Pilih Sesuai Pilihan yang Tersedia!");
        System.out.println(" ");
    }
}
