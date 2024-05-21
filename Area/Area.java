class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();

        rectangle.setDim(8.0,5.0);

        double area = rectangle.getArea();

        System.out.println("Area Of Rectangle : " + area);
    }
}