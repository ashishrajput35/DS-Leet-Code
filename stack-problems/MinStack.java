public class MinStack {

    int top ;
    int[] stackArr ;
    int[] minStackArr;
    int topMin ;
    int n ;

    public MinStack() {

        n = 30000;
        stackArr = new int[n];
        minStackArr = new int[n] ;
        top = -1 ;


    }

    public void push(int val) {
        if (top + 1 < n) {
            top++;
            stackArr[top] = val;
            if (top == 0) {
                minStackArr[top] = val;
            } else {
                minStackArr[top] = Math.min(val, minStackArr[top - 1]);
            }
        }
    }

    public void pop() {
        if (top > -1) {
            top--;
        }
    }

    public int top() {
        if (top > -1) {
            return stackArr[top];
        }
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (top > -1) {
            return minStackArr[top];
        }
        throw new RuntimeException("Stack is empty");
    }


}
