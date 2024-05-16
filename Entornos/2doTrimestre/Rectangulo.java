

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del rectángulo:");
        double longitud = sc.nextDouble();
        System.out.println("Introduce la anchura del rectángulo:");
        double anchura = sc.nextDouble();
        double area = calcularArea(longitud, anchura);
        double perimetro = calcularPerimetro(longitud, anchura);
        System.out.println("El área del rectángulo es " + area);
        System.out.println("El perímetro del rectángulo es " + perimetro);
    }

    public static double calcularArea(double longitud, double anchura) {
        double area = longitud * anchura; 
        return area;
    }

    public static double calcularPerimetro(double longitud, double anchura) {
        double perimetro = 2 * (longitud + anchura);
        return perimetro;
    }
}
