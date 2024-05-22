public class Triangle extends GeometricShape {
    private double height;
    private double bottom;

    public void elements(double height, double bottom){
       setName("Triangle");
       this.height = height;
       this.bottom = bottom;
    }

    @Override
    public double fieldCalculation() {
        return (bottom*height)/2;
    }
}
