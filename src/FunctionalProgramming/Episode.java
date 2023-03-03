package FunctionalProgramming;

import java.util.List;

public class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video>videos;

    public Episode(String episodeName, int episodeNumber, List<Video>videos){
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }

    @Override //ctrl+o ehk code/generate
    public String toString() {
        return "A list of all episodes: " + episodeNumber +
                "A list of all episode names: " + episodeName +
                "A list of all videos: " + videos ;
    }
}
