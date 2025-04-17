package com.Xworkz.External;

import com.Xworkz.Internal.Room;

public class RoomRulls implements Room {
    @Override
    public void rentRull() {
        System.out.println("Room Rent Rulls");
    }
    @Override
    public void cleanRulls() {
        System.out.println("Room Clean Rulls");

    }
    @Override
    public void lockRulls() {
        System.out.println("Room Lock Rulls");
    }

    @Override
    public void rules() {
        System.out.println("Rules");
    }
}
