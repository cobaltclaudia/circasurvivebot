package lyric;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Service
public class LyricService {

    private final List<Lyric> lyrics = Arrays.asList(

            new Lyric("Dance with me for I'll be leaving soon"),
            new Lyric("Time takes its toll on us"),
            new Lyric("You never see the things you have"),
            new Lyric("You can’t control what has happen to your heart, till you give it away"),
            new Lyric("Leave as fast you came, no invitation. Nowhere to go from here"),
            new Lyric("Would you trade your soul for gold?"),
            new Lyric("Always begin before you'd ever prepare, never think twice about"),
            new Lyric("You're like a problem I could never rectify"),
            new Lyric("Never underestimate the daylight"),
            new Lyric("Just keep drinking water and you'll be alright"),
            new Lyric("Everyway you wonder if you're wrong"),
            new Lyric("It starts out like a season in reverse"),
            new Lyric("Too much all at once that's how you got so ungrateful"),
            new Lyric("Just shut your mouth")

    );

    public Lyric getLyric() {
        Random random = new Random();
        int rand = random.nextInt(lyrics.size());
        return lyrics.get(rand);
    }

}
