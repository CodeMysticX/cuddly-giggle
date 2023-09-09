import java.lang.Math;
interface Shape{
    double volume(double a,double b,double c);
}
class Sphere implements Shape{
    public double volume(double a,double b,double c)
    {
        double vol=(1.33)*Math.PI*a*a*a;
        return vol;
    }
}
class Cylinder implements Shape{
    public double volume(double a,double b,double c)
    {
        double vol=Math.PI*a*a*b;
        return vol;
    }
}
class Cube implements Shape{
    public double volume(double a,double b,double c)
    {
        double vol=a*a*a;
        return vol;
    }
}
class Cuboid implements Shape{
    public double volume(double a,double b,double c)
    {
        double vol=a*b*c;
        return vol;
    }
}
public class Volume{
    public static void main(String[] args){
        Sphere s=new Sphere();
        Cylinder c=new Cylinder();
        Cube c1=new Cube();
        Cuboid c2=new Cuboid();
        System.out.println("Volume of Sphere = "+s.volume(7.5, 0, 0));
        System.out.println("Volume of Cylinder = "+c.volume(7.5, 15, 0));
        System.out.println("Volume of Cube = "+c1.volume(8.2, 0, 0));
        System.out.println("Volume of Cuboid = "+c2.volume(7.5, 3.5, 8.5));
    }
}