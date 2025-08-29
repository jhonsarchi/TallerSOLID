package figuras;

// También aplica SRP: el círculo se encarga únicamente de su área
// usando su radio. No conoce nada de la calculadora.

public class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() { return radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}