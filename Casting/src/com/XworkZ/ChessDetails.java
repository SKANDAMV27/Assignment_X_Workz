package com.XworkZ;

public class ChessDetails {
    public void Details(Chess chess)
    {
        chess.branch();
        chess.code();
        chess.email();
        chess.managerName();
        chess.name();
        if(chess instanceof IndoorGame)
        {
            IndoorGame indoorGame =(IndoorGame) chess;
            indoorGame.Pan();
        }
    }
}
