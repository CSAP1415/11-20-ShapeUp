// A Line object represents a line defined by a pair of Points.
//Ajeet Bains//

public class Line
{
  Point pointStart;
  Point pointEnd;
  public Line()
  {
    pointStart = new Point();
    pointEnd = new Point();
  }
  public Line(Point a, Point b)
  {
    pointStart = a;
    pointEnd = b;
  }
  public double length()
  {
    return pointStart.distance(pointEnd);
  }
  public double slope()
  {
    return (pointEnd.y - pointStart.y)/ (pointEnd.x - pointStart.x);
  }
  public String toString()
  {
    return "(" + pointStart.x + "," + pointStart.y + ")" + " " + "(" + pointEnd.x + "," + pointEnd.y + ")";
  }
  public void translate(int c, int d)
  {
    pointStart.translate( c, d);
    pointEnd.translate( c, d);
  }
}
