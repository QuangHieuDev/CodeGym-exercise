package bt;

import java.util.Arrays;
import java.util.Stack;

class wStack{
    public static void main(String[] args) {
        int[] myArr = new int[]{1,2,3,4,5};
        Stack<Integer> myStack = new Stack<>();
        for (int i=0; i< myArr.length; i++){
          myStack.push(myArr[i]);
        }
        System.out.println("Before:");
        System.out.println(Arrays.toString(myArr));

        for (int i = 0; i< myArr.length; i++){
            myArr[i] = myStack.pop();
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(myArr));
    }
}
