package figuras;

/* Ejemplo de validación del Principio OCP: Se agrega esta nueva clase Triangulo
 que implementa Figura, asegurando que NO fue necesario modificar CalculadoraAreas.
 Eso demuestra que el sistema está abierto a la extensión (nuevas figuras),
 pero cerrado a la modificación.
*/

public class Triangulo implements Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}