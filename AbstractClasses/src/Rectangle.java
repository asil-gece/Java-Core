public class Rectangle extends GeometricShape{
    private double longSide;
    private double shortSide;

    public void elements(double longSide, double shortSide){
        setName("Rectangle");
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double fieldCalculation() {
        return longSide * shortSide;
    }
}
