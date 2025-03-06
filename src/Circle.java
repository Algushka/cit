import java.util.Objects;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double calcArea(){
        return Math.PI*Math.pow(radius,2);
    }
//hfjskfshkgh
    @Override
    public String toString() {
        return String.format("Kруг, Радиус:%.2f площадь %.2f ", radius,calcArea());    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
