public class BuracoRedondo {
    private double raio;

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public boolean encaixa(PinoRedondo pino) {
        return pino.getRaio() <= raio;
    }
}