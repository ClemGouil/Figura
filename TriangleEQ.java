public class TriangleEQ extends Figura {

    private double base;
    private double height;

    public TriangleEQ(double b,double h){
        this.base=b;
        this.height=h;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double area() {
        double v = (this.base * this.height) / 2;
        return v;
    }

    @Override
    public String toString() {
        return "TriangleEQ";
    }
}
