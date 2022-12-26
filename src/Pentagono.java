public class Pentagono extends Figura {
    double lado;
    double apotema;

    public Pentagono(double lado, double apotema)
    {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado * 5;
    }

    @Override
    protected void calcularArea() {
        area = (lado * apotema * 5) / 2;
    }
}
