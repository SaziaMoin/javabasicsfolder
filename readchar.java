import java.util.Scanner;
public class readchar
 {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any word");
     char ch=sc.next().charAt(3);// read start with 0(contain 1st character) 

     System.out.println("character=" +ch);
     System.out.println(); // Sysout
     sc.close();
    }
}
