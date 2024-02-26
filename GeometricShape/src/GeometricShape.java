class GeometricShape {
    private String name;
    private double area;

    public GeometricShape(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String toString() {
        return "Név: " + this.getName() + "\n" +
                "Terület: " + this.getArea() + " négyzetegység" + "\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}