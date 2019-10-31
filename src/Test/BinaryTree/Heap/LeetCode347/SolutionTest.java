package BinaryTree.Heap.LeetCode347;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    int[]data=new int[]{1,1,1,2,2,3};
    Solution solution=new Solution();
    @Test
    public void topKFrequent() {

    List result=solution.topKFrequent(data,2);
    System.out.println(result);
    }
}