package CircaSurviveBot.App.lyric;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
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
            new Lyric("Just shut your mouth"),
            new Lyric("Move one inch at a time, don't make shit rhyme"),
            new Lyric("I siphon from you in ways I'm not"),

            //Always get what you want
            new Lyric("Do you often look back on us, feeling confidently?"),
            new Lyric("It's the talent, not the promo shots"),
            new Lyric("Story has shown you all felt alone."),

            //child of the desert
            new Lyric("All we have is somewhere to begin"),
            new Lyric("Child of the desert, never had a name, climax on the concept of eliminating pain"),
            new Lyric("Oh, all you save, dare I say, just give it away"),
            new Lyric("Not sure how to make it real, how to take my time, how to come alive, I don't want to feel a thing, I don't want to know"),

            new Lyric("I can feel the difference in what you make")
    );

    public List<Lyric> getAllLyrics() {
        return lyrics;
    }

    public Lyric getLyric() {
        Random random = new Random();
        int rand = random.nextInt(lyrics.size());
        return lyrics.get(rand);
    }

}
