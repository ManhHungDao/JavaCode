package btch3.mypackage.shape;

public class Circle {
    double r;
    public Circle(double r){
        this.r =r;
    }
    public double Circumference()
    {
        return 2*Math.PI*r;
    }
    public double Area()
    {
        return Math.PI*r*r;
    }
}
