package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IMCCalculator {


    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    public static double pesoIdealAdulto(double altura) {
        return 22 * (altura * altura);
    }

    public static double pesoIdealCrianca(int idade) {
        double[] pesoIdeal = {
                9.0, 11.4,
                13.1, 16.5,
                15.4, 19.4,
                17.7, 22.7,
                20.0, 26.0,
                22.5, 30.5
        };
        return pesoIdeal[idade - 2];
    }
}

class IMCCalculatorTest {

    @Test
    void testCalcularIMC() {
        assertEquals(25.0, IMCCalculator.calcularIMC(70, 1.67), 0.01);
    }

    @Test
    void testClassificarIMC() {
        assertEquals("Sobrepeso", IMCCalculator.classificarIMC(27.5));
    }

    @Test
    void testPesoIdealAdulto() {
        assertEquals(58.8, IMCCalculator.pesoIdealAdulto(1.63), 0.1);
    }

    @Test
    void testPesoIdealCrianca() {
        assertEquals(9.0, IMCCalculator.pesoIdealCrianca(2), 0.1);
        assertEquals(11.4, IMCCalculator.pesoIdealCrianca(2), 0.1);
        assertEquals(13.1, IMCCalculator.pesoIdealCrianca(4), 0.1);
        assertEquals(16.5, IMCCalculator.pesoIdealCrianca(4), 0.1);
        assertEquals(15.4, IMCCalculator.pesoIdealCrianca(6), 0.1);
        assertEquals(19.4, IMCCalculator.pesoIdealCrianca(6), 0.1);
        assertEquals(17.7, IMCCalculator.pesoIdealCrianca(8), 0.1);
        assertEquals(22.7, IMCCalculator.pesoIdealCrianca(8), 0.1);
        assertEquals(20.0, IMCCalculator.pesoIdealCrianca(10), 0.1);
        assertEquals(26.0, IMCCalculator.pesoIdealCrianca(10), 0.1);
        assertEquals(22.5, IMCCalculator.pesoIdealCrianca(12), 0.1);
        assertEquals(30.5, IMCCalculator.pesoIdealCrianca(12), 0.1);
    }
}