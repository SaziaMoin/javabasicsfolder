public class conditionaloperator 
{
   public static void main(String args[])
   {
    int a=5,b=6,c=7;
        //&& operator
        System.out.println((a>=b)&&(b<c));//false
        System.out.println((a==b)&&(c>b));//false

        // || operator
        System.out.println((a>b)||(b<c));//true
        System.out.println((a==b)||(b<a));//false

        // ! operator
        System.out.println(a!=b);//true
    } 
}
