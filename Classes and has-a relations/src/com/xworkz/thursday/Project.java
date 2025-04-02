package com.xworkz.thursday;

import static com.xworkz.thursday.PortType.USB_Port;

public class Project {
private Len lens;
private Lamp lamp;
private Port port;
private Wire wire;
private Board board;
private Button button;
private Pannel pannel;
private Remote remote;
private Screw screw;


    public  Project(Len lens, Lamp lamp, Port port, Wire wire, Button button, Board board, Pannel pannel, Remote remote, Screw screw) {
        this.lens=lens;
        this.lamp=lamp;
        this.port=port;
        this.wire=wire;
        this.board=board;
        this.button=button;
        this.pannel=pannel;
        this.remote=remote;
        this.screw=screw;
        }

        public void display()
        {
<<<<<<< HEAD

=======
>>>>>>> origin/main
            if(lens!=null)
            {
                lens.setLenType("Covext");
                lens.setLenSize("Large");
                System.out.println("Lense Type: "+lens.getLenType());
                System.out.println("Lense Size: "+lens.getLenSize());
            }else{
                System.out.println("Lense Null Value");
            }
<<<<<<< HEAD
            Lamp lamp = new Lamp();
=======
>>>>>>> origin/main
            if(lamp!=null)
            {
                lamp.displayLamp();
            }
            else
            {
                System.out.println("Lamp Null Value:");
            }
            if(port!=null)
            {
                port.setType(USB_Port);
                System.out.println("Port Type: "+port.getType());
            }else{
                System.out.println("Port Null");
            }
            if(wire!=null)
            {
                wire.displayWire();
            }else{
                System.out.println("NuLL Wire Runner");
            }
            if(board!=null)
            {
                board.displayBoard();
            }
            else {
                System.out.println("NULL Board:");
            }
            if(button!=null)
            {
                button.displayButton();
            }
            else{
                System.out.println("Null Button");
            }
            if(pannel!=null)
            {
                pannel.setPannelNumber(45);
                pannel.setPannelType("Solar");
                System.out.println("Pannel Number: "+pannel.getPannelNumber());
                System.out.println("Pannel Type: "+pannel.getPannelType());
            }else {
                System.out.println("Null Pannel");
            }
            if(remote!=null)
            {
                remote.displayRemote();
            }else {
                System.out.println("NULL REMOTE");
            }
            if(screw!=null)
            {
                screw.setScrewType("Star");
                screw.setScrewSize(45);
                System.out.println("Screw Type: "+screw.getScrewType());
                System.out.println("Screen Size: "+screw.getScrewSize());
            }

        }
    }


