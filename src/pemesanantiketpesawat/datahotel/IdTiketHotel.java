package pemesanantiketpesawat.datahotel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IdTiketHotel {

    // variabel
    TamuHotel tamuHotelId = null;
    protected String idTiketHotel;
    List<String> daftarRandomCharHotel = new ArrayList<>();


    // constructor
    public IdTiketHotel(TamuHotel tamuHotelId) {
        this.tamuHotelId = tamuHotelId;

        idTiketHotel();
    }

    // method pembuatan id
    public void idTiketHotel(){
        for (int i = 0; i < tamuHotelId.kamarHotel; i++){
            idTiketHotel = UUID.randomUUID().toString();
            daftarRandomCharHotel.add(idTiketHotel);
        }
    }
}
