import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FiguraGeometricaTest {

    @Test
    void testAreaRectangulo() {
        // Arrange
        FiguraGeometrica figura = new FiguraGeometrica();

        // Act
        double resultado = figura.areaRectangulo(3, 7);

        // Assert
        assertEquals(21, resultado, 0.001);
    }

    @Test
    void testAreaCirculo() {
        // Arrange
        FiguraGeometrica figura = new FiguraGeometrica();

        // Act
        double resultado = figura.areaCirculo(4);

        // Assert
        assertEquals(50.265, resultado, 0.001);
    }

    @Test
    void testAreaTriangulo() {
        // Arrange
        FiguraGeometrica figura = new FiguraGeometrica();

        // Act
        double resultado = figura.areaTriangulo(5, 8);

        // Assert
        assertEquals(20, resultado, 0.001);
    }
}