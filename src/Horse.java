import java.util.Random;

public class Horse {
    private String name;
    private double distance;
    private double speed;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move() {
        distance += speed * Math.random();
    }

    public void print() {

        for (int i = 0; i < distance; i++) {
            System.out.print(".");
        }
        System.out.print(name);
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
