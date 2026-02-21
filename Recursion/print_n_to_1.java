package Recursion;
import java.util.*;
class print_n_to_1
{
    void print(int n)
    {
        if(n==0)
            return;
        else
        {
            System.out.print(n+"\t");
            print(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        print_n_to_1 obj=new print_n_to_1();
        System.out.println("The numbers from 1 to "+n+" are printed below:");
        obj.print(n);
    }
}