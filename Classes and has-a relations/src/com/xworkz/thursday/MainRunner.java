package com.xworkz.thursday;

public class MainRunner {
    public static void main(String... args)
    {
        Len len=new Len();
        Lamp lamp = new Lamp();
        Port port = new Port();
        Wire wire = new Wire();
        Button button = new Button();
        Board board = new Board();
        Pannel pannel = new Pannel();
        Remote remote = new Remote();
        Screw screw = new Screw();


        Project project = new Project(len,lamp,port,wire,button,board,pannel,remote,screw);
        project.display();
    }
}
