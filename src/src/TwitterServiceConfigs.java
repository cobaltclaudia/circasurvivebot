import io.javabrains.springbootstarter.lyric.LyricService;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import javax.annotation.PostConstruct;

@Component
public class TwitterServiceConfigs {

    private static final String CONSUMER_KEY = System.getenv("CONSUMER_KEY");
    private static final String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    private static final String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    private static final String TOKEN_SECRET = System.getenv("TOKEN_SECRET");

    @PostConstruct
    public static void runBot() throws TwitterException {
        String lyric = new LyricService().getLyric().getLyric();
        System.out.println(lyric);
        postTweet(lyric);
    }

    private static void postTweet(String message) throws TwitterException {
        TwitterFactory twitterFactory = new TwitterFactory(getConfiguration());
        Twitter twitter = twitterFactory.getInstance();
        Status status = twitter.updateStatus(message);
        System.out.println(status);
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

}

