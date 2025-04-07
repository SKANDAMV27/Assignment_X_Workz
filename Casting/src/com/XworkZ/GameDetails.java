package com.XworkZ;

public class GameDetails {
    public void details(FootBall footBall)
    {
        footBall.captionName();
        footBall.date();
        footBall.name();
        footBall.number();
        footBall.team();
        if(footBall instanceof Game)
        {
            Game game=(Game) footBall;
            game.rule();
        }
    }
}
