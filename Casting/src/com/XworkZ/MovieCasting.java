package com.XworkZ;

public class MovieCasting {
    public void Movie(Movie movie)
    {
        movie.movieLocation();
        movie.movieName();
        movie.heroinName();
        movie.heroName();
        movie.movieLocation();
        if(movie instanceof Arasu)
        {
            Arasu arasu = (Arasu) movie;
            arasu.Collection();
        }
    }

}
