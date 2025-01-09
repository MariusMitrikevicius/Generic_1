// Spygliuočių abstrakti klasė
abstract class Spygliuotis implements Medis {
    @Override
    public void turi() {
        // Įgyvendiname "turi" metodą, kuris nurodo, kad spygliuočiai turi spyglius
        System.out.println(this.getClass().getSimpleName() + " turi spyglius.");
    }
}
