// Lapuočių abstrakti klasė
abstract class Lapuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this.getClass().getSimpleName() + " turi lapus.");
    }
}
