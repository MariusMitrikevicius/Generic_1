// Lapuočių abstrakti klasė
abstract class Lapuotis implements Medis {
    @Override
    public void turi() {
        // Įgyvendiname "turi" metodą, kuris nurodo, kad lapuočiai turi lapus
        System.out.println(this.getClass().getSimpleName() + " turi lapus.");
    }
}
