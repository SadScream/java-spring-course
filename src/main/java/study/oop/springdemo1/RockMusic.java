package study.oop.springdemo1;

public class RockMusic implements Music {
    private RockMusic() {}

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
