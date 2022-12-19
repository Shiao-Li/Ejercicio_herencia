public abstract class Figura
{
    double perimetro;
    double area;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();
}
