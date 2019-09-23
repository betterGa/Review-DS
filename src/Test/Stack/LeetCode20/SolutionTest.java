package Stack.LeetCode20;

import org.junit.Assert;
import org.junit.Test;

import java.net.ServerSocket;

import static org.junit.Assert.*;

public class SolutionTest {
Solution s=new Solution();
    @Test
    public void isValid() {
boolean result=s.isValid("[])");
        Assert.assertEquals(false,result);
    }
}