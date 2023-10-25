package study.oop.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(Genre genre) {
        String song = null;

        switch (genre) {
            case ROCK:
                List<String> rockSongs = this.rockMusic.getSongs();
                song = this.rockMusic.getSongs().get(new Random().nextInt(rockSongs.size()));
                break;
            case CLASSICAL:
                List<String> classicalSongs = this.classicalMusic.getSongs();
                song = this.classicalMusic.getSongs().get(new Random().nextInt(classicalSongs.size()));
                break;
        }

        return "Playing: " + song;
    }
}
