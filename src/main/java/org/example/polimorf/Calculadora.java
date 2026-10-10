package org.example.polimorf;

public class Calculadora {
    public double calcularArea(double lado) {
        return lado * lado;
    }
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    public double calcularArea(int raio) {
        return 3.13159 * raio * raio;
    }

    static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double areaQuadrado = calc.calcularArea(4);
        double areaRetangulo = calc.calcularArea(5, 3);
        double areaCirculo = calc.calcularArea(3);

        System.out.println("Area do quadrado (lado 4)" + areaQuadrado);
        System.out.println("Area do retangulo (base 5 e altura 3)" + areaRetangulo);
        System.out.println("Area do circulo (raio 3)" + areaCirculo);

    }

    }


