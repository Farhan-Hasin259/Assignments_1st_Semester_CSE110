                                                                   Ans.to the Q.No.-01





import java.util.Scanner;
public class Task_LowertoUpper
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Text: ");
    String d = sc.nextLine();
    String n = " ";
    
    for(int i = 0; i < d.length(); i++)
    {
      char ch = d.charAt(i);
      int ascii =(int)ch;
      
      if(ascii >= 97 && ascii <= 122)
      {
        ascii = ascii-32;
        n +=(char)ascii;
      }
      else 
      {
        n +=(char)ascii;
      }
    }
    System.out.println(n);
    sc.close();
  }
}










                                                                   Ans.to the Q.No.-02





import java.util.Scanner;
public class Task_Palindrome 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Text: ");
      String x = sc.nextLine(); 
      String y = "";

       for (int j = x.length() - 1; j >= 0; j--) 
       {
           char ps = x.charAt(j);
           y += ps;
        }
        
         if (y.equals(x)) 
         {
            System.out.println("true"); 
         } 
         else 
         {
           System.out.println("false"); 
         }
           sc.close();
    }
}







                                                                   Ans.to the Q.No.-03





import java.util.Scanner;
public class Task_SplitString
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Text: ");
    String a = sc.nextLine();
    System.out.println("Enter The Character: ");
    char split = sc.next().charAt(0);
    String b = "";
    
    for (int k = 0; k < a.length(); k++)
    {
      char gt = a.charAt(k);
      
      if (gt != split)
      {
        b += gt;
      }
      else 
      {
        System.out.println(b);
        b = "";
      }  
    } 
     System.out.println(b);
     sc.close();
  }
}







                                                                   Ans.to the Q.No.-04





import java.util.Scanner;
public class Task_StrReverse
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Text: ");
    String v = sc.nextLine();
    String h = "";
    
    for(int i = v.length() - 1; i >= 0; i--)
    {
      char rfj = v.charAt(i);
      h += rfj;
    }
    System.out.println(h);
  }
}





                                                                   Ans.to the Q.No.-05





import java.util.Scanner;
public class Task_TreasureUnlock
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);      
      System.out.println("Enter a phrase: ");
      String ph = sc.nextLine();               
      int vowCount = 0;
      int consCount = 0;
        
        for (int i = 0; i < ph.length(); i++) 
        {
            char ugx = ph.charAt(i);
                        
            if ((ugx >= 'A' && ugx <= 'Z') || (ugx >= 'a' && ugx <= 'z')) 
            {
                if (ugx == 'A' || ugx == 'E' || ugx == 'I' || ugx == 'O' || ugx == 'U' || 
                    ugx == 'a' || ugx == 'e' || ugx == 'i' || ugx == 'o' || ugx == 'u') 
                {
                    vowCount++;
                } 
                else 
                {
                    consCount++;
                }
            }
        }
        
        if (vowCount > 0 && consCount > 0 && (vowCount % 3 == 0) && (consCount % 5 == 0)) 
        {
            System.out.println("Aaarr! Me Plunder!!");
        } 
        else 
        {
            System.out.println("Blimey! No Plunder!!");
        }      
           sc.close();
    }
}






                                                                   Ans.to the Q.No.-06





import java.util.Scanner;
public class Task_OrderReversing
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The text: ");
    String s = sc.nextLine();
    String e = "";
    String r = "";
    
    for(int l = 0; l < s.length(); l++)
    {
      char aw = s.charAt(l);
      if (aw == ' ')
      {
         if (e.length() > 0) 
         {                    
           r = e +" "+ r;
           e = "";
         }
      }
      else 
      {
        e = e + aw;
      }
    }
    r = e +" "+ r;
    System.out.println(r);
    sc.close();
  }
}






                                                                   Ans.to the Q.No.-07





import java.util.Scanner;
public class Task_UniqueChar
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Lowercase String: ");
    String low_F = sc.nextLine();
    System.out.println("Enter Second Lowercase String: ");
    String low_S = sc.nextLine();
    boolean flag = false;
    String q = "";
    String uppercase = "";
    
    for (int i = 0; i < low_F.length(); i++)
    {
      for (int j = 0; j < low_S.length(); j++)
      {
        if (low_F.charAt(i) == low_S.charAt(j))
        {
          flag=true;
        }
      }
      if (flag == false)
      { 
        q += low_F.charAt(i);
      }
        flag = false ;
    }
    
    for(int k = 0; k < low_S.length(); k++)
    {
      for(int l = 0; l < low_F.length(); l++)
      {
        if(low_S.charAt(k) == low_F.charAt(l))
        {
          flag=true;
        }
      }
      if (flag == false)
      {
        q += low_S.charAt(k);
      }
      flag=false ;
    }
    for (int m = 0; m < q.length(); m++)
    {
      char rgx = q.charAt(m);
      int ascii = (int)rgx;
      
      if(ascii >= 97 && ascii <= 122)
      {
        ascii -= 32;
        uppercase += (char)ascii;
      } 
    }
    System.out.println(uppercase); 
    sc.close();
  }
}







                                                                   Ans.to the Q.No.-08





import java.util.Scanner;
public class Task_SentenceFormat 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a sentence: ");
       String aq = sc.nextLine();        
       String nox = "";
       int count = 0; 

        for (int i = 0; i < aq.length(); i++) 
        {
            char fd = aq.charAt(i);

            if ((fd >= 'a' && fd <= 'z') || (fd >= 'A' && fd <= 'Z')) 
            {
                if (count % 2 == 0) 
                {
                    if (fd >= 'A' && fd <= 'Z') 
                    {
                        fd += 32; 
                    }
                } 
                if (count % 2 != 0) 
                {
                    if (fd >= 'a' && fd <= 'z') 
                    {
                        fd -= 32; 
                    }
                }                
                count++; 
            }
            nox += fd; 
        }        
        System.out.println(nox);
        sc.close();
    }
}







                                                                   Ans.to the Q.No.-09





import java.util.Scanner;
public class Task_StrongPassword 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a password: ");
       String pass = sc.nextLine();
       int count = 0; 
        
        if (pass.length() >= 8) 
        {
          for (int n = 0; n < pass.length(); n++) 
          {
             char qx = pass.charAt(n);                   
              if (qx >= 'A' && qx <= 'Z') 
              {
                 count++;
                 break; 
              }
           }
          
           for (int n = 0; n < pass.length(); n++) 
           {
              char qx = pass.charAt(n);
               if (qx >= 'a' && qx <= 'z') 
               {
                  count++;
                  break; 
               }
            }

           for (int n = 0; n < pass.length(); n++) 
           {
              char qx = pass.charAt(n);
               if (qx >= '0' && qx <= '9') 
               {
                  count++;
                  break; 
               }
           }

           for (int n = 0; n < pass.length(); n++) 
           {
              char qx = pass.charAt(n);
               if (!((qx >= 'A' && qx <= 'Z') && (qx >= 'a' && qx <= 'z') && (qx >= '0' && qx <= '9'))) 
               {
                  count++;
                  break; 
               }
           }
        }       
        if (count == 4) 
        {
          System.out.println("True");
        } 
        else 
        {
          System.out.println("False");
        }
        sc.close();
    }
}






