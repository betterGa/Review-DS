/*
public class SubClass
{
    public static void main(String[] args) {
     final StringBuilder s=new StringBuilder("Hello");
     s.append("world");
     System.out.println(s);
    }
}
*/

public class SubClass
{
    public static int testFinally1()
    {
        int result=1;
        try
        {
            result=2;
            return result;
        }
        finally {
            result=3;
            System.out.println("execute finally1");
        }
    }
    public static StringBuffer testfinally2()
    {StringBuffer s=new StringBuffer("Hello");
    try
    {
        return s;
    }

    catch (Exception e)
    {return null;}
    finally {
        s.append("World");
        System.out.println("execute finally2");
    }
    }



    public static void main(String[] args) {
        int resultVal = testFinally1();
        System.out.println(resultVal);
        StringBuffer resultRef = testfinally2();
        System.out.println(resultRef);
    }}