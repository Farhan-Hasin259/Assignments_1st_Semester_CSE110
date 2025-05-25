public class Task_radius_circumf
{
    public static void main(String[] args) 
    {
        int radius = 4;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("For radius 4, Circumference is: " + circumference);
        System.out.println("For radius 4, Area is: " + area);
    }
}


    





                                          
                                           




public class Task_lastTwoDigits 
{
    public static void main(String[] args) 
    {
        int num = 589423;
        int lastTwoDigits = num % 100;
        System.out.println("The last two digits of " + num + " are: " + lastTwoDigits);
    }
}









                                        



public class Task_inch_meter_conversion 
{
    public static void main(String[] args) 
    {
        int inches = 1000;
        double conversionFactor = 0.0254;
        double meters = inches * conversionFactor;
        System.out.println(inches + " inch is " + meters + " meters");
    }
}














public class Task_swap_values_a
{
  public static void main(String[] args)
  {
    int x=10;
    int y=5;
    int z=x;
     x=y;
     y=z;
    System.out.println(x+"  "+y);
  }
}





                                                       



public class Task_swap_values_b 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 5;
        x = x * y;
        y = x / y; 
        x = x / y;
       System.out.println(x+"  "+y); 
    }
}










                                            





public class Task_year_day_conversion 
{
    public static void main(String[] args) 
    {
        int minutes = 3456789;
        int totalHours = minutes / 60;
        int totalDays = totalHours / 24;
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}










                                             


public class Task_Equation 
{
    public static void main(String[] args) 
    {
        int a = 2;
        int b = 5;
        int c = 8;
        int d = (2 * b * (c - a) / 3) + 7; 
        System.out.println("The value of d is: " + d);
    }
}









                                             




public class Task_Multi_Table
{
    public static void main(String[] args)
    {
         int n=5;
         int result1 = n*1;
         int result2 = n*2;
         int result3 = n*3;
         int result4 = n*4;
         int result5 = n*5;
         int result6 = n*6;
         int result7 = n*7;
         int result8 = n*8;
         int result9 = n*9;
         int result10 = n*10;
         System.out.println(n+" x 1 = "+result1);
         System.out.println(n+" x 2 = "+result2);
         System.out.println(n+" x 3 = "+result3);
         System.out.println(n+" x 4 = "+result4);
         System.out.println(n+" x 5 = "+result5);
         System.out.println(n+" x 6 = "+result6);
         System.out.println(n+" x 7 = "+result7);
         System.out.println(n+" x 8 = "+result8);
         System.out.println(n+" x 9 = "+result9);
         System.out.println(n+" x 10 = "+result10);
     }
}    










                                             


public class Task_sum_positive_numbers
{
    public static void main(String[] args) 
    {
        int n = 100;
        int a = 1;
        int L = 100;
        int sum = n/2 * (a + L); 
        System.out.println("The sum of the first " + n + " positive numbers is: " + sum);
    }
}









                                            




public class Task_Trigonometry
{
    public static void main (String[]args)
    {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(a*a+b*b);
             
                double Sina= a/c ;
                double Sinb= b/c;
                double Cosa= b/c ;
                double Cosb= a/c ;
                System.out.println("Value of Sin(A)is:"+Sina); 
                System.out.println("Value of Sin(B)is:"+Sinb);  
                System.out.println("Value of Cos(A)is:"+Cosa);
                System.out.println("Value of Cos(B)is:"+Cosb);      
    }
}







      





                                             



public class Task_Student_ID 
{
    public static void main(String[] args) 
    {
        int studentID = 24315032;
        int a = studentID % 100;
        int x = a % 10;
        int y = a / 10;
        System.out.println(x);
        System.out.println(y);
    }
}









                                             



public class Task_BikeVelocity
{
    public static void main (String[]args)
    {
        double t = 5+(56/60)+(23/3600);
        int s = 5032;
        double VelocityKmh = (s/1000)/t;
        double VelocityMph = (s/1609)/t;
        System.out.println("Velocity in kmh: " + VelocityKmh);
        System.out.println("Velocity in mph: " + VelocityMph );
    }
}    











                                              




public class Task_Hexa_Calc
{
    public static void main (String[]args)
    {
        int a = 8;
        int b = 3;
        int x = a/2;
        double p = Math.sqrt(x*x+b*b);
        System.out.println("The Area is: " + ((3*Math.sqrt(3)/2)*p*p));
        System.out.println("The Circumference is: "+ p*6);
      
    }
}







 























