package Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class myStack{
    int[] arr;
    int cap;
    int top;
    myStack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int num){
        top++;
        arr[top] = num;
    }

    int pop(){
        int res = arr[top];
        top--;
        return res;
    }

    int peek(){
        return arr[top];
    }

    int size(){
        return top + 1;
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void print(){
        System.out.print("[ ");
        for(int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
        System.out.println("]");
    }
}

class TwoStack{
    int[] arr;
    int top1;
    int top2;
    int cap;
    
    TwoStack(int cap){
        this.top1 = -1;
        this.top2 = cap;
        this.cap = cap;
        arr =  new int[cap];
    }

    void push1(int x){
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x){
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
        }
    }

    int pop1(){
        if(top1 >= 0){
            int x = arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2(){
        if(top2 < cap){
            int x = arr[top2];
            top2++;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int peek1(){
        if(top1 >= 0)
            return arr[top1];
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int peek2(){
        if(top2 < cap)
            return arr[top2];
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

}

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(in[i]);
        }

        // StockSpanProblem st = new StockSpanProblem();
        // PreviousGreaterElement st = new PreviousGreaterElement();
        // NextGreaterElement st = new NextGreaterElement();
        LargestAreaRetangle st = new LargestAreaRetangle();
        System.out.println(st.prevSmaller(arr));
        System.out.println(st.nextSmaller(arr));


        // myStack st = new myStack(10);
        // System.out.println("Empty : " + st.isEmpty());
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.print();
        // System.out.println("Empty : " +  st.isEmpty());
        // System.out.println("Size : " + st.size());
        // st.push(4);
        // System.out.println("Peek : " + st.peek());
        // st.push(4);
        // st.print();
        // System.out.println("Popped : " + st.pop());
        // st.push(5);
        // System.out.println("Peek : " + st.peek());
        // st.print();

        br.close();
    }
}
