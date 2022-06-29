package CircaSurviveBot.App.lyric;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class SongService {

    public final List<String> videos = Arrays.asList(

            new String("https://www.youtube.com/watch?v=RfbnSb8kFkI"), // schema
            new String("https://www.youtube.com/watch?v=zX_ko50O6gI"), // get out
            new String("https://www.youtube.com/watch?v=F7mLdK-qDHE"), // imaginary enemy
            new String("https://www.youtube.com/watch?v=9f1hkyqKHNs"), // lustration
            new String("https://www.youtube.com/watch?v=uRuRYqzOaVI"), // act appalled
            new String("https://www.youtube.com/watch?v=oWYaTxWZt68"), // prem of hex
            new String("https://www.youtube.com/watch?v=ri3QahSZlus"), // child of desert
            new String("https://www.youtube.com/watch?v=tuPHC5XUAr0"), // amulet
            new String("https://www.youtube.com/watch?v=58HY9OCLx40"), // rites of investiture
            new String("https://www.youtube.com/watch?v=YIJxyEMoWCM"), // suitcase
            new String("https://www.youtube.com/watch?v=LjLJf8YIZmU"), // in fear & faith
            new String("https://www.youtube.com/watch?v=4WYtInVfMsQ"), // only the sun
            new String("https://www.youtube.com/watch?v=hYw_WodzORs"), // sharp practice
            new String("https://www.youtube.com/watch?v=YhLm4JgXd5Q"), // diff between
            new String("https://www.youtube.com/watch?v=wtBYJUjbgIk"), // imposter syndrome
            new String("https://www.youtube.com/watch?v=X3dmhS6Fj6Y"), // electric moose
            new String("https://www.youtube.com/watch?v=Sy2-T08yvWs")  // flesh and bone
    );

    private final List<Song> lyrics = Arrays.asList(
            // TODO improve cataloging
            // JUTURNA - 20050419
            //20050419-06-001
            new Song("Time takes its toll on us"),
            //20050419-07-000-stop the fucking car
            new Song("We've made mistakes like this, and I'm just learning."),
            new Song("Don't stop talking to me, I haven't been listening."),
            //20050419-10-000-always get what you want
            new Song("Do you often look back on us, feeling confidently?"),
            new Song("It's the talent, not the promo shots"),
            new Song("Story has shown you all felt alone."),
            //20050419-11-001- meet me in montauk
            new Song("Leave as fast you came, no invitation. Nowhere to go from here"),
            //20050419-12-001 - house of leaves
            new Song("So soft spoken and shy, never gets high anymore"),

            //ON LETTING GO - 20070529
            new Song("It starts out like a season in reverse"),
            new Song("Move one inch at a time, don't make shit rhyme"),
            new Song("We disconnect, like this is the end."),
            //20070529-05-000 - mandala
            new Song("Dance with me for I'll be leaving soon"),
            //20070529-01-000 - living together
            new Song("Would you trade your soul for gold?"),
            new Song("For your futures sake, I've got advice I'd advise you to take"),
            //20070529-04-000 - diff between drug and meds
            new Song("Just keep drinking water and you'll be alright"),
            //20070529-03-000 - the greatest lie
            new Song("We believe in something invisible"),

            //VIOLENT WAVES - 20120828
            //20120828-02-001 - sharp practice
            new Song("You can’t control what has happen to your heart, till you give it away"),

            //BLUE SKY NOISE - 20100420
            new Song("Never underestimate the daylight"),
            new Song("Too much all at once that's how you got so ungrateful"),

            //DESCENSUS - 20141124
            new Song("Just shut your mouth"),
            //20141124-02-000 - child of the desert
            new Song("All we have is somewhere to begin"),
            new Song("Child of the desert, never had a name, climax on the concept of eliminating pain"),
            new Song("Oh, all you save, dare I say, just give it away"),
            new Song("Not sure how to make it real, how to take my time, how to come alive."),
            //20141124-03-001 - always begin
            new Song("Always begin before you'd ever prepare, never think twice about"),
            //20141124-08-000 - phantom
            new Song("You're like a problem I could never rectify"),

            //APPENDAGE - 20170601
            new Song("Everyway you wonder if you're wrong"),

            //THE AMULET - 20170922
            //20170922-02-001 - never tell a soul
            new Song("I siphon from you in ways I'm not"),
            //20170922-03-001-prem of hex
            new Song("You never see the things you have"),
            new Song("And I heard you claim to be something like an expert in pain, so lets make believe"),

            //A DREAM ABOUT LOVE - 20211022
            //20211022-03-001-our last shot
            new Song("I can feel the difference in what you make"),
            new Song("American is burning from the inside out"),
            new Song("You make it seem like you're the good guy all the time"),
            new Song("The future's silent when you love nothing"),
            new Song("Don't hesitate this might become just how it all was meant to end")

    );

    public List<Song> getAllLyrics() {
        return lyrics;
    }

    public Song getLyric() {
        Random random = new Random();
        int rand = random.nextInt(lyrics.size());
        return lyrics.get(rand);
    }


    public String getVideo(){
        Random random = new Random();
        int rand = random.nextInt(videos.size());
        return videos.get(rand);
    }

}
