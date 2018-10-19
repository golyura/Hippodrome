import java.util.ArrayList;

public class Hippodrome {
    private static ArrayList<Horse> horses = new ArrayList<>();
    private static Hippodrome game;

    public static void main(String[] args) {
        game = getInstance();
        horses.add(new Horse("Milka", 3, 0));
        horses.add(new Horse("Laika", 3, 0));
        horses.add(new Horse("Sherdan", 3, 0));

        game.run();
        game.printWinter();

    }

    private void run() {
        if (horses != null && horses.size() != 0) {
            for (int i = 0; i < 50; i++) {
                for (Horse horse : horses) {
                    horse.move();
                    horse.print();
                    System.out.println("\n");
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static Hippodrome getInstance() {
        if (game == null) {
            game = new Hippodrome();
        }
        return game;
    }

    public Horse getWinter() {
        Horse winter;
        if (horses != null && horses.size() != 0) {
            winter = horses.get(0);
        } else return null;

        for (int i = 1; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > winter.getDistance()) {
                winter = horses.get(i);
            }
        }
        return winter;
    }

    public void printWinter() {
        if (getWinter() != null) {
            System.out.println("Winter horse with name " + getWinter().getName().toUpperCase() + "!!!");
        } else {
            System.out.println("no horses on the Ippodrom");
        }
    }


}
