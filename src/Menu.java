import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del Cuadrado: ");
        double longitudLado=lectura.nextDouble();

        Cuadrado miCuadrado=new Cuadrado(longitudLado);
        System.out.println(miCuadrado.getArea());
        System.out.println(miCuadrado.getPerimetro());


        System.out.println("Ingrese la base del rectangulo: ");
        double longitudBase=lectura.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double longitudAltura= lectura.nextDouble();
        Rectangulo miRectangulo = new Rectangulo(longitudBase, longitudAltura);
        System.out.println(miRectangulo.getArea());
        System.out.println(miRectangulo.getPerimetro());

        /*Rectangulo rectangulo = new Rectangulo();
        rectangulo.setX(15);
        rectangulo.setY(25);
        rectangulo.calcularPerimetro();
        rectangulo.calcularArea();
        System.out.println(rectangulo.getPerimetro());
        System.out.println(rectangulo.getArea());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setX(4);
        cuadrado.setY(4);
        cuadrado.calcularPerimetro();
        cuadrado.calcularArea();
        System.out.println(cuadrado.getPerimetro());
        System.out.println(cuadrado.getArea());


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
        System.out.println("Area: " + colorTriangulo1.area());*/
    }
}
