//
package Stack.LeetCode225;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    MyStack m=new MyStack();
    @Test
    public void test()
    {
        m.push(1);
        m.push(2);
        m.push(3);
        int result=m.top();
        Assert.assertEquals(3,result);

    }

}