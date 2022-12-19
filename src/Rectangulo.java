public class Rectangulo extends Figura
{
    double altura, base;

    public Rectangulo(double largo, double ancho) {
        this.altura = largo;
        this.base = ancho;
        calcularPerimetro();
        calcularArea();
    }
    protected void calcularArea(){
        area=base*altura;
    }
    protected void calcularPerimetro(){
        perimetro=(base*2+altura*2);
    }

    /*public void setLargo(int largo) {
        this.altura = largo;
    }


    public void setAncho(int ancho) {
        this.base = ancho;
    }*/
}
