
public class FiguraGeometrica {

    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}