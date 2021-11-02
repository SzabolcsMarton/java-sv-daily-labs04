package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int yearOfPremier;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfPremier) {
        this.title = title;
        this.yearOfPremier = yearOfPremier;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int counter = 0;
        for (Actor actor: actors){
            if(yearOfPremier - actor.getYearOfBirth() >= 20 && yearOfPremier - actor.getYearOfBirth() < 30){
                counter++;
            }
        }
        return counter;
    }

}
