package BinaryTree.Heap.LeetCode347;


import java.util.*;

public class Solution {

class valueAndF implements Comparable
{
    @Override
    public String toString() {
        return "valueAndF{" +
                "value=" + value +
                ", frequecy=" + frequecy +
                '}';
    }

    public valueAndF(int value, int frequecy)
    {this.value=value;
    this.frequecy=frequecy;}
    private int value;
    private int frequecy;


    public int compareTo(Object o) {
if(this.frequecy>((valueAndF)o).frequecy) return 1;
if(this.frequecy==((valueAndF)o).frequecy) return 0;
else return -1;
    }

}

    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue priorityQueue=new PriorityQueue(nums.length+1);
        Map<Integer,valueAndF>keyAndFreq=new HashMap();

        for(int i:nums)
        { if(keyAndFreq.get(i)==null)
            { valueAndF vandf=new valueAndF(i,1);
                keyAndFreq.put(i,vandf);}

                else{int frequecy=keyAndFreq.get(i).frequecy+1;
            valueAndF vandf=new valueAndF(i,frequecy);
            keyAndFreq.put(i,vandf); }}

for(valueAndF i:keyAndFreq.values())
            {if(priorityQueue.size()<k)
                {priorityQueue.add(i);}
               else { priorityQueue.add(i);
                priorityQueue.poll(); }

            }


        List result=new ArrayList<>();
        int[] save=new int[keyAndFreq.size()];
        valueAndF[]v=new valueAndF[keyAndFreq.size()];
        for(int i=0;i<k;i++)
        { v[i]=(valueAndF)priorityQueue.poll();
        save[i]=v[i].value;
        }
for(int i=k-1;i>=0;i--){result.add(save[i]);}
return result;}}