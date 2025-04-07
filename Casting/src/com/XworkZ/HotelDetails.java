package com.XworkZ;

public class HotelDetails {
    public void Details(Hotel hotel){
        hotel.dosa();
        hotel.menu();
        hotel.business();
        hotel.plate();
        hotel.supplear();
        if(hotel instanceof Canteen)
        {
            Canteen canteen = (Canteen) hotel;
            canteen.name();
        }

    }
}
