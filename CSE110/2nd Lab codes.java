public class Lab{                                                          





import java.util.Scanner;
public class Largest_Number
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int x = sc.nextInt();
    System.out.println("Enter the second number:");
    int y = sc.nextInt();
    System.out.println("Enter the third number:");
    int z = sc.nextInt();

    if(x>y && x>z)
    {
      System.out.println("Largest number is:"+x);
    }
    else if(y>x && y>z)
    {
      System.out.println("Largest number is:"+y);
    }
    else
    {
      System.out.println("Largest number is:"+z);
    }
    sc.close();
  }
}  
  
  





                                                          Ans. to the Q.No.-02






import java.util.Scanner;
public class Grade_Converter
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the score: ");
       int r = sc.nextInt();

          if(r >= 90 && r <= 100)
          {
            System.out.println("Your grade is A");
          }  
          else if(r >= 85 && r <= 89) 
          {
            System.out.println("Your grade is A-");
          }  
          else if(r >= 70 && r <= 84)
          {
            System.out.println("Your grade is B"); 
          }  
          else if(r >= 57 && r <= 69)
          {
            System.out.println("Your grade is C");
          }              
          else if(r >= 50 && r <= 56) 
          {
            System.out.println("Your grade is D");
          }
          else if(r < 50)
          {
            System.out.println("Your grade is F");
          }
          else
          {
            System.out.println("Invalid score");
          }  
            sc.close();
   }
}   
   
   





                                                          Ans. to the Q.No.-03





import java.util.Scanner;
public class Calculator
{
   public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st Number: ");
       int x = sc.nextInt();
       System.out.println("Enter 2nd Number: ");
       int y = sc.nextInt();
       System.out.println("Enter Operator: ");
       String operator = sc.next();
       int result=0;
       
        if (operator.equals("+"))
        {
            result = x+y;
            System.out.println(result);
        }
         else if (operator.equals("-"))
        {
            result = x-y;
            System.out.println(result);
        }
         else if (operator.equals ("*"))
        {
            result = x*y;
            System.out.println(result);
        }
         else if (operator.equals ("/"))
        {
           if (y != 0)
           {
            result = x/y;
            System.out.println(result);
           }
           else
           {
             System.out.println("Error: Division by zero!");
           }
        }
         sc.close();
    }
}











                                                          Ans. to the Q.No.-04






import java.util.Scanner;
public class Divisible
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int a = sc.nextInt();

        if(a % 5 == 0 && a % 7 == 0) 
        {
            System.out.println("Divisible by Both");
        } 
        else if(a % 5 == 0 && a % 7 != 0)
        {
          System.out.println("Invalid: Divisible by 5 Only");
        }
        else if(a % 7 == 0 && a % 5 != 0)
        {
          System.out.println("Invalid: Divisible by 7 Only");
        }
        else
        {          
            System.out.println("No");
        }
         sc.close();
    }
}








                                                          Ans.to the Q.No.-05




import java.util.Scanner;
public class Leap_Year
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year:");
    int y = sc.nextInt();
    
    if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
    {
      System.out.println(y + " is a leap year");
    }
    else
    {
      System.out.println(y + " is not a leap year");
    }
  }
}









                                                           Ans.to the Q.No.-06




import java.util.Scanner;
public class NumberClassifier
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int m = sc.nextInt();

        if (m < 0) 
        {
            System.out.println("Number is negative");
        } 
        else if (m == 0) 
        {
            System.out.println("Number is zero");
        } 
        else if (m > 0 && m % 2 == 0) 
        {
            System.out.println("Number is positive and even");
        } 
        else 
        {
            System.out.println("Number is positive and odd");
        }
           sc.close();
    }
}










                                                          Ans.to the Q.No.-07





import java.util.Scanner;
public class Function
{
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an Integer:");
       int x = sc.nextInt();
       if(x < 0)
       {
         System.out.println("output: " + (2*x));
       }
        else if(x >= 0 && x < 2 )
        {
         System.out.println("output: " + (x+1));
        }
         else if(x >= 2 && x < 5 )
         {
          System.out.println("output: " + (x*x-1));
         }
         else if(x >= 5)
         {
          System.out.println("output: " + (3*x*x+2));
         }
          else
          {
          }
            sc.close();
    }
}











                                                          Ans.to the Q.No.-08





import java.util.Scanner;
public class Student_ID
{
   public static void main (String [] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your  BRACU Student ID: ");
       int a = sc.nextInt();
       int y = 0;
       y = a/1000000;
       int x = a/100000;
       x = x % 10;
       
        if (x == 1)
        {
            System.out.println("Student Joined BRAC in Spring "+y);
        }
        else if (x == 2)
        {
            System.out.println("Student Joined BRAC in Fall "+y);
        }
        else if (x == 3)
        {
            System.out.println("Student Joined  BRAC in Summer "+y);
        }
    }
}
            










                                                          Ans.to the Q.No.-09







