package javaPOC.String;

/**
 * Created by Arpan on 10/10/17.
 */
public class ParenthesisParser {

    public static void main(String[] args) {

        String str = "())(())";
        char arr[] = str.toCharArray();
        int size = arr.length;

        boolean flag = true;

        stack s = new stack(size, new Character[size]);

        for(int i=0 ; i < arr.length ;i++){

            if(arr[i] == '(')
                s.push('(');

            else if(arr[i] == ')') {
                if( null == s.pop()) {
                    System.out.println("No good");
                    flag = false;
                    break;
                }
            }
        }

        if(flag) {
            if (s.display() == null) {
                System.out.println("All good");
            } else {
                System.out.println("No good");
            }
        }
    }
}


class stack {
    final int size;
    Object arr[];
    int arrPos = 0;

    stack(int size) {
        this.size = size;
    }

    stack(int size, Object arr[]) {
        this.arr = arr;
        this.size = size;
    }

    public Object pop() {
        Object retval = null;
        if (arrPos == 0) {
            System.out.println("Elements cannot be poped");
        } else {
            retval = arr[arrPos];
            arrPos--;
        }
        return retval;
    }

    public void push(Object obj) {

        if (size == arrPos - 1) {
            System.out.println("Stack is already full");
            return;
        }
        arr[++arrPos] = obj;
    }

    public Object display() {
        return arr[arrPos];
    }
}