package figuras;

/*
Se crea la interfaz Figura como una ABSTRACCIÓN.
 - Principio OCP (Abierto/Cerrado): El sistema se puede extender (agregar nuevas figuras)
   sin modificar la CalculadoraAreas.

 - Principio DIP (Inversión de Dependencias): La CalculadoraAreas (módulo de alto nivel)
   depende de esta interfaz y no de clases concretas (Rectangulo, Circulo, etc.).
*/

public interface Figura {
    double calcularArea();
}
