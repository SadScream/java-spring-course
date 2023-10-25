package study.oop.springdemo1;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("singleton")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doInit() {
        System.out.println("Do init classical");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Do destroy classical");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
