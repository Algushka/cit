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
}
