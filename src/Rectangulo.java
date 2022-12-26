public class Rectangulo extends Figura
{
    int largo, ancho;

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Rectangulo(int laro, int ancho)
    {
        this.largo = laro;
        this.ancho = ancho;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    protected void calcularArea()
    {
        area = largo * ancho;
    }
    protected void calcularPerimetro()
    {
        perimetro = 2 * largo + 2 * ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
