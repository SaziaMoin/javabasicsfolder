import java.util.Scanner;
public class mcq1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any integer-->");
        int p=sc.nextInt();

         System.out.println("enter sentence-->");
         String q=sc.next();// print single word

         System.out.print(p);
         System.out.println(q);
         sc.close();
         
    }
}
