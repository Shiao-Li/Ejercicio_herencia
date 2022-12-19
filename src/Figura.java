public class Figura
{
    int x, y;
    double perimetro;
    double area;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void calcularPerimetro()
    {
        perimetro = (2 * x) + (2 * y);
    }

    public void calcularArea()
    {
        area = x * y;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
