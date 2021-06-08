package pemesanantiketpesawat.data;

import java.util.*;

public class Loading {
    Thread t;


    public Loading() {
        processing();
        System.out.println(" ");

    }

    public void processing( ) {
        System.out.print("Loading---------");

        for (int i = 0 ; i <= 100 ; i++) {
            if (i < 10) {
                System.out.print(i + "%");
                System.out.print("\b\b");
            } else if (i >= 10 && i <= 99) {
                System.out.print(i + "%");
                System.out.print("\b\b\b");
            }
            if (i == 100) {
                System.out.println(i + "%");
            }
            try {
                t.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}