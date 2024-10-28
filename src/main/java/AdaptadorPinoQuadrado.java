public class AdaptadorPinoQuadrado implements PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {

        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        // Raio equivalente para um pino quadrado
        return (pinoQuadrado.getLargura() * Math.sqrt(2)) / 2;
    }
}