public class Obstacle
{
   int x,y;
   int wit, hei;
   
   public Obstacle(int xL, int yL, int witL, int heiL)
   {
      x = xL;
      y = yL;
      wit = witL;
      hei = heiL;
      
   }
   
   
   public Point getA()
   {
      Point a = new Point(x,y);//sol alt
      return a;
   }
   public Point getB()
   {
      Point b = new Point(x,y+hei);//sol �st
      return b;
   }
   
   public Point getC()
   {
      Point c = new Point(x+wit,y+hei);//sa� �st
      return c;
   }
   public Point getD()
   {
      Point d = new Point(x+wit,y);//sa� alt
      return d;
   }
}   