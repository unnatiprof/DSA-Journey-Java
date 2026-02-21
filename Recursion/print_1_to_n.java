package Recursion;
import java.util.*;
class print_1_to_n
{

    void print(int n)//10, 1
    {
        if(n==0)//1==10
            return;
        else
        {
            
            print(n-1);
            System.out.print(n+"\t");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        print_1_to_n obj=new print_1_to_n();
        System.out.println("The numbers from 1 to "+n+" are printed below:");
        obj.print(n);
    }
}