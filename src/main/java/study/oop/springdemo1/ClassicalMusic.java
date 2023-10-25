package study.oop.springdemo1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = Arrays.asList("Hungarian Rhapsody", "Ave Maria", "Bolero");
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
