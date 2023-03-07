public class Cercle  extends Figura{
    private double radius;

    public Cercle(double r){
        this.radius=r;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI *this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Cercle";
    }
}
