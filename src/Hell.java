import java.util.ArrayList;

public class Hell {

    int temperature;

    int numberOfDemons;

    String luciferName;

    ArrayList<Demon> demons = new ArrayList<>();

    public Hell(int temperature, int numberOfDemons, String luciferName) {
        this.temperature = temperature;
        this.numberOfDemons = numberOfDemons;
        this.luciferName = luciferName;
    }

    public static class Demon implements HolyCreature {

        int numOfPunishments;

        String typeOfPunishments;

        String name;

        public Demon(int numOfPunishments, String typeOfPunishments, String name) {
            this.numOfPunishments = numOfPunishments;
            this.typeOfPunishments = typeOfPunishments;
            this.name = name;
        }

        @Override
        public void fly() {
            System.out.println("A demon is flying");
        }

        @Override
        public void fight() {
            System.out.println("Demons fight");
        }

        @Override
        public void info() {
            System.out.println("I'm demon " + this.name + " and my punishment is " + this.typeOfPunishments);
        }

    }

    public Demon addDemon(int numOfPunishments, String typeOfPunishments, String name) {
        Demon demon = new Demon(numOfPunishments, typeOfPunishments, name);
        demons.add(demon);
        return demon;
    }
}
