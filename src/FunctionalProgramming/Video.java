package FunctionalProgramming;

public class Video {
    public String title;
    public String url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType){
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "A list of all  videos: " + title +
                "A list of all url-s: " + url +
                "A list of all video types" + videoType;
    }
}
