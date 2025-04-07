package com.XworkZ;

public class RoomDetails {
    public void Details(Room room)
    {
        room.Big();
        room.Dry();
        room.Big();
        room.Clean();
        room.small();
        room.washroom();
        if(room instanceof BedRoom)
        {
            BedRoom bedRoom =(BedRoom) room;
            bedRoom.room();
        }
    }

}
