package pl.zzpj2019.solid.lsp.shape;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4.0 * a;
    }
}
