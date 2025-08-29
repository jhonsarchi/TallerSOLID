package figuras;

/* Principio DIP y OCP aplicados:
 - DIP: CalculadoraAreas depende de la abstracción Figura y no de clases concretas
   como Rectangulo, Circulo o Triangulo, etc.
 - OCP: No es necesario modificar este código para soportar nuevas figuras.
   Se usa polimorfismo (llamando a calcularArea) para que cada figura se encargue
   de sí misma.
*/

public class CalculadoraAreas {

    public double sumarAreas(Figura[] figuras) {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea(); // Polimorfismo
        }
        return areaTotal;
    }
}