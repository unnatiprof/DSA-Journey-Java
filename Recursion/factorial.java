import java.util.*;
public class factorial {
    int fact(int n)
    {
        if(n==1)
            return 1;
        else return n*fact(n-1);
    }
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want the factorial of: ");
        int n=sc.nextInt();//10

        factorial obj=new factorial();

        
        System.out.println("The factorial of the number is: "+obj.fact(n));
        
    } 
}
