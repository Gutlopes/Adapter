public class Principal {
    public static void main(String[] args) {
        // Criar um buraco redondo de raio 5
        BuracoRedondo buraco = new BuracoRedondo(5);

        // Pino redondo de raio 5
        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo de raio 5 encaixa? " + buraco.encaixa(pinoRedondo));  // true

        // Pino redondo de raio
        PinoRedondoConcreto pinoRedondoMaior = new PinoRedondoConcreto(6);
        System.out.println("Pino redondo de raio 6 encaixa? " + buraco.encaixa(pinoRedondoMaior));  // false

        // Pino quadrado de largura 5
        PinoQuadrado pinoQuadrado = new PinoQuadrado(5);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado de largura 5 adaptado encaixa? " + buraco.encaixa(adaptador));  // true

        // Pino quadrado de largura 10
        PinoQuadrado pinoQuadradoMaior = new PinoQuadrado(10);
        AdaptadorPinoQuadrado adaptadorMaior = new AdaptadorPinoQuadrado(pinoQuadradoMaior);
        System.out.println("Pino quadrado de largura 10 adaptado encaixa? " + buraco.encaixa(adaptadorMaior));  // false
    }
}
