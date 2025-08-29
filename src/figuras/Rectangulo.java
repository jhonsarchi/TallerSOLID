package figuras;

/*
Principio SRP (Responsabilidad Única): La clase Rectangulo solo se encarga de gestionar
 sus propios atributos (ancho, alto) y de calcular su área. No se mezcla con lógica
 de otras clases ni con la calculadora.
*/

public class Rectangulo implements Figura {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() { return ancho; }
    public double getAlto() { return alto; }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
