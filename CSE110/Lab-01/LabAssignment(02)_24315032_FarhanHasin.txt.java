                                          Ans.to the Q.No.-01




 Task_Identifier

  
    (a) int hungry;     //Valid
    (b) int 2AB;        //Invalid (Because it started with number)
    (c) int 312.2;      //Invalid (Because it started with number and contains special character)
    (d) int MOBILE;     //Valid
    (e) int "Ans";      //Invalid (Because it contains special character)
    (f) int $30;        //Valid
    (g) int Yes/No;     //Invalid (Because Slash "/" is a Division operator in Java )
    (h) int student-id; //Invalid (Because Hyphen "-" is a substraction operator in Java)
    (i) int A+3;        //Invalid (Because Plus "+" is an Addition operator in Java)
    (j) int 'X';        //Invalid (Because single quotes are used for characters)
    (k) int return;     //Invalid (Because it is a reserve keyword)



 







                                           Ans.to the Q.No.-(2.1)




public class Task_Store_int 
{
    public static void main(String[] args) 
    {
        int number = 48;
        System.out.println("The value of the number is: " + number);
    }
}








                                            Ans.to the Q.No.-(2.2)




public class Task_Addition_int
{
    public static void main(String[] args) 
    {
        int num1 = 48;
        int num2 = 24;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}







                                            Ans.to the Q.No.-(2.3)




public class Task_Product_Division_int 
{
    public static void main(String[] args) 
    {
        int num1 = 48;
        int num2 = 24;
        int product = num1 * num2;
        int division = num1 / num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The division of " + num1 + " by " + num2 + " is: " + division);
    }
}






                                                
                                            Ans.to the Q.No.-(2.4)




public class Task_Store_Add_Multi_Divide_double 
{
    public static void main(String[] args) 
    {
        double num1 = 6.843;
        double num2 = 2.718;
        double sum = num1 + num2;
        double product = num1 * num2;
        double division = num1 / num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The division of " + num1 + " by " + num2 + " is: " + division);
    }
}


                                                         




                                               
                                            Ans.to the Q.No.-(2.5)




public class Task_Store_Add_Multi_Divide_int_double
{
    public static void main(String[] args) 
    {
        int x = 76;
        double y = 2.25;
        double sum = x + y;
        double product = x * y;
        double division = x / y;
        System.out.println("The sum of " + x + " and " + y + " is: " + sum);
        System.out.println("The product of " + x + " and " + y + " is: " + product);
        System.out.println("The division of " + x + " by " + y + " is: " + division);
    }
}



                                                       



                                                        


                                            Ans.to the Q.No.-(2.6)




public class Task_String
{
    public static void main (String[]args)
    {
        //String at last
        int m = 9;
        String w = " is integer" ;
        System.out.println(m + w);
    //string at first
          m =9;
          w = "integer is: " ;
        System.out.println(w + m);
    }
}





                     //In Java, addition operator (+) is used to concatenate (combine) strings together. We can see at the code that when we use 
                       the (+) operator with strings, it joins the strings together end-to-end to form a new string. If we print (m+w) from the above
                       code, it will print 9 is integer. Same goes for the vice versa. If we print (w+m), it will print integer is: 9. It joins 
                       everything from left to right. That's how the addition operator works for String.
                       











                                             Ans.to the Q.No.-03




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


    





                                          
                                             Ans.to the Q.No.-04




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









                                             Ans.to the Q.No.-06(Condition-a)




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





                                                       (Condition-b) 




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










                                             Ans.to the Q.No.-07





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










                                             Ans.to the Q.No.-08




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









                                             Ans.to the Q.No.-09





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










                                             Ans.to the Q.No.-10




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









                                             Ans.to the Q.No.-11





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







      





                                             Ans.to the Q.No.-12





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









                                             Ans.to the Q.No.-13





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











                                              Ans.to the Q.No.-14






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







 























