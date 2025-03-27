package com.Xworkz.wedAss;

public class Watch {
    static final String brandName;
    private WatchType watchType;

    void Watch(WatchType watchType)
    {
        this.watchType=watchType;
    }
    static {
        System.out.println("Watch static Runner");
        brandName="Fastrack";
    }

    public WatchType getWatchTypee() {
        return this.watchType;
    }
    public void setWatchType(WatchType watchType)
    {
        this.watchType=watchType;
    }

}
