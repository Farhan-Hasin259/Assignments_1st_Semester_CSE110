                                                              Ans.to the Q.No.-01




import java.util.Scanner;
public class Task_Prime
{  
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);    
    System.out.println ("Enter The Amount Of Number:");    
    int N = sc.nextInt();        
      int x = 2;
      int d = 1;
      while(d <= N)
      {
        int c = 0;
        
        for(int i = 1; i <= x; i++)
        {
          if(x % i == 0)
          { 
            d++;
          }
        }
        if(c == 2)
        {
          System.out.println(x);
          d++;
        }
        x++;
      }
      sc.close();
  }
}
    
    
      
   











                                                               Ans.to the Q.NO.-02




import java.util.Scanner;
public class Task_Numcalc 
{  
  public static void main (String[] args)
  {   
    Scanner sc = new Scanner(System.in);    
    System.out.println ("Enter a positive ineteger: ");    
    int N = sc.nextInt();  
    
    if (N <= 0) 
    {
    System.out.println("Must be greater than 0");
    }
    int y = 0 ;
    
    for (int i = 1 ; i <= N ; i++)
    {     
      int sum = 0 ;
      
      for (int p = 1 ; p <= i ; p++)
      {
        sum +=  p ;       
      }  
         y -= sum;      
    }    
    System.out.println ("The Value Of y is: " + y ); 
    sc.close();
  }   
}


                                                               Ans.to the Q.No.-03





import java.util.Scanner;
public class Task_DivisorCounter 
{    
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int count = 0;
     System.out.println("Input Number:");
     int x = sc.nextInt();
     
     if(x % 2 == 0)
     {
       for(int i = 1; i <= x; i++)
       {
         if(x % i == 0)
         {
           count++;
         }
       }
     }
       System.out.println(x  + " has " + count + " divisors ");
      sc.close();
   }
}
  
    

                                                               Ans.to the Q.No.-04





import java.util.Scanner;
public class Task_Case
{ 
  public static void main(String[] args)
  {    
    Scanner sc = new Scanner(System.in);    
    System.out.println("Enter The Amount Of Cases:");    
    int c = sc.nextInt();
    
    for(int i = 1; i <= c ; i++)
    {      
      System.out.println("Enter The Value Of X:");      
      int x = sc.nextInt();      
      System.out.println ("Enter The Value Of Y");      
      int y = sc.nextInt();      
      int sum = 0;
      
      for (int m = 1 ; m <= y ; m++)
      {       
        if (x % 2 == 0)
        {
          m--;
          x++;
        }     
        else 
        {
          sum += x ;         
          x += 2;         
        }        
      }      
      System.out.println (sum);     
    }
       sc.close();
  }  
}



                                                               Ans.to the Q.No.-05





import java.util.Scanner;
public class Task_RectPattern 
 {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the width of the rectangle: ");
      int w = sc.nextInt();
      System.out.println("Enter the length of the rectangle: ");
      int l = sc.nextInt();
      
      for (int i = 0; i < l; i++) 
      {
            for (int m = 1; m <= w; m++) 
            {
             System.out.print(m + " ");
            }
             System.out.println(); 
        }

        sc.close();
    }
}






                                                               Ans.to the Q.No.-06





import java.util.Scanner;
public class Task_RightTriangle 
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        int h = sc.nextInt();
        
        for (int i = 1; i <= h; i++) 
        {            
           
           for (int f = 0; f <= h - i; f++) 
             {
               System.out.print("  "); 
             }
            
            for (int p = 1; p <= i; p++) 
            {
               System.out.print(p + " ");
            }            
              System.out.println();
        }
            sc.close();
    }
}





                                                               Ans.to the Q.No-07





import java.util.Scanner;
public class Task_Isosceles 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);        
       System.out.println("Enter the height of the triangle: ");
       int h = sc.nextInt();       
       int maxWidth = (2 * h) - 1;
       
       for (int i = 1; i <= h; i++) 
        {           
          int sp = h - i;

            for (int b = 0; b < sp; b++) 
            {
                System.out.print(" ");
            }
            
              for (int k = 1; k <= 2 * i - 1; k++) 
              {
                 System.out.print(k +"");
              }           
                 System.out.println();
        }
        sc.close();
    }
}





                                                               Ans.to the Q.No.-08





import java.util.Scanner;
public class Task_Armstrong
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("The Start:");
    int s = sc.nextInt();
    System.out.println("The End:");
    int e = sc.nextInt();
    
    while(s <= e)
    {
      int x = s;
      int y = s;
      int count = 0;
      int r = 0;
      
      while(x > 0)
      {
        r = x % 10;
        count++;
        x = x / 10;
      }
      
      





