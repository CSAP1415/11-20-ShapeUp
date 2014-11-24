// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
//Ajeet Bains//
public class Rectangle
{
  Point topRight;
  Point origin;
  int width;
  int height;
  public Rectangle()
  {
    origin = new Point();
    height = 0;
    width = 0;
  }
  public Rectangle (Point a, int width, int height)
  {
    origin=a;
    this.width=width;
    this.height=height;
    topRight.setX(origin.x+width);
    topRight.setY(origin.y+height);
  }
  public Rectangle(Point a, Point b) 
  {
    origin = a;
    width = b.x - origin.x;
    height = b.y - origin.y;
    topRight = b;      
  }
  public void translate(int n, int m)
  {
    origin.translate(n,m);
    topRight.translate(n,m);
  }
  public void scale(int c, int d)
  {
    width=width+c;
    height=height+d;
    topRight.setX(topRight.x+c);
    topRight.setY(topRight.y+d);
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public boolean isSquare()
  {
    if (width==height)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public double area()
  {
    return (double) width*height;
  }
  public double perimeter()
  {
    return (double) (width*2)+(height*2);
  }
  public double diagonal()
  {
    return origin.distance(topRight);
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    return topRight;
  }
  public String toString()
  {
    return (origin.toString()+", "+topRight.toString());
  }
}
