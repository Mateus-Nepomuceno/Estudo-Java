package maratonajava.javacore.a5construtorestest.dominio;

public class Retangulo {
    private double width;
    private double height;

    public void imprimeResultado(double width, double height){
        System.out.printf("AREA = %.2f%n",area(width, height));
        System.out.printf("PERIMETER = %.2f%n",perimetro(width, height));
        System.out.printf("DIAGONAL = %.2f%n",diagonal(width,height));
    }
    public double area(double width, double height){
            return width * height;
    }

    public double perimetro(double width, double height){
        return width * 2 + height * 2;
    }

    public double diagonal(double width, double height){
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
