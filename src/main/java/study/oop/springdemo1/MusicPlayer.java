package study.oop.springdemo1;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList = null;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Music music = this.musicList.get(new Random().nextInt(this.musicList.size()));
        return "Playing: " + music.getSong();
    }
}
