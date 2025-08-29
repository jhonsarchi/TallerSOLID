package figuras;

/*
Aquí se muestra como las clases trabajan juntas cumpliendo con los principios SOLID.
*/

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4, 6);

        Figura[] figuras = new Figura[] { rectangulo, circulo, triangulo };

        // Con la implementación del DIP, la CalculadoraAreas solo conoce la interfaz Figura
        // y puede trabajar con cualquier nueva figura sin cambios.
        CalculadoraAreas calculadora = new CalculadoraAreas();

        // Mostrar cálculo de áreas (responsabilidad de cada figura)
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        // Mostrar área total
        double total = calculadora.sumarAreas(figuras);
        System.out.println("Área total: " + total);
    }
}