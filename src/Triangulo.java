public class Triangulo extends DosDimensiones
{
    private String estilo;

    Triangulo()
    {
        super(); //Heredar todos los atributos y metodos
        estilo = "ninguno";
    }

    Triangulo(String s, double base, double altura)
    {
        super(base,altura);
        estilo = s;
    }

    Triangulo(double x)
    {
        super(x);
        estilo = "Estilo nuevo";
    }

    double area()
    {
        return (getAltura() * getBase()) / 2;
    }

    void mostarEstilo()
    {
        System.out.println("Estilo: " + estilo);
    }
}
