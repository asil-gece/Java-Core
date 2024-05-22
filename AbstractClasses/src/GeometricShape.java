public abstract class GeometricShape {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double fieldCalculation();
}
