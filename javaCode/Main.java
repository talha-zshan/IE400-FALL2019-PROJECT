public class Main
{
   static boolean pasOrNot(Point first, Point second, Obstacle[] obs)
   {
      int tempFX = first.x;
      int tempFY = first.y;
      if( first.diffWayX(second) == 1 && first.diffWayY(second) == 1)
      {
         for( int i = 0; i < obs.length; i++)
         {
            if(obs[i].getA().x <= tempFX && second.x <= obs[i].getD().x &&( tempFY <= obs[i].getA().y && obs[i].getC().y <= second.y))
               return false;
            else if( obs[i].getA().y <= tempFY && second.y <= obs[i].getC().y && ( tempFX <= obs[i].getA().x && obs[i].getD().x <= second.x))
               return false;
            else
            {
               if(obs[i].getC().x > tempFX && obs[i].getC().x < second.x)
               {
                  if(obs[i].getC().y > tempFY && obs[i].getC().y < second.y)
                  {
                     tempFX = obs[i].getC().x;
                     tempFY = obs[i].getC().y;
                     i = -1;
                  }
               }
            }
         }
         return true;
      }
      else if( first.diffWayX(second) == -1 && first.diffWayY(second) == 1)
      {
         for( int i = 0; i < obs.length; i++)
         {
            if(obs[i].getA().x <= second.x && tempFX <= obs[i].getD().x && (obs[i].getA().y >= tempFY && second.y >= obs[i].getC().y))
               return false;
            else if( obs[i].getA().y <= tempFY && second.y <= obs[i].getC().y && (obs[i].getA().x >= second.x && tempFX >= obs[i].getD().x))
               return false;
            else
            {
               if(obs[i].getB().x < tempFX && obs[i].getB().x > second.x)
               {
                  if(obs[i].getB().y > tempFY && obs[i].getB().y < second.y)
                  {  
                     tempFY = obs[i].getB().y;
                     tempFX = obs[i].getB().x;
                     i = -1;
                  }
               }
            }
         }
         return true;
      }
      else if( first.diffWayX(second) == 1 && first.diffWayY(second) == -1)
      {
         for( int i = 0; i < obs.length; i++)
         {
            if(obs[i].getA().x <= tempFX && second.x <= obs[i].getD().x && (obs[i].getA().y >= second.y && tempFY >= obs[i].getC().y))
               return false;
            else if( obs[i].getA().y <= second.y && tempFY <= obs[i].getC().y && (obs[i].getA().x >= tempFX && second.x >= obs[i].getD().x))
               return false;
            else
            {
               if(obs[i].getD().x > tempFX && obs[i].getD().x < second.x)
               {
                  if(obs[i].getD().y < tempFY && obs[i].getD().y > second.y)
                  {
                     tempFX = obs[i].getD().x;
                     tempFY = obs[i].getD().y;
                     i = -1;
                  }
               }
            }
         }
         return true;
      }
      else if( first.diffWayX(second) == -1 && first.diffWayY(second) == -1)
      {
         for( int i = 0; i < obs.length; i++)
         {
            if(obs[i].getA().x <= second.x && tempFX <= obs[i].getD().x && (obs[i].getA().y >= second.y && tempFY >= obs[i].getC().y))
               return false;
            else if( obs[i].getA().y <= second.y && tempFY <= obs[i].getC().y && (obs[i].getA().x >= second.x && tempFX >= obs[i].getD().x))
               return false;
            else
            {
               if(obs[i].getA().x < tempFX && obs[i].getA().x > second.x)
               {
                  if(obs[i].getA().y < tempFY && obs[i].getA().y > second.y)
                  {
                     tempFX = obs[i].getA().x;
                     tempFY = obs[i].getA().y;
                     i = -1;
                  }
               }
            }
         }
         return true;
      }
      else if( first.diffWayX(second) == 0 && first.diffWayY(second) == -1 )
      {
         for( int i = 0; i < obs.length; i++)
         {
            if( obs[i].getA().x <= tempFX && tempFX <= obs[i].getD().x && ( obs[i].getC().y <= tempFY && second.y <= obs[i].getA().y))
               return false;
            
         }
         return true;
      }
      else if( first.diffWayX(second) == 0 && first.diffWayY(second) == 1 )
      {
         for( int i = 0; i < obs.length; i++)
         {
            if( obs[i].getA().x <= first.x && first.x <= obs[i].getD().x && (first.y <= obs[i].getA().y && obs[i].getC().y <= second.y))
               return false;
         }
         return true;
      }
      else if( first.diffWayY(second) == 0 && first.diffWayX(second) == -1 )
      {
         for( int i = 0; i < obs.length; i++)
         {
            if( obs[i].getA().y <= tempFY && tempFY <= obs[i].getC().y && (obs[i].getD().x <= tempFX && second.x<= obs[i].getA().x ))
               return false;
         }
         return true;
      }
      else if( first.diffWayY(second) == 0 && first.diffWayX(second) == 1 )
      {
         for( int i = 0; i < obs.length; i++)
         {
            if( obs[i].getA().y <= tempFY && tempFY <= obs[i].getC().y && ( tempFX <= obs[i].getA().x && obs[i].getD().x <= second.x))
               return false;
         }
         return true;
      }
      else
         return true;
   }
   public static void main(String[] args)
   {
      int poiSize = 8;
      int obsSize = 3;
      
       
      
      Point pArr[] = new Point[poiSize];
      Obstacle oArr[] = new Obstacle[obsSize];
      int [][] diffArr = new int[poiSize][poiSize];
      
      // arrayi test i�in yazd�m, for a kadar arrayi doldurunca yukardan point ve obs size de�i�tirin
      pArr[0] = new Point(2,2);
      pArr[1] = new Point(-2,2);
      pArr[2] = new Point(-2,-2);
      pArr[3] = new Point(2,-2);
      pArr[4] = new Point(6,6);
      pArr[5] = new Point(-6,6);
      pArr[6] = new Point(-6,-6);
      pArr[7] = new Point(6,-6);
      
      oArr[0] = new Obstacle(1,3,3,2);
      oArr[1] = new Obstacle(0,-3,1,5);
      oArr[2] = new Obstacle(-5,1,2,7);


      
      for(int i = 0; i < poiSize; i++ )
      {
         for(int j = 0; j < poiSize; j++)
         {
            diffArr[i][j] = pArr[i].diff(pArr[j]);
            if(!(pasOrNot(pArr[i],pArr[j],oArr)) )
            {
               diffArr[i][j] = 1000;
            }
            
            System.out.print(diffArr[i][j]);
            System.out.print("--");
            
         }
         System.out.print("\n");
      }
      
//      Point a = new Point(41,9);
//      Point b = new Point(46,40);
//      Obstacle c = new Obstacle(40,15,10,5);
//      System.out.println(pasOrNot(b,a,c));
//      Point d = new Point(-1,2);
//      Point e = new Point(-5,5);
//      Obstacle f = new Obstacle(-3,3,1,1);
//      System.out.println(pasOrNot(d,e,f));
      
   }
}