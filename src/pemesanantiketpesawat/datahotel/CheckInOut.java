package pemesanantiketpesawat.datahotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class CheckInOut {

    // variabel

    Calendar waktuSekarang = Calendar.getInstance();
//    Calendar waktuCheckIn;
//    Calendar waktuCheckOut;
    DateFormat dateCekin = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    DateFormat dateCekot = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    protected Date waktuCheckin;
    protected Date waktuCheckout;

    Scanner sc = new Scanner(System.in);
    protected int checkIn;
    protected int checkOut;
    protected int durasi;

    //constructor
    public CheckInOut(){

        pengecekanCekinCekot();
        setCheckInOut();
        durasiMenginap();
        System.out.println(" ");
    }


    //pengecekan cekin cekot
    public CheckInOut pengecekanCekinCekot(){
        System.out.println(" ");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Waktu Sekarang " + dateFormat.format(waktuSekarang.getTime()));
        System.out.println("------------------------------------");
        System.out.print("Silahkan Masukkan tanggal Check-in  : ");
        this.checkIn = sc.nextInt();
        System.out.print("Silahkan Masukkan Tanggal Check-out : ");
        this.checkOut = sc.nextInt();
        if (this.checkIn > this.checkOut){
            System.out.println("Tanggal Check-in Tidak Boleh < Tanggal Check-out");
            return pengecekanCekinCekot();
        }
        return null;
    }


    // method set durasi menginap
    public void durasiMenginap(){
        this.durasi = this.checkOut - this.checkIn;
    }

    //method mengatur jam cekin dan cekot
    public void setCheckInOut(){
        // mengatur waktu check-in
//        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar waktuCheckIn = Calendar.getInstance();
        waktuCheckIn.set(Calendar.DAY_OF_MONTH, this.checkIn);
        waktuCheckIn.set(Calendar.HOUR_OF_DAY, 12);
        waktuCheckin = waktuCheckIn.getTime();
        dateCekin.format(waktuCheckin);

        // mengatur waktu check-out
//        DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar waktuCheckOut = Calendar.getInstance();
        waktuCheckOut.set(Calendar.DAY_OF_MONTH, this.checkOut);
        waktuCheckOut.set(Calendar.HOUR_OF_DAY, 12);
        waktuCheckout = waktuCheckOut.getTime();
        dateCekot.format(waktuCheckout);
    }

}
