public class Triangulo extends Figura
{
    /* private String estilo;
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
    }*/

    private double lado1, lado2, lado3;
    private double base;
    private double altura;

    public Triangulo(double altura, double base, double lado1, double lado2, double lado3)
    {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea()
    {
        area = (base * altura) / 2;
    }
    protected void calcularPerimetro()
    {
        perimetro = lado1 + lado2 + lado3;
    }
}
