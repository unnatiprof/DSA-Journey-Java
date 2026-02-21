
import java.util.*;
public class even_till_n {
    
    void print(int n, int n1)//10,1
    {
        if(n1==n+1)
            return;
        else if(n1%2==0)
        {
            System.out.print(n1+"\t");
            print(n,n1+1);
        }
        else print(n,n1+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();//10

        even_till_n obj=new even_till_n();

        int n1=n-(n-1);//10-9=1
        System.out.println("The even numbers from 1 to "+n+" are printed below:");
        obj.print(n,n1);//10,1
    }
}

