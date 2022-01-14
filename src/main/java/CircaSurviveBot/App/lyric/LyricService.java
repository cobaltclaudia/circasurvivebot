package CircaSurviveBot.App.lyric;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class LyricService {

    private final List<Lyric> lyrics = Arrays.asList(
            // TODO improve cataloging
            // JUTURNA - 20050419
            //20050419-06-001
            new Lyric("Time takes its toll on us"),
            //20050419-07-000-stop the fucking car
            new Lyric("We've made mistakes like this, and I'm just learning."),
            new Lyric("Don't stop talking to me, I haven't been listening."),
            //20050419-10-000-always get what you want
            new Lyric("Do you often look back on us, feeling confidently?"),
            new Lyric("It's the talent, not the promo shots"),
            new Lyric("Story has shown you all felt alone."),
            //20050419-11-001- meet me in montauk
            new Lyric("Leave as fast you came, no invitation. Nowhere to go from here"),
            //20050419-12-001 - house of leaves
            new Lyric("So soft spoken and shy, never gets high anymore"),

            //ON LETTING GO - 20070529
            new Lyric("It starts out like a season in reverse"),
            new Lyric("Move one inch at a time, don't make shit rhyme"),
            new Lyric("We disconnect, like this is the end."),
            //20070529-05-001 - mandala
            new Lyric("Dance with me for I'll be leaving soon"),
            //20070529-01-001 - living together
            new Lyric("Would you trade your soul for gold?"),
            new Lyric("For your futures sake, I've got advice I'd advise you to take"),
            //20070529-04-001 - diff between drug and meds
            new Lyric("Just keep drinking water and you'll be alright"),

            //VIOLENT WAVES - 20120828
            //20120828-02-001 - sharp practice
            new Lyric("You can’t control what has happen to your heart, till you give it away"),

            //BLUE SKY NOISE - 20100420
            new Lyric("Never underestimate the daylight"),
            new Lyric("Too much all at once that's how you got so ungrateful"),

            //DESCENSUS - 20141124
            new Lyric("Just shut your mouth"),
            //20141124-02-000 - child of the desert
            new Lyric("All we have is somewhere to begin"),
            new Lyric("Child of the desert, never had a name, climax on the concept of eliminating pain"),
            new Lyric("Oh, all you save, dare I say, just give it away"),
            new Lyric("Not sure how to make it real, how to take my time, how to come alive."),
            //20141124-03-001 - always begin
            new Lyric("Always begin before you'd ever prepare, never think twice about"),
            //20141124-08-000 - phantom
            new Lyric("You're like a problem I could never rectify"),

            //APPENDAGE - 20170601
            new Lyric("Everyway you wonder if you're wrong"),

            //THE AMULET - 20170922
            //20170922-02-001 - never tell a soul
            new Lyric("I siphon from you in ways I'm not"),
            //20170922-03-001-prem of hex
            new Lyric("You never see the things you have"),

            //A DREAM ABOUT LOVE - 20211022
            //20211022-03-001-our last shot
            new Lyric("I can feel the difference in what you make"),
            new Lyric("The future's silent when you love nothing")
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
