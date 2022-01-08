package CircaSurviveBot.App;

import org.springframework.stereotype.Component;
import twitter4j.TwitterException;

import javax.annotation.PostConstruct;

@Component
public interface TwitterService {

    @PostConstruct
    void runTweetBot() throws TwitterException, InterruptedException;
}