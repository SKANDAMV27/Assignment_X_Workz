package com.XWorkz.assignments;

public class Room {
    String roomName="Yoyo";
    int roomNumber=452;
    String roomLocation="RR Nagar";
    String roomSize="Aar";
    public void Room(String roomName,int roomNumber,String roomLocation,String roomSize)
    {
        this.roomLocation=roomLocation;
        this.roomName=roomName;
        this.roomNumber=roomNumber;
        this.roomSize=roomSize;
    }
    void displayRoom()
    {
        System.out.println("Room Details: ");
        System.out.println("Room Name: "+roomName);
        System.out.println("Room Location: "+roomLocation);
        System.out.println("Room Size: "+roomSize);
    }
}
