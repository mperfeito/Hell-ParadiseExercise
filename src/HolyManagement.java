public class HolyManagement {

    public static void main(String[] args) {

        Hell hell = new Hell(1000, 800, "Devil");
        Paradise paradise = new Paradise(true);
        Paradise.Angel marika = paradise.addAngel("FancyAngel", "Marika");
        Hell.Demon ozuna = hell.addDemon(5, "Torture", "Ozuna");
        marika.fly();
        ozuna.info();
        marika.info();
        ozuna.fight();

    }
}
