package circle;

public class Cylinder extends Circle{
    double height = 1.0;
    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }
    public Cylinder(double radius,double height)
    {
        this.radius = radius;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    double dtXungQuanh(){
        return height*2*radius*Math.PI;
    }
    double baseArea()
    {
        return radius*radius*Math.PI;
    }
    double surface()
    {
        return 2*baseArea()*dtXungQuanh();
    }
    double volume()
    {
        return baseArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", base area='" + baseArea() + '\'' +
                ", volume=" + volume() +
                '}';
    }
}
class Main
{
    public static void main(String[] args) {
        Cylinder cl1 =new Cylinder();
        Cylinder cl2 =new Cylinder(10.0);
        Cylinder cl3 =new Cylinder(2.0,10.0);


    }
}