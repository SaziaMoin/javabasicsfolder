import java.util.Scanner;
public class takinginput
 {
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter any number");
    int n=sc.nextInt();

   // System.out.printf("%d=",n);
    System.out.println("number=" +n);

        sc.close(); // sc.close();---->it is compulsory if you want to /takeinput a number from user

   } 
}
