package study.oop.springdemo1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = Arrays.asList("Wind cries Mary", "Rock You", "American Girl");;

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
