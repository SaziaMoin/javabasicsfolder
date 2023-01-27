public class assignmentoperator 
{
    public static void main(String args[])
    {
        int a=10;
        int b;

        b=a;//b=10
        System.out.println(b);

        a+=b;//a=a+b , a=10+10=20
        System.out.println(a);

        a-=b; //a=a-b , a=20-10=10
        System.out.println(a);

        a*=b; // a=a*b , a=10*10=100 
        System.out.println(a);

        a/=b;//a=a/b , a=100/10=10
        System.out.println(a);

        a%=b;//a=a%b , a=10/10=0
        System.out.println(a);
    }
}