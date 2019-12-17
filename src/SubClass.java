public class SubClass
{
    public static void test(StringBuffer ss1,int n)
    {
        ss1.append("World");
        n=8;
    }

    public static void main(String[] args) {
      int i=1;
        StringBuffer s1=new StringBuffer("Hello");
        test(s1,i);
        System.out.println(s1+"i="+i);
    }



}