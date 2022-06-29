package CircaSurviveBot.App.lyric;

public class Song {

    private String lyric= "";
    public String video= "";

    public Song(String lyric) {
        this.lyric = lyric;
        this.video = getVideo();
    }

    public String getLyric(){
        return lyric;
    }

    public String getVideo(){
        return video;
    }

}
