public class Main {
    public static void main(String[] args) {
        Medis azuolas = new Azuolas();
        Medis berzas = new Berzas();
        Medis egle = new Egle();
        Medis pusis = new Pusis();
        Medis kadagys = new Kadagys();

        azuolas.turi(); // Azuolas turi lapus.
        berzas.turi();   // Berzas turi lapus.
        egle.turi();     // Egle turi spygliais.
        pusis.turi();    // Pusis turi spygliais.
        kadagys.turi();  // Kadagys turi spygliais.
    }
}