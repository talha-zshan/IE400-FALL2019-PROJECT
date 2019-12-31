public class Point
{
   int x, y;
    
   public Point(int xL, int yL)
   {
      x = xL;
      y = yL;
   }
     public int diff(Point other)
   {
      int tempX = x-other.x;
      tempX = Math.abs(tempX);
      int tempY = y-other.y;
      tempY = Math.abs(tempY);
      return tempX + tempY;
   }
   public int diffWayX(Point other)
   {
      int temp = other.x-x;
      if(temp > 0 )
         return 1;
      else if(temp < 0 )
         return -1;
      else
         return 0;
   }
   public int diffWayY(Point other)
   {
      int temp = other.y-y;
      if(temp > 0 )
         return 1;
      else if(temp < 0 )
         return -1;
      else
         return 0;
   }
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   
}