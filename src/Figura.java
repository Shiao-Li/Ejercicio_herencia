public abstract class Figura
{
    //int x, y;
    double perimetro;
    double area;

    /*
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
     */

    protected abstract void calcularPerimetro();

    protected abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
