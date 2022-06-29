package CircaSurviveBot.App.Song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongService lyricService;

    @RequestMapping("/lyric")
    public Song getLyric() {
        return lyricService.getLyric();
    }

    @RequestMapping("/video")
    public String getvideo() {
        return lyricService.getVideo();
    }

    @RequestMapping("/lyrics")
    public List<Song> getAllLyrics() {
        return lyricService.getAllLyrics();
    }

}
