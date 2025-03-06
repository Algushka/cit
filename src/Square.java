public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return String.format("Квадрат %.2f, площадь: %.2f",getSideA(),calcArea());
    }
}
