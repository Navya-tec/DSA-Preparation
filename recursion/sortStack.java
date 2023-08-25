package recursion;

import java.util.Stack;

public class sortStack {

    public static Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.

        if(s.isEmpty()){
            return new Stack<>();
        }

        int x=s.pop();

        Stack<Integer>small=sort(s);

            Stack<Integer>dummy=new Stack<>();

            while(!small.isEmpty()&&x>small.peek()){
                dummy.push(small.pop());
            }
            small.push(x);
            while(!dummy.isEmpty()){
                small.push(dummy.pop());
            }

        return small;
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(8);
        s.push(7);
        s.push(5);
        s.push(2);
        s.push(6);

        Stack<Integer>ans=sort(s);
        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }
}
