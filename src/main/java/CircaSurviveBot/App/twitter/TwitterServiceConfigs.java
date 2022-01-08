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

@Component
public class TwitterServiceConfigs implements TwitterService {

    private static final String CONSUMER_KEY = System.getenv("CONSUMER_KEY");
    private static final String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    private static final String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    private static final String TOKEN_SECRET = System.getenv("TOKEN_SECRET");

    @Autowired
    Environment environment;

    private static Status postTweet(String message) throws TwitterException {
        Twitter twitter = getTwitterClient();
        return twitter.updateStatus(message);
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

    @PostConstruct
    public void runTweetBot() throws TwitterException {
        Lyric lyric = new LyricService().getLyric();
        Status status = null;
        try {
            System.out.println(lyric);
            status = postTweet(lyric.getLyric());
            Thread.sleep(43200000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(status.getCreatedAt());
        }
    }

}

