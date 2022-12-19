public class ColorTriangulo extends Triangulo
{
    private String color;
    ColorTriangulo(String c, String s, double b, double h)
    {
        super(s, b, h);
        color = c;
    }

    public String getColor() {
        return color;
    }

    void mostrarColor()
    {
        System.out.println("Color: " + color);
    }
}
