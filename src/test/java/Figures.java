abstract class Figure{
    public abstract double Area();
    public abstract double Perimetr();
}
class Triangle extends Figure{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() {
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double Perimetr() {
        return (a + b + c);
    }
}

class Square extends Figure{
    double a;

    public Square (double a){
        this.a = a;
    }

    @Override
    public double Area() {
        return a * a;
    }

    @Override
    public double Perimetr() {
        return a + a + a + a;
    }
}

class Rectangle extends Figure{
    double a, b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area() {
        return a * b;
    }

    @Override
    public double Perimetr() {
        return (a + b) * 2;
    }
}

class Circle extends Figure{
    double r;
    final double pi = 3.14;

    public Circle (double r){
        this.r = r;
    }

    @Override
    public double Area() {
        return pi * r * r;
    }

    @Override
    public double Perimetr() {
        return 2 * pi * r;
    }
}



