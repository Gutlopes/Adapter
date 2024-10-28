public class PinoRedondoConcreto implements PinoRedondo {
    private double raio;

    public PinoRedondoConcreto(double raio) {
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return raio;
    }
}
