package com.Xworkz.Assignment;

public class Pushpa {
    Clip clip;
    Pushpa(Clip clip){
        this.clip=clip;
    }

    void useClip(Clip[] clips) {
        if (clip != null) {
            for (Clip clip : clips) {
                this.clip.hold();
            }
        }
        else{
                System.out.println("Clip Null");
            }


    }
}
