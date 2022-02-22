// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional
// operation getMin() which should return minimum element from the SpecialStack.
// \\ (Expected complexity ­ O(1))


import java.util.Stack;

public class Question3 {
    Stack<Integer> stack = new Stack<Integer>();;
    int min;

    void getMin(){
        if(stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum element is: "+min);
    }

    void push(Integer a)
    {
        if (stack.isEmpty())
        {
            min = a;
            stack.push(a);
            System.out.println("Number Inserted: " + a);
            return;
        }
        if (a < min)
        {
            stack.push(a);
            min = a;
        }
        else
            stack.push(a);

        System.out.println("Number Inserted: " + a);
    }

    void pop()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        int t = stack.pop();
        System.out.println("Top Most Element Removed: "+t);
        if (t == min)
        {
            min = stack.peek();
            Stack<Integer> copy_Stack = (Stack<Integer>) stack.clone();
            // System.out.println("The cloned Stack is: " + copy_Stack);
           int a = 0; //copy_Stack.pop();
            System.out.println("The cloned Stack is: " + copy_Stack);
            while(copy_Stack.size() > 0){
                a = copy_Stack.pop();
                if(a < min)
                    min = a;
            }
        }
        else
            return;
    }

    public static void main(String[] args) {
        Question3 s = new Question3();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.getMin();
    }

 }
