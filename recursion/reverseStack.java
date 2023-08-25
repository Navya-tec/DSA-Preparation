package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class reverseStack {

    public static void reverseStack(Stack<Integer> stack) {
        // write your code here
        if(stack.size()==0){
            return;
        }
        int x=stack.pop();
        reverseStack(stack);

        List<Integer> list=new ArrayList<>();

        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        stack.push(x);
        while(list.size()!=0){
            stack.push(list.remove(list.size()-1));
        }
     return;
    }

    public static void main(String[] args) {
      Stack<Integer>s=new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(5);
      reverseStack(s);
      while(!s.isEmpty()){
          System.out.print(s.pop()+" ");
      }
    }
}
