                                                        Ans.to the Q.No.-01(a)




public class Loop_Testing_While_01 
{
   public static void main(String[] args) 
   {
        int ky = 24;
        
        while (ky >= -6) 
        {
          if(ky == -6)
          {
            System.out.print(ky);
          }
          else
          {
            System.out.print(ky + ",");
          }
          
             ky -= 6;
        }
   }
}







                                                                   (b)





public class Loop_Testing_While_sq
{
   public static void main(String[] args) 
   {
       int sw = -10; 
        while (sw <= 20) 
        {
          if(sw == 20)
          {
            System.out.print(sw);
          }      
           else 
           {
                System.out.print(sw +",");
           }
              sw += 5;
        }
    }
}










                                                        Ans.to the Q.No.-02




import java.util.Scanner;
public class Testing_Sum_Avg_wd 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input Numbers: ");
       int N = sc.nextInt();
   
       double sum = 0.0;
       double avg; 
       System.out.println("Input " + N + " numbers:");
       for (int frx = 1; frx <= N; frx++) 
       {
            int ed = sc.nextInt();
            sum += ed;
        }              
        avg = sum / N;
    
        System.out.println("The sum of "+N+" no. is: " + sum);
        System.out.println("The Average is: " + avg);
        
           sc.close();
    }
}








                                                        Ans.to the Q.No.-03







import java.util.Scanner;
public class Task_sqd3
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter integer numbers:");
        
        while (true) 
        {
            System.out.println("Enter a number: ");
            int dignum = sc.nextInt();
            
            if (dignum >= 0) 
            {
              int sqd = (int)Math.pow(dignum,2);
              System.out.println(dignum+"^"+2+"="+sqd);
            }
            else
            {
                break;
            }                        
        }        
           sc.close();
    }
}








                                                        Ans.to the Q.No.-04





import java.util.Scanner;
public class Task_Divisors_Finding
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       int xdr = sc.nextInt();
        
     System.out.println("Divisors of " + xdr + ":");
        
        
       for (int fc = 1; fc <= xdr; fc++) 
       {
           if (xdr % fc == 0) 
           {
               System.out.println(fc);
            }
        }       
             sc.close();
    }
}









                                                        Ans.to the Q.No.-05





import java.util.Scanner;
public class Task_Finding_neg_pos
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);                
       System.out.println("Enter the number of integers: ");
       int cfv = sc.nextInt();
       int negCountx = 0;
       int nonNegCountx = 0;
        
        for (int pk = 1; pk <= cfv; pk++) 
        {
            System.out.println("Enter integer" + pk + ": ");
            int gv = sc.nextInt();
            
            if (gv < 0) 
            {
                negCountx++;
            } 
            else 
            {
                nonNegCountx++;
            }
        }               
        System.out.println(nonNegCountx + " Non-negative Numbers");
        System.out.println(negCountx + " Negative Numbers");
               sc.close();
    }
}








                                                        Ans.to the Q.No.-06





import java.util.Scanner;
public class Task_Sum_ODD 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number of terms: ");
       int n = sc.nextInt();
       int summation = 0;
        System.out.println("The odd numbers are:");
        
        for (int w = 1, countx = 0; countx < n; w += 2) 
        {
            System.out.println(w);
            summation += w;
            countx++;
        }       
        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + summation);
        
           sc.close();
    }
}







                                                               
                                                        Ans.to the Q.No.-07





import java.util.Scanner;
public class Task_Continued_Summation
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    
    for(int yhk = 1; yhk <= 10; yhk++)
    {
      System.out.println("Enter an integer:");
      int res = sc.nextInt();
      sum += res;
      System.out.println("Sum ="+sum);
    }
       sc.close();
  }
}






                 
                                                        Ans.to the Q.No.-08





import java.util.Scanner;
public class Task_Testing_Divisibles 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);                
       System.out.println("Enter a positive integer: ");
       int jt = sc.nextInt();
       
        if (jt <= 0) 
        {
            System.out.println("Invalid input. Please enter a positive integer.");           
        }
        
        for (int rfj = 0; rfj <= jt; rfj++) 
        {
            if (rfj % 5 == 0 && rfj % 3 != 0) 
            {
                System.out.println(rfj);
            }
            else
            {
            }
        }       
            sc.close();
    }
}






                                                        Ans.to the Q.No.-09





import java.util.Scanner;
public class Task_Count_DigitsX 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int numeri = sc.nextInt();
       int countx = 0;
       
        while (numeri > 0) 
        {
            numeri /= 10;
            countx++;
        }
        
        System.out.println("Total digits = " + countx);      
          sc.close();
    }
}







                                                       Ans.to the Q.No.-10






import java.util.Scanner;
public class Task_PrintDigitx_LR
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer input");
    int v = sc.nextInt();
    int dq = v;
    int h = 0;
    
    while (dq != 0)
    {
      dq = dq / 10;
      h++;
    }  
     
    double xf = Math.pow(10 , h-1);
    double cg = v;
    
    while (h != 0)
    {
      double sd = cg / xf;
      int a = (int)sd;
      
      if (Math.pow(10, h-1) >1)
      {
       System.out.print(a + ",");
      }
      else
      {
        System.out.println(a);
      }
      
      cg = cg % xf;
      xf = xf / 10;
      h--;
    }
       sc.close();
  }
}







                                                       Ans.to the Q.No.-11(a)





import java.util.Scanner;
public class Task_Prime_CheckerX11
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int k = sc.nextInt();
    int countx = 0;
    
    for(int dlg = 1; dlg <= k; dlg++)
    {
      if (k % dlg == 0)
      {
        countx++;
      }
    }
    
      if (countx == 2)
      {
        System.out.println(k + " is a prime number");
      }
      else
      {
        System.out.println(k + " is not a prime number");
      }
          sc.close();
  }
}






                                                               (b)





import java.util.Scanner;
public class Task_Perfect_CheckerX11
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int h = sc.nextInt();
    int sum = 0;
    
    for(int dlg = 1; dlg <= h; dlg++)
    {
      if (h % dlg == 0)
      {
        sum += dlg;
      }
    }
    
      if (sum - h == h)
      {
        System.out.println(h + " is a perfect number");
      }
      else
      {
        System.out.println(h + " is not a perfect number");
      }
          sc.close();
  }
}








            

