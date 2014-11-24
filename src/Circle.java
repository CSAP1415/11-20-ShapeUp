// A Circle object represents a circle defined by a center point and a radius.
//Ajeet Bains//

public class Circle
{
  Point center;
  double radius;
  public Circle()
  {
    center = new Point();
  }
  public Circle(Point a, Point b)
  {
    radius = a.distance(b);
    center = a;
  }
  public Circle(Point c, double d)
  {
    this.center = center;
    this.radius = radius;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    return (radius * radius * 3.14);
  }
  public double circumference()
  {
    return (2 * radius * 3.14);
  }
  public double diameter()
  {
    return (2 * radius);
  }
  public String toString()
  {
    return (center.toString() + "," + radius);
  }
  public void translate(int e, int f)
  {
    center.translate(e,f);
  }
  public void changeRadius(double change)
  {
    radius+=change;
  }
}