import java.util.Scanner;
public class Tax_Calculate 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your payment amount: ");
       double payment = sc.nextDouble();
       System.out.println("Enter your age: ");
       int age = sc.nextInt();
       double tax = 0.0;

        if (payment < 10000 || age < 18) 
        {
          System.out.println("Your Tax amounts is " + tax + " Tk"); 
        } 
        else if (payment >= 10000 && payment <= 20000 && age >= 18)
        {
          tax = payment * 0.05;
          System.out.println("Your Tax amounts is " + tax + " Tk");
        } 
        else if (payment > 20000 && age > 18) 
        {
          tax = payment * 0.10;
          System.out.println("Your Tax amounts is " + tax + " Tk");
        }
        else
        {
        }
           sc.close();
    }
}









                                                          Ans.to the Q.No.-10





import java.util.Scanner;
public class Max_Min
{
   public static void main (String [] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input 1st Float number:");
       float x= sc.nextFloat();
       System.out.println("Input 2nd Float number:");
       float y= sc.nextFloat();
       System.out.println("Input 3rd Float number:");
       float z= sc.nextFloat();
       float maximum= x;
       
        if (x > y && x > z)
        {
             System.out.println("Maximum number is " + x);
        }
        else if(y > x && y > z)
        {
             System.out.println("Maximum number is " + y);
        }
        else 
        {
             System.out.println("Maximum number is " + z);
        }
        if (x < y && x < z)
        {
             System.out.println("Minimum number is " + x);
        }
        else if (y < x && y < z)
        {
            System.out.println("Minimum number is " + y);
        }
        else
        {
            System.out.println("Minimum number is " + z);
        }
          sc.close();
    }
}












                                                          Ans.to the Q.No.-11






import java.util.Scanner;
public class Triangle_Types 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of x: ");
       int x = sc.nextInt();
       System.out.println("Enter the length of y: ");
       int y = sc.nextInt();
       System.out.println("Enter the length of z: ");
       int z = sc.nextInt();

        if (x == y && y == z) 
        {
           System.out.println("This is a Equilateral triangle");
        } 
        else if (x == y || x == z || y == z) 
        {
           System.out.println("This is a Isosceles triangle");
        } 
        else 
        {
            System.out.println("This is a Scalene triangle");
        }
             sc.close();
    }
}










                                                          Ans.to the Q.No.-12






import java.util.Scanner;
public class Cashier_CashChange
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount the customer need to pay: ");
       int  p = sc.nextInt();
       System.out.println("Enter the amount customer gave: ");
       int  g = sc.nextInt();
       int x =(g-p);
      
        if(g > p)
        {
           System.out.println("The returned amount is "+x+ " Taka.");
            if(x >= 100)
            {
               System.out.println("100 taka note:" + x/100);
                x = x -((x/100)*100);
            }
            else
            {
                System.out.println("100 taka note: 0" );
            }
            if(x >= 50)
            {
                System.out.println("50 taka note:" + x/50);
                int h = 0;
                x = x-((x/50)*50);
            }
              else
              {
                System.out.println("50 taka note: 0" );
              }
              if(x >= 20)
              {
                System.out.println("20 taka note:" + x/20);               
                x = x -((x/20)*20);
              }
              else
              {
                System.out.println("20 taka note: 0" );
              }
             if(x >= 10)
             {
                System.out.println("10 taka note:" + x/10);
                x = x -((x/10)*10);
             }
               else
               {
                System.out.println("10 taka note: 0" );
               }
             if(x >= 5)
             {
               System.out.println("5 taka coin:" + x/5);
                x = x -((x/5)*5);
             }
              else
              {
               System.out.println("5 taka note: 0" );
              }
          
             if(x >= 2)
             {
               System.out.println("2 taka coin:" + x/2);
                x = x -((x/2)*2);
             }
              else
              {
               System.out.println("2 taka note: 0" );
              }
             if(x >= 1)
             {
               System.out.println("1 taka coin:" + x/1);                 
             }
              else
              {
                System.out.println("1 taka note: 0" );
              }
        }
      
              else if(x == 0)
              {
                System.out.println("The returned amount is 0 taka." );
              }
              else
              {
                System.out.println("Please pay " + (p-g)+ " taka more." );
              }
               sc.close();
    } 
}














                                                          Ans.to the Q.No.-13






import java.util.Scanner;
public class Compare_Numbers 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the 1st number: ");
       int p = sc.nextInt();
       System.out.println("Input the 2nd number: ");
       int q = sc.nextInt();
       System.out.println("Input the 3rd number: ");
       int r = sc.nextInt();

        if (p == q && q == r) 
        {
           System.out.println("All numbers are equal");
        } 
        else if (p != q && q != r && p != r) 
        {
           System.out.println("All numbers are different");
        } 
        else 
        {
           System.out.println("Neither all are equal or different");
        }
            sc.close();
    }
}

}





                                                            
   



                                                      

                                               