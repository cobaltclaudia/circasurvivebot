package CircaSurviveBot.App.twitter;

import CircaSurviveBot.App.lyric.Lyric;
import CircaSurviveBot.App.lyric.LyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@Component
public class TwitterServiceConfigs implements TwitterService {

    private static final String CONSUMER_KEY = System.getenv("CONSUMER_KEY");
    private static final String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    private static final String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    private static final String TOKEN_SECRET = System.getenv("TOKEN_SECRET");

    @Autowired
    Environment environment;

    @PostConstruct
    public void runTweetBot() throws TwitterException {

        Lyric lyric = new LyricService().getLyric();
        Iterator<Status> iterator = getTwitterClient().getUserTimeline().listIterator();
        System.out.println("Queued up lyric: "+lyric.getLyric());
        if(!duplicate(lyric,iterator) && timeToPost()) {
            System.out.println("postTweet: "+ lyric.getLyric());
            postTweet(lyric.getLyric());
        }
    }

    private static void postTweet(String message) throws TwitterException {
        Twitter twitter = getTwitterClient();
        twitter.updateStatus(message);
    }

    private static Twitter getTwitterClient() {
        TwitterFactory twitterFactory = new TwitterFactory(getConfiguration());
        return twitterFactory.getInstance();
    }

    private static Configuration getConfiguration() {
        return new ConfigurationBuilder()
                .setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TOKEN_SECRET)
                .build();
    }

    private boolean timeToPost() throws TwitterException {
        if (getTimeDiff(getLastTweet().getCreatedAt()) >= TimeUnit.HOURS.toMillis(4)) {
            System.out.println("Time to post.");
            return true;
        }
        System.out.println("Still need to wait.");
        return false;
    }

    private boolean duplicate(Lyric lyric, Iterator<Status> iterator) {
        int duplicateLimit = 5;
        for (int i = 0; i <= duplicateLimit; i++) {
            String postedLyric = iterator.next().getText();
            if(lyric.getLyric().equals(postedLyric)){
                System.out.println( i+": "+postedLyric);
                System.out.println("Duplicate found");
                return true;
            }
        }
        System.out.println("Duplicate not found.");
        return false;
    }

    private long getTimeDiff(Date lastTweetDate) {
        return new Date().getTime() - lastTweetDate.getTime();
    }

    private Status getLastTweet() throws TwitterException {
        Twitter twitter = getTwitterClient();
        twitter.timelines().getUserTimeline();
        return twitter.timelines().getUserTimeline().get(0);
    }

}

