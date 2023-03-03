package FunctionalProgramming;

import java.util.List;

public class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode>episodes;

    public Season(String seasonName, int seasonNumber, List<Episode>episodes){
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    @Override //ctrl+o ehk code/generate
    public String toString() {
        return "A list of all season names: " + seasonName +
                "A list of all season numbers: " + seasonNumber +
                "A list of all episodes: " + episodes;
    }

}
