package com.XWorkz.inheritence.Internal;

public class MovieTheater {
    public void movieName(Movie movie)
    {
        movie.movieLocation();
        movie.movieName();
        movie.rating();
        movie.heroName();
        movie.heroinName();
        if(movie instanceof ABCD)
        {
            ABCD abcd =(ABCD) movie;
            abcd.collection();
        }
        if(movie instanceof  Appu)
        {
            Appu appu =(Appu) movie;
        }
        if(movie instanceof Dragan)
        {
            Dragan dragan = (Dragan) movie;
        }
        if(movie instanceof Max)
        {
            Max max =(Max) movie;
        }
        if(movie instanceof Drama)
        {
            Drama drama =(Drama) movie;
        }
        if(movie instanceof Mad)
        {
            Mad mad =(Mad) movie;
        }
    }
}
