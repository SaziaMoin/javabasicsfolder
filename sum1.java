
 import java.util.Scanner;
    public class sum1
     {
       public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter 1st and 2nd number");
        int n1=sc.nextInt();

        //System.out.println("enter 2nd number");
        int n2=sc.nextInt();
    
        int sum=n1+n2;
        System.out.println("sum=" +sum);
       // System.out.printf("%d + %d = %d\n",n1,n2,sum);

        sc.close(); // sc.close();---->it is compulsory if you want to take/input a number from user
       } 
    }
