package ro.avs;

import java.util.Stack;

class StackSorter<T extends Comparable<T>> {
    Stack<T> sort(Stack<T> input) {
        Stack<T> temporaryStack = new Stack<>();
        while (!input.isEmpty()) {
            T tempElement = input.pop();
            while(!temporaryStack.isEmpty() && temporaryStack.peek().compareTo(tempElement) > 0) {
                input.push(temporaryStack.pop());
            }
            temporaryStack.push(tempElement);
        }
        return temporaryStack;
    }
}
