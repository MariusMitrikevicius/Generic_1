// Spygliuočių abstrakti klasė
abstract class Spygliuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this.getClass().getSimpleName() + " turi spygliais.");
    }
}
