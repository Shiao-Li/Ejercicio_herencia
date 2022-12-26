import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scn.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = scn.nextInt();
        Rectangulo rectangulo = new Rectangulo(altura , base);
        /*rectangulo.setX(15);
        rectangulo.setY(25);*/
        System.out.println(rectangulo.getPerimetro());
        System.out.println(rectangulo.getArea());

        System.out.print("Ingrese un lado: ");
        double lado = scn.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        /*cuadrado.setX(4);
        cuadrado.setY(4);*/
        System.out.println(cuadrado.getPerimetro());
        System.out.println(cuadrado.getArea());


        /*
        System.out.println("--------------------------------------");
        ColorTriangulo colorTriangulo = new ColorTriangulo("Azul", "Estilo x", 8.5, 4.2);
        ColorTriangulo colorTriangulo1 = new ColorTriangulo("Rojo", "Estilo y", 4.12, 9.36);
        colorTriangulo.mostarEstilo();
        colorTriangulo.mostrarColor();
        colorTriangulo.mostrarDimension();
        System.out.println("Area: " + colorTriangulo.area());
        System.out.println("--------------------------------------");
        colorTriangulo1.mostarEstilo();
        colorTriangulo1.mostrarColor();
        colorTriangulo1.mostrarDimension();
        System.out.println("Area: " + colorTriangulo1.area());
        */

        System.out.println("----------------------------");
        System.out.print("Ingrese el lado 1: ");
        double lado1 = scn.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2 = scn.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double lado3 = scn.nextDouble();
        System.out.print("Ingrese la base 1: ");
        double baseT = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaT = scn.nextDouble();

        Triangulo triangulo = new Triangulo(alturaT, baseT, lado1, lado2, lado3);
        System.out.println(triangulo.getPerimetro());
        System.out.println(triangulo.getArea());
    }
}
