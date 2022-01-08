package CircaSurviveBot.App.lyric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LyricController {

    @Autowired
    private LyricService lyricService;

    @RequestMapping("/lyric")
    public Lyric getLyric() {
        return lyricService.getLyric();
    }

    @RequestMapping("/lyrics")
    public List<Lyric> getAllLyrics() {
        return lyricService.getAllLyrics();
    }

}
