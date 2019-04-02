package pl.zzpj2019.solid.lsp.shape;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * (a + b);
    }
}
