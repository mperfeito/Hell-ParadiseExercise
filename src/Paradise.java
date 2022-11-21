import java.util.ArrayList;

public class Paradise {

    boolean openGates;

    static String weather = "clean";

    ArrayList<Angel> angels = new ArrayList<>();

    public Paradise(boolean openGates) {
        this.openGates = openGates;

    }

    public static class Angel implements HolyCreature{
        String type;
        String name;
        public Angel(String type, String name) {
            this.type = type;
            this.name = name;
        }
        @Override
        public void fly() {
            System.out.println("A angel is flying");
        }
        @Override
        public void fight() {
            System.out.println("Angles fight");
        }
        public void miracle(){
            System.out.println("A miracle is happening");
        }
        public void info(){
            System.out.println("I'm angel " + this.name + " and the weather is " + weather);
        }
    }

    public Angel addAngel(String type, String name) {
        Angel angel = new Angel(type, name);
        angels.add(angel);
        return angel;
    }

}
