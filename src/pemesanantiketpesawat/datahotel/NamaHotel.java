package pemesanantiketpesawat.datahotel;

public class NamaHotel {

    // variabel
    KotaHotel kotaHotelNamaHotel = null;
    PilihHotel pilihHotelNamaHotel = null;
    private String namaHotel;

    // constructor


    public NamaHotel(KotaHotel kotaHotelNamaHotel, PilihHotel pilihHotelNamaHotel) {
        this.kotaHotelNamaHotel = kotaHotelNamaHotel;
        this.pilihHotelNamaHotel = pilihHotelNamaHotel;
        pengecekanHotel();
    }

    // method pengecekan
    public void pengecekanHotel(){

        if (kotaHotelNamaHotel.getKotaTujuan() == "Bandung"){
            if (pilihHotelNamaHotel.getKodeHotel() == 1){
                setNamaHotel("Grand Tjokro Premiere Bandung");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 2){
                setNamaHotel("Ibis Trans Studio");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 3){
                setNamaHotel("The Luxury Hotel Bandung");
            } else {
                System.out.println(" ");
                System.out.println("Pilihan Salah Program Berhenti!");
                System.exit(0);
            }
        } else if (kotaHotelNamaHotel.getKotaTujuan() == "Jakarta"){
            if (pilihHotelNamaHotel.getKodeHotel() == 1){
                setNamaHotel("Ascott Sudirman Jakarta");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 2){
                setNamaHotel("Four Seasons Hotel Jakarta");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 3){
                setNamaHotel("The Ritz-Carlton Jakarta");
            } else {
                System.out.println(" ");
                System.out.println("Pilihan Salah Program Berhenti!");
                System.exit(0);
            }
        } else if (kotaHotelNamaHotel.getKotaTujuan() == "Medan"){
            if (pilihHotelNamaHotel.getKodeHotel() == 1){
                setNamaHotel("JW Marriott Hotel Medan");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 2){
                setNamaHotel("Swiss-Berlin Medan");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 3){
                setNamaHotel("De'Tonga Hotel");
            } else {
                System.out.println(" ");
                System.out.println("Pilihan Salah Program Berhenti!");
                System.exit(0);
            }
        } else if (kotaHotelNamaHotel.getKotaTujuan() == "Makassar"){
            if (pilihHotelNamaHotel.getKodeHotel() == 1){
                setNamaHotel("The Rinra Hotel");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 2){
                setNamaHotel("Arthama Hotels Makassar");
            } else if (pilihHotelNamaHotel.getKodeHotel() == 3){
                setNamaHotel("Four Points by Sheraton Makassar");
            } else {
                System.out.println(" ");
                System.out.println("Pilihan Salah Program Berhenti!");
                System.exit(0);
            }
        } else {
            System.out.println(" ");
            System.out.println("Pilihan Salah Silahkan Pilih Hotel [1-5] yg tersedia!");
            System.exit(0);
        }

    }

    // getter setter nama hotel

    public String getNamaHotel() {
        return namaHotel;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }
}
