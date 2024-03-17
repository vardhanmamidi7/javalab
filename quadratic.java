package week1;
import java.util.*;
 class root
  {
     public void check(int a,int b,int c)
     {
        int d=(b*b)-4*a*c;
        if(d>0)
        {

            System.out.println("root are distinct");
            int r1=-b+(int)Math.sqrt(d)/(2*a*c);
            int r2=-b-(int)Math.sqrt(d)/(2*a*c);
              System.out.println(r1+" "+r2);
        }
        else if(d==0)
        {
             System.out.println("root are equal");
             int r1=(int)-b/(2*a);
             int r2=(int)-b/(2*a);

               System.out.println(r1+" "+r2);
        
        }
        else
        {
             System.out.println("root are imaginary/complex");
        }
     }

  }
 class quadratic
 {
    public static void main(String args[])
    {
      System.out.println("enter the values of A,B C");
      Scanner scanner=new Scanner(System.in);
      int A=scanner.nextInt();
      int B=scanner.nextInt();
      int C=scanner.nextInt();
      root Root=new root();
      Root.check(A,B,C);
      scanner.close();
    }
    
   
 }