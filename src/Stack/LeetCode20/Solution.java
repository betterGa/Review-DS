//栈的应用：括号匹配问题。
//遍历字符串，遇到左括号就进栈，
// 遇到右括号时，若栈不为空，取栈顶的左括号与之匹配，
// 若匹配不成功，返回false,若匹配成功，将当前左括号出栈。
// 若栈为空，说明这个右括号多余了，返回false。
// 遍历完字符串若栈为空，说明匹配完成，返回true(若栈不为空，说明左括号多余了)。


package Stack.LeetCode20;
import java.util.*;

public class Solution {
        public boolean isValid(String s) {
Stack save=new Stack();
            List left=new ArrayList();
            List right=new ArrayList();

            Map<Character,Character> judge=new HashMap<>();
            judge.put('{','}');
            judge.put('[',']');
            judge.put('(',')');
            judge.put('<','>');


left.add('<');
left.add('(');
left.add('[');
left.add('{');
right.add('}');
right.add('>');
right.add(']');
right.add(')');

char[]data=s.toCharArray();

if(data.length==0) return true;
if(data.length==1)return false;
for(int i=0;i<data.length;i++)
{if(left.contains(data[i])) {save.push(data[i]);}
if(right.contains(data[i]))
{if(save.isEmpty())return false;
    if(!save.isEmpty())
{ if(data[i]==judge.get(save.peek()))
    {save.pop(); }
    else return false;
}
}
}
if(save.isEmpty())  return true;
else return false;
        }
}


